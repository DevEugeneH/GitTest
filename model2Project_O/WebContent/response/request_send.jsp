<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response_send</title>
</head>
<body>
	<%-- <%! int userAge; %> --%>
	
	<%
		/* String str = request.getParameter("userAge");  *///문자열 받는
		/* userAge = Integer.parseInt(str); */ //문자열을 -> 숫자열 형변환
									// toString(); ... 숫자 -> 문자열 형변환
		int userAge = Integer.parseInt(request.getParameter("userAge")); //위의 과정을 한번에 받는 용도
		
		if(userAge >= 20) {
			response.sendRedirect("pass.jsp?userAge=" + userAge);
		} else {
			response.sendRedirect("noPass.jsp?userAge=" + userAge);
		}
	%>
	<%=userAge %>
</body>
</html>