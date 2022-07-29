<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="myBean" class="com.LoginBean" />
<jsp:setProperty property="userId" name="myBean" value="root" />
<jsp:setProperty property="userPw" name="myBean" value="1234" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setProperty 실습</title>
</head>
<body>
	<h1>setProperty 실습</h1>

	사용자 아이디 :	<%=myBean.getUserId()%> <br />
	사용자 비밀번호 : <%=myBean.getUserPw()%>	<br />

</body>
</html>