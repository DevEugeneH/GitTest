<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward_param</title>
</head>
<body>
	<%
		String id = request.getParameter("id"); //name 값
		String pw = request.getParameter("pw");
	%>
	
	<h1>forward_param.jsp 입니다.</h1>
	아이디  <%=id%> <br />
	비밀번호 <%=pw %> 
</body>
</html>