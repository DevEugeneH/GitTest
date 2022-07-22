<%@page import="org.project.dto.MemberDto0711"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<MemberDto0711> lists = (ArrayList<MemberDto0711>) request.getAttribute("lists");
%>
<div class="container">
	<div class="inner-container">
		<div class="memberListView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="memberListView-con">
						<h1 class="title">MEMBERLIST</h1>
							<table>
								<thead>
									<tr>
									<th>아이디</th>
									<th>나이</th>
									<th>이름</th>
									<th class="la1">상세보기</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<%
											for(MemberDto0711 list : lists) {
										%>
										<td><%=list.getUserId() %></td>
										<td><%=list.getUserAge() %></td>
										<td><%=list.getUserName() %></td>
										<td class="la1"><a href="memberCheck.do?userId=<%=list.getUserId()%>">보기</a></td>
									</tr>
									<%	
									}
									 %>
								</tbody>
								<tfoot>
								</tfoot>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
