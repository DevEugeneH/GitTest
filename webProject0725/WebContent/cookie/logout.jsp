<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		// 쿠키 삭제
	if(cookies!=null) {
		for(int i = 0; i<cookies.length; i++) {
			if(cookies[i].getValue().equals("root")){
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		}
	}
		
		response.sendRedirect("cookietest.jsp");
	%>
</body>
</html>