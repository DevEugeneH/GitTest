<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  	<%-- 세션이 있으면--%>
   <%-- HOME, update, logout, 시션 이름 --%>
   <%-- 세션이 없으면--%>
   <%-- HOME, list, join, login --%>
<div class="header">
	<div class="inner-header">
		<div class="nav">	
		<h1 class="logo"><a href="#"> LOGO</a></h1>
   
   	<div class="gnb">
   		<ul>
   		
   		<%
   			String sessionId = (String) session.getAttribute("sessionId");
   		if( sessionId != null) {
   			%>
   		
   			<li><a href="index.jsp">MENU</a></li>
   			<li><a href="#">LIST</a></li>
   			<li><a href="#">UPDATE</a></li>
   			<li><a href="logout.jsp">LOGOUT</a></li>
   			<li><%=sessionId %>님</li>
   		
   		<% }else{
   			
   		
   			%>
   			<li><a href="index.jsp">MENU</a></li>
   			<li><a href="#">LIST</a></li>
   			<li><a href="join.jsp">JOIN</a></li>
   			<li><a href="login.jsp">LOGIN</a></li>
   		
   		<%} %>
   		
   		
   		</ul>
   	</div>
		</div>
	</div>
</div>