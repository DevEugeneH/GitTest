<%@page import="com.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%--  <%
  	LoginBean myBean = new LoginBean();
  %> --%>
 <jsp:useBean id="myBean" class="com.LoginBean" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean 실습</title>
</head>
<body>
	<%
		myBean.setUserId("test");
		myBean.setUserPw("1234");
	%>
	
	사용자 아이디 : <%=myBean.getUserId() %> <br />
	사용자 비밀번호 : <%=myBean.getUserPw() %> <br />	
	
	
	
</body>
</html>