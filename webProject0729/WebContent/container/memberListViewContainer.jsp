<%@page import="org.project.dto.Member0729"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	ArrayList<Member0729> list = (ArrayList<Member0729>) request.getAttribute("list");
%>    

<div class="container">
	<div class="inner-container">
		<div class="memberListView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<table>
							<thead>
								<tr>
									<th>아이디</th>
									<th>나이</th>
									<th>이름</th>
								</tr>
							</thead>
							<tbody>
								<%for(Member0729 lists : list) {%>
									<tr>
										<td><%=lists.getUserId() %></td>
										<td><%=lists.getUserAge() %></td>
										<td><%=lists.getUserName() %></td>
									</tr>
								<%} %>
							</tbody>
							<tfoot></tfoot>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>