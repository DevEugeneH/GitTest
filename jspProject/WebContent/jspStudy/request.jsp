<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
  
  	request.setCharacterEncoding("utf-8");
  
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
</head>
<body>

	<form action="<%-- <%=request.getContextPath() %> --%>joinOk.jsp" method="POST">
		ID : <input type="text" name="userId" id="userId" /> <br />
		name : <input type="text" name="userName" id="userName" />	<br />
		phone : 
		<select name="phone" class="phone">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="012">012</option>
		</select> -
		<input type="text" name="phone" id="phone" /> -
		<input type="text" name="phone" id="phone" />
		<br />
		<input type="submit"  value="회원가입(JSP)"/>
		
		
	</form>
</body>
</html>