<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	session.setAttribute("sessionId", "admin");
	String sessionId = (String) session.getAttribute("sessionId");
	// 세션 아이디가 admin이면  
	if(!sessionId.equals("admin")) {
		out.write("<script>");
		out.write("alert('관리자만 이용할 수 있습니다.');");
		out.write("location.href='https://naver.com'");
		out.write("</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet(스크립트릿)</title>
</head>
<body>
	<h1>관리자페이지</h1>
	<span>관리자 아이디 : <%=sessionId %></span> <br />
	
	<% 
		int total = 0;
	for (int i = 1; i<=100; i++) {
		total += i;
	}
	%>
	<div> 1부터 100까지의 합 = <%=total %> </div>
	<%
		for (int i =101; i<=200; i++) {
			total+=i;
		}
	%>
	<div>1부터 200까지의 합 = <%=total %></div>
</body>
</html>