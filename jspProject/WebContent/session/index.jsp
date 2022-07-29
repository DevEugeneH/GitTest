<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sessionId = (String) session.getAttribute("sessionId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>

	<%
		if(sessionId!=null) {
	%>
	<%-- 세션값이 있으면 --%>
	<a href="logout.jsp">로그아웃</a>
	<span><%=sessionId %></span>
	<%		
		}else {
			 %>
	<%-- 세션값이 없으면 --%>
	<a href="login.jsp">로그인</a>
	<%
	}
	%>

</body>
</html>