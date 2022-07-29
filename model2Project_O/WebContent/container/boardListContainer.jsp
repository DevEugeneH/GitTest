<%@page import="org.model2.dto.Board1"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Board1> boardList = (ArrayList<Board1>) request.getAttribute("boardList");
%>

<div class="container">
	<div class="inner-container">
		<div class="boardListView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="boardListView-con">
							<div class="search">
								<div class="search-con">
									<form action="search.bo" method="POST" id="searchForm">
											<select name="sel" id="sel">
												<option value="">검색어</option>
												<option value="userId">글쓴이</option>
												<option value="title">글제목</option>
												<option value="content">글내용</option>
											</select>
											<input type="text" name="search" id="search" size="20" maxlength="20" placeholder="검색어입력">
											<input type="button" value="검색" id="searchBtnOk">
										</form>
									</div>
								</div>
						<form action="boardListViewOk.do" method="POST" id="boardListViewForm">
								<table class="table1">
									<thead>
										<tr>
											<th class="t1">글번호</th>
											<th class="t2">글쓴이(아이디)</th>
											<th class="t2">글비밀번호</th>
											<th class="t3">글제목</th>
											<th class="t4">글내용</th>
											<th class="t1">글보기</th>
										</tr>
									</thead>
									<tbody>
										<%
										int i = 0;
										for (Board1 boardLists : boardList) {
											i = ++i;
										%>
										<tr>
											<td class="t1 first"><%=i %></td>
											<td class="t2"><%=boardLists.getUserId() %></td>
											<td class="t2"><%=boardLists.getUserPw() %></td>
											<td class="t3"><%=boardLists.getTitle() %></td>
											<td class="t4"><%=boardLists.getContent() %></td>
											<td class="t1 last"><a href="boardView.bo?no=<%=boardLists.getNo()%>">보기</a></td>
										</tr>	
										<% } %>									
									</tbody>
									<tfoot>
										<tr>
											<td colspan="7">tfoot</td>
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