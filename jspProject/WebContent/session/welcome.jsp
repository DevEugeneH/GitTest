<%@page import="java.util.Enumeration"%>
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
		// 모든 session을 get
		Enumeration enumeration = session.getAttributeNames();
		// session이 설정되어 있으면
	while(enumeration.hasMoreElements()) {
		// "sessionId -> session의 이름 (name)"
		String sName = enumeration.nextElement().toString();
		// root -> session의 이름의 값(value)
		String sValue = (String)session.getAttribute(sName);
		if(sValue.equals("root")){
			out.println(sValue + "님 안녕하세요" + "<br />");
		}
	}
	%>
	<a href="sessiontest.jsp">sessionTest</a>
	<a href="logout.jsp">로그아웃</a>
	<a href="index.jsp">index</a>
</body>
</html>