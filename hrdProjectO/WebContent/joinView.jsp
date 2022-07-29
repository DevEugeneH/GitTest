<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%@include file="./common/header.jsp" %>
	<form action="joinOk.ao" method="POST">
		<label for="userId">ID</label>
		<input type="text" name="userId" id="userId"/>
		<label for="userPw">PW</label>
		<input type="text" name="userPw" id="userPw"/>
		
		<input type="submit" value="회원가입" />
	</form>
<%@include file="./common/footer.jsp" %>
</body>
</html>