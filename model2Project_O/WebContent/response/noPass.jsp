<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noPass</title>
</head>
<body>
<%-- 	<%! int age; %> --%>

<%
	//String str = request.getParameter("age");
	//age = Integer.parseInt(str);
	
	int userAge = Integer.parseInt(request.getParameter("userAge"));
%>

미성년자입니다. 입장 불가입니다.

<a href="response_index.jsp">처음으로 이동</a>
</body>
</html>