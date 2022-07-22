<%@page import="java.util.Date"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <% 
   	
   %>
  <%
  	request.setCharacterEncoding("utf-8");
  	String driver = "oracle.driver.jdbc.OracleDriver";
  	String url = "jdbc:oracle:thin:@localhost:1521:xe";
  	String user= "system";
  	String password = "1234";
  	
  	Connection conn = null;
  	PreparedStatement pstm = null;
  	String query = "";
  	int rs = 0;
  	
  	int custNo =  Integer.parseInt(request.getParameter("custNo")); 
  	 String custName = request.getParameter("custName");
		 String phone = request.getParameter("phone");
		 String address = request.getParameter("address");
		 String joinDate = request.getParameter("joinDate");
		 String grade = request.getParameter("grade");
		 String city = request.getParameter("city"); 
  	
  	try {
  		Class.forName(driver);
  		conn = DriverManager.getConnection(url, user, password);
  		query = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
  		
  		pstm = conn.prepareStatement(query);
  		
  		pstm.setInt(1, custNo);
  		pstm.setString(2, custName);
  		pstm.setString(3, phone);
  		pstm.setString(4, address);
  		pstm.setString(5, joinDate);
  		pstm.setString(6, grade);
  		pstm.setString(7, city);
  		
  		rs = pstm.executeUpdate();
  		
  	} catch (Exception e){
  		e.printStackTrace();
  	} finally{
  		try{
  		if(conn!=null) conn.close();
  		if(pstm!=null) pstm.close();  			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally{
  			
  		}
  	}
	
  %>
