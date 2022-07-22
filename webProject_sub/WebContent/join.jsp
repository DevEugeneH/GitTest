<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   String name = (String) request.getAttribute("name");
    String url = (String) request.getAttribute("url");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="join.do">회원가입</a> <a href="index.do">HOME</a> <a
			href="update.do">회원수정</a> <a href="delete.do">회원삭제</a> <a
			href="select.do">회원조회</a>
	</div>
	<div>
	이름 : <%=name %> <br />
	URL : <%=url %>
	</div>
</body>
</html>