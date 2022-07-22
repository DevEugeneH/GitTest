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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="inner-container">
			<div class="memberDeleteView">
				<div class="sections">
					<div class="section sec1">
						<div class="sec-con">
							<div class="memberDeleteView-con">
								<form action="memberDeleteOk2.do" method="POST"	id="memberDeleteOkForm">
									<h1 class="title">MEMBER DELETE</h1>
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
												<input type="button" value="회원 삭제" id="memberDeleteBtn" />
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