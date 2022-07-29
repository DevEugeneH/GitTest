<%@page import="java.util.ArrayList"%>
<%@page import="org.project.dto.Member_tbl_02"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% 
 	Member_tbl_02 member = (Member_tbl_02) request.getAttribute("member");
 %>
<div class="container">
	<div class="inner-container">
		<div class="memberList">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<form action="updateOk.do" method="POST" id="updateForm">
							<table>
								<thead>
									<tr >
										<th colspan="2">
										<h1>홈쇼핑 회원 정보 수정</h1>
										</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td> <label for="custNo">회원번호(수정불가)</label> </td>
										<td><input type="hidden" id="custNo" name="custNo" value="<%=member.getCustNo() %>" />
											<span><%=member.getCustNo() %></span>
										</td>
									</tr>
										<tr>
											<td> <label for="custName">회원이름</label> </td>
											<td><input type="text" name="custName" id="custName" value="<%=member.getCustName() %>" /></td>
										</tr>
										<tr>
											<td> <label for="phone">회원전화</label> </td>
											<td><input type="text" name="phone" id="phone" value="<%=member.getPhone()%>" /></td>
										</tr>
										<tr>
											<td> <label for="address">회원주소</label> </td>
											<td><input type="text" name="address" id="address" value="<%=member.getAddress() %>" /></td>
										</tr>
										<tr>
											<td> <label for="joinDate">가입일</label> </td>
											<td><input type="text" name="joinDate" id="joinDate" value="<%=member.getJoinDate() %>" /></td>
										</tr>
										<tr>
											<td> <label for="grade">고객등급(A:VIP, B:일반, C:직원)</label> </td>
											<td><input type="text" name="grade" id="grade" value="<%=member.getGrade() %>" /></td>
										</tr>
										<tr>
											<td> <label for="city">도시코드</label> </td>
											<td><input type="text" name="city" id="city" value="<%=member.getCity() %>" /></td>
										</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="7">
											<input type="button" value="수정" id="updateOkBtn" class="s1" />
											<input type="button" value="조회" id="memberListViewBtn" class="s1" />
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