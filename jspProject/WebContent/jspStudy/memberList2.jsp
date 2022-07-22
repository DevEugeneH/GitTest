<%@page import="org.study.dto.Member_tbl_02"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	ArrayList<Member_tbl_02> member = (ArrayList<Member_tbl_02>) request.getAttribute("member");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	for(Member_tbl_02 members : member) {
%>
	<div>
	고객번호 : <%=members.getCustNo() %> 
	고객이름 : <%=members.getCustName() %>
	전화번호 : <%=members.getPhone() %>
	주소 : <%=members.getAddress() %>
	가입일자 : <%=members.getJoinDate() %>
	고객등급 : <%=members.getGrade() %>
	도시코드 : <%=members.getCity() %>
	</div>
<%
}
%>
</body>
</html>