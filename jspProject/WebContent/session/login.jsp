<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% 
		String sessionId = (String) session.getAttribute("sessionId");
	
	if(sessionId!=null) {
	response.sendRedirect("index.jsp");		
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	세선아이디 : <%=sessionId %>
	<form action="loginOk.jsp" method="POST">
		아이디 : <input type="text" name="userId" size="10" /> <br />
		비밀번호 : <input type="password" name="userPw" size="10" /> <br />
		<input type="submit" value="로그인" />
	</form>
</body>
</html>