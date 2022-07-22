<%@page import="org.project.dto.MemberDto0711"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String userId = (String) request.getAttribute("userId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 확인</title>
</head>
<body>
	<div class="container">
		<div class="inner-container">
			<div class="memberViewCheck">
				<div class="sections">
					<div class="section sec1">
						<div class="sec-con">
							<div class="memberViewCheck-con">
								<form action="memberViewCheck.do" method="POST"	id="memberViewCheckForm">
									<h1 class="title">MEMBER CHECK</h1>
									<div class="form-con">
										<ul>
											<li><label for="userId">아이디</label> <input type="hidden"
												name="userId" id="userId" value="<%=userId %>" />
												<span><%=userId %></span></li>
											<li><label for="userName">이름</label>
											<input type="text" name="userName" id="userName"	value="" /></li>
											<li class="c2">
												<a href="index.do">HOME</a>
												<a href="memberListView.do">회원목록</a>												
												<input type="button" value="정보 확인" id="memberCheckBtn" />
											</li>
										</ul>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>