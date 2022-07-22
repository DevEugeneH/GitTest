<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	String userId = request.getParameter("userId");    	
	String userName = request.getParameter("userName");    	
	String[] phoneArr = request.getParameterValues("phone");
	
	String phone = "";
	for(String str : phoneArr) {
		phone+=""+str;
	}
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinOk.jsp</title>
</head>
<body>
	id: <%=userId %> <br /> 
	name : <%=userName %> <br /> 
	전화번호 : <%=phone %> <br />
	
	<% 	Enumeration en = request.getParameterNames();
		while(en.hasMoreElements()){
		String name = en.nextElement().toString();
		out.println(name);
	} %>
	
	<br />
	쿠키 : <%=request.getCookies() %> <br /> <!-- 쿠기, 로그인 **** -->
	전송방식 : <%=request.getMethod() %> <br />
	세션 : <%=request.getSession() %> <br /> <!-- 세션, 로그인 **** -->
	IP : <%=request.getRemoteAddr() %> <br />
	프로토콜 : <%=request.getProtocol() %> <br />
	서버호스트 : <%=request.getServerName() %> <br />
	요청 URI : <%=request.getRequestURI() %> <br /> <!-- 요청 URI **** -->
 	쿼리 : <%=request.getQueryString() %> <br />   
	요청에 대한 기본 패스 : <%=request.getContextPath() %> <br />  <!-- 요청 기본 패스 **** -->
	요청 캐릭터셋 : <%=request.getCharacterEncoding() %> <br />
	문자열 name에 저장된 해더정보 : <%=request.getHeader("host") %> <br />
	
</body>
</html>