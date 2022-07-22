<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!String userId = "m1";
	String userPw = "1111";

	private int power(int base, int exponent) {
		int result = 1;
		for (int cnt = 0; cnt < exponent; cnt++)
			result *= base;
		return result;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2의 거듭제곱</title>
</head>
<body>
	아이디 : <%=userId%>, 비밀번호 :	<%=userPw%> <br />
	2¹ = <%=power(2, 1)%> <br />
	2² = <%=power(2, 2)%> <br />
	2³ = <%=power(2, 3)%> <br />
	2⁴ = <%=power(2, 4)%> <br />
	2⁵ = <%=power(2, 5)%> <br />
</body>
</html>