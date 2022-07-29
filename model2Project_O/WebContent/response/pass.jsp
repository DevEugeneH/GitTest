<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pass</title>
</head>
<body>
	<%-- <%! int userAge; %> --%>

	<%
		// String str= request.getParameter("userAge");
		// userAge = Integer.parseInt(str);
		
		int userAge = Integer.parseInt(request.getParameter("userAge"));
	%>
	성인 입니다. 입장 가능합니다.
	<a href="response_index.jsp">처음으로 이동</a>
</body>
</html>