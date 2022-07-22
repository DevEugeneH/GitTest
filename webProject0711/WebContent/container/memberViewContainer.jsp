<%@page import="org.project.dto.MemberDto0711"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%MemberDto0711 member = (MemberDto0711) request.getAttribute("member"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="inner-container">
			<div class="memberView">
				<div class="sections">
					<div class="section sec1">
						<div class="sec-con">
							<div class="memberView-con">
								<form action="memberUpdateOk.do" method="POST" id="memberUpdateOkForm">
									<h1 class="title">MEMBER DETAIL</h1>
									<div class="form-con">
										<ul>
											<li>
											<label for="userId">아이디</label> <input type="hidden"	name="userId" id="userId" value="<%=member.getUserId() %>" />
											<span><%=member.getUserId() %></span>
											</li>
											<li>
											<label for="userAge">나이</label>
											<input type="text" name="userAge" id="userAge" value="<%=member.getUserAge() %>" />
											</li>
											<li>
											<label for="userName">이름</label>
											<input type="text" name="userName" id="userName"value="<%=member.getUserName() %>" />
											</li>
											<li class="c2">
											<a href="index.do">HOME</a>
											<input type="button" value="회원수정" id="memberUpdateBtn" formaction="memberUpdateOk.do" />
											<a id="memberDeleteBtn" href="memberDeleteOk.do?userId=<%=member.getUserId()%>">삭제</a>
											<a href="memberDeleteView.do?userId=<%=member.getUserId()%>">삭제페이지</a>
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