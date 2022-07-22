<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체</title>
</head>
<body>
	<%
	page.getClass();
	request.setAttribute("id", "m1111");
	session.setAttribute("sessionId", "admin");
	application.setAttribute("url", "localhost");
	%>

	<%=page%>  <br />
	<%=request%>  <br />
	<%=session%>  <br />
	<%=application%>  <br />
</body>
</html>