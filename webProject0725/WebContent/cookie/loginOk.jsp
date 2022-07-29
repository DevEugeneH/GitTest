<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String id, pw;
	%>
	<%
		id = request.getParameter("id"); //root 입력
		pw = request.getParameter("pw"); //1111입력
		
		// 입력된 ID PW 쿠기 값으로설정
		
		if(id.equals("root") && pw.equals("1111")){
																	//name(cookieId), value(root)
			Cookie cookie = new Cookie("id", id); //접속 아이디가 session 설정
			cookie.setMaxAge(60); // 유지 시간 60초
			response.addCookie(cookie);
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>