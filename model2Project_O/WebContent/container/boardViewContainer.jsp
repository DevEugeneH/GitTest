<%@page import="org.model2.dto.Board1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Board1 boardView = (Board1) request.getAttribute("boardView");
%>
<div class="container">
	<div class="inner-container">
		<div class="boardView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="boardView-con">
						<div class="boardView-form">
							<form action="boardListViewOk.do" method="POST" id="boardListViewForm">
								<table class="table1">
									<thead>
										<tr>
											<th>게시글 조회</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td> <label for="no">글번호</label> </td>
											<td> <input type="hidden" name="no" id="no" value="<%=boardView.getNo() %>" />  <span><%=boardView.getNo() %></span></td>
										</tr>						
										<tr>
											<td> <label for="userId">아이디</label> </td>
											<td> <input type="text" name="userId" id="userId" value="<%=boardView.getUserId() %>" /></td>
										</tr>	
										<tr>
											<td> <label for="userPw">글비밀번호</label> </td>
											<td> <input type="text" name="userPw" id="userPw" value="<%=boardView.getUserPw() %>" /></td>
										</tr>	
										<tr>
											<td> <label for="title">글제목</label> </td>
											<td> <input type="text" name="title" id="title" value="<%=boardView.getTitle() %>" /></td>
										</tr>	
										<tr>
											<td> <label for="content">글 내용</label> </td>
											<td> <input type="text" name="content" id="content" value="<%=boardView.getContent() %>" /></td>
										</tr>	
									</tbody>
									<tfoot>
										<tr>
											<td> <a href="index.do">HOME</a>
											<a href="boardListView.bo">목록보기</a>
											<%if(session.getAttribute("sessionId")!=null) { %>
											<input type="button" value="수정하기" id="updateOkBtn" />
											<a href="boardDeleteOk.bo?no<%=boardView.getNo()%>">삭제</a>
											<% } else { %>
											<a href="LoginView.do">Login</a>
											<%} %>
											</td>
										</tr>
									</tfoot>
								</table>
							</form>				
						</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>