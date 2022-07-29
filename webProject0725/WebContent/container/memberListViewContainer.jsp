<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.project.command.MemberSearch"%>
<%@page import="java.util.Date"%>
<%@page import="org.project.dto.Member_tbl_02"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ArrayList<Member_tbl_02> member =	(ArrayList<Member_tbl_02>) request.getAttribute("member"); 
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
									<th colspan="7">회원목록조회/수정</th>
								</tr>
								<tr>
									<th>회원번호</th>
									<th>회원성명</th>
									<th>회원전화</th>
									<th>회원주소</th>
									<th>가입일</th>
									<th>고객등급</th>
									<th>도시코드</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<% String grade =""; %>
									<%for(Member_tbl_02 members : member)  {
										//문자열
										%>
								<%-- 		<% Date joinDate = members.getJoinDate();
											SimpleDateFormat sfmt = new SimpleDateFormat("YYYY-MM-DD");
											Date date = sfmt.format(joinDate);
											String joinDate = 
										%> --%>
									<td class="t1"><a href="memberList.do?custNo=<%=members.getCustNo()%>"><%=members.getCustNo()%></a></td>
									<td><%=members.getCustName() %></td>
									<td><%=members.getPhone() %></td>
									<td><%=members.getAddress() %></td>
									<td><%=members.getJoinDate() %></td>
									<td><%if(members.getGrade().equals("A")) {grade="VIP";} 
												else if(members.getGrade().equals("B")) {grade="일반";}
												else if(members.getGrade().equals("C")) {grade="직원";}%><%=grade %></td>
									<td><%=members.getCity() %></td>
								</tr>
							<% } %>
							</tbody>
							<tfoot></tfoot>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>