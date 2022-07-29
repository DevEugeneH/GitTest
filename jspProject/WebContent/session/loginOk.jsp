<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%!
	String userId;
	String userPw;
%> --%>

<%
	String userId = request.getParameter("userId"); //root
	String userPw = request.getParameter("userPw"); //1111
	
	if(userId.equals("root") && userPw.equals("1111")) {
		session.setAttribute("sessionId", userId);
		session.setMaxInactiveInterval(60*60);
		response.sendRedirect("welcome.jsp");
		
	} else {
		response.sendRedirect("login.jsp");
	}
%>
