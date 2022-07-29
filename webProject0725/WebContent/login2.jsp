<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action="loginOk.ao" method="POST">
		<label for="userId">ID</label>
		<input type="text" name="userId" id="userId"/>
		<label for="userPw">PW</label>
		<input type="text" name="userPw" id="userPw"/>
		
		<input type="submit" value="로그인" />
	</form>
</body>
</html>