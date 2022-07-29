<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver = config.getServletContext().getInitParameter("driver");
		String url = config.getServletContext().getInitParameter("url");
		String user = config.getServletContext().getInitParameter("user");
		String password = config.getServletContext().getInitParameter("password");
	
		out.write("<h3>초기화 파라미터  driver : " + driver +"</h3>");
		out.write("<h3>초기화 파라미터 url : " + url + "</h3>");
		out.write("<h3>초기화 파라미터 user : " + user + "</h3>");
		out.write("<h3>초기화 파라미터 password : " + password + "</h3>");
		
	%>
	<h3>초기화 파라미터 :driver -> <%=driver %></h3>
	<h3>초기화 파라미터 url  -> <%=url%></h3>
	<h3>초기화 파라미터 user -> <%=user %></h3>
	<h3>초기화 파라미터 password -> <%=password %> </h3>
</body>
</html>