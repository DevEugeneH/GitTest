<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sub1</title>
</head>
<body>
	<%
												// cookie get 방식
		Cookie[] cookies = request.getCookies();
	
		for(int i = 0; i<cookies.length; i++) {
			String id = cookies[i].getValue(); // cookie 값을 가져온다
			if(id.equals("root")) out.println(id + "님 안녕하세요" + "<br />");
		}
	%> 

</body>
</html>