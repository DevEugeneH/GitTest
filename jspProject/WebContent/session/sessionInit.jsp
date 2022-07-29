<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<% 
		session.setAttribute("root1", "jsp1");
		session.setAttribute("rootNUM", 12345);
		session.setAttribute("rootPW", 11111);
	%>	
	
	<a href="sessionget.jsp">session get</a>
</body>
</html>