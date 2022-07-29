<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = (String) session.getAttribute("sessionId");
%>
<div class="header">
	<div class="inner-header">
		<div class="nav">
			<h1 class="logo">Logo</h1>
			<div class="bottom-nav">
				<div class="gnb">
					<ul>
					<li><a href="index.ao">HOME</a></li>
						<li><a href="#">MENU</a></li>
						<li><a href="#">MENU</a></li>
					<%if(sessionId!=null) {%>
						<li><a href="logout.ao">logout</a></li>
						<li><a href="update.ao">회원수정</a></li>
						<li><%=sessionId%>님 환영합니다.</li>
						<%if(sessionId.equals("admin")) { %>
						<li><a href="admin_Main.ao">관리자페이지</a></li>
					<%}}else { %>
						<li><a href="joinView.ao">join</a></li>
						<li><a href="loginView.ao">login</a></li>
					 <% } %>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>