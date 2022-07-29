<%@page import="org.project.dto.MemberSaleDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberSaleDto> sale = (ArrayList<MemberSaleDto>) request.getAttribute("sale");
%>

<div class="container">
	<div class="inner-container">
		<div class="memberSaleView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
							<table>
								<thead>
									<tr>
										<th colspan="4">매출목록</th>
									</tr>
									<tr>
										<th>회원번호</th>
										<th>회원성명</th>
										<th>고객등급</th>
										<th>매출액</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<%
											String grade = "";
										for(MemberSaleDto sales : sale) {
										%>
										<td><a href="memberDetailSale.do?custNo=<%=sales.getCustNo()%>"><%=sales.getCustNo() %></a></td>
										<td><%=sales.getCustName() %></td>
										<td><%if(sales.getGrade().equals("A")){grade="VIP";}
													else if(sales.getGrade().equals("B")) {grade="일반";}
													else if(sales.getGrade().equals("C")) {grade="직원";}%><%=grade %></td>
										<td><%=sales.getPrice() %></td>
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