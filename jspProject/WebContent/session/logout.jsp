<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
		Enumeration enumeration = session.getAttributeNames();
	
	while(enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		if(sValue.equals("root")){
			session.removeAttribute(sName);
		}
	}
	%>
</body>
<a href="sessiontest.jsp">sessionTest</a>
<a href="index.jsp">index</a>
</html>