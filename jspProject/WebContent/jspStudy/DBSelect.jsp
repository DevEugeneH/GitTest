<%@page import="org.study.dto.Member_tbl_02"%>
<%@page import="org.study.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//Connection 연동
	// DB 연동
	// 쿼리 실행
	
	ArrayList<Member_tbl_02> member = new ArrayList<Member_tbl_02>();
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";

	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String query = "";
	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		query = "select * from member_tbl_02 order by custNo asc";
		
		pstm = conn.prepareStatement(query);
		
		rs = pstm.executeQuery();
		
		while(rs.next()){
			int custNo = rs.getInt(1);
			String custName = rs.getString(2);
			String phone = rs.getString(3);
			String address = rs.getString(4);
			Date joinDate = rs.getDate(5);
			String grade = rs.getString(6);
			String city = rs.getString(7);
			
			member.add(new Member_tbl_02(custNo, custName, phone, address, joinDate, grade, city));
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally{
		
		try{
			if(conn!=null) conn.close();
		if(pstm!=null) pstm.close();
		if(rs!=null) rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			
		}
	} 
	String url2 = "memberList2.jsp";
	request.setAttribute("member", member);
	
RequestDispatcher dispatcher = request.getRequestDispatcher(url2);
	dispatcher.forward(request, response); 
	
	
%>

<%-- <%
	for(Member_tbl_02 members : member) {
%>
	<div>고객번호 : <%=members.getCustNo() %> 고객이름 : <%=members.getCustName() %>
	전화번호 : <%=members.getPhone() %> 주소 : <%=members.getAddress() %>
	가입일자 : <%=members.getJoinDate() %> 고객등급 : <%=members.getGrade() %>
	도시코드 : <%=members.getCity() %></div>


<%
}
%> --%>