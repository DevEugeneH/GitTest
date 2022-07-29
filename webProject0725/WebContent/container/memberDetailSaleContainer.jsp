<%@page import="java.util.ArrayList"%>
<%@page import="org.project.dto.MemberDetailSale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberDetailSale> dSale = (ArrayList<MemberDetailSale>) request.getAttribute("dSale");
%>

<div class="container">
	<div class="inner-container">
		<div class="memberDetailSale">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<table>
							<thead>
								<tr>
									<th colspan="4">회원별 구매 목록</th>
								</tr>
								<tr>
									<th>회원번호</th>
									<th>구매일</th>
									<th>상품번호</th>
									<th>구매액</th>
								</tr>
							</thead>
							<tbody>
							<% for(MemberDetailSale dSales : dSale) { %>
							
								<tr>
									<td><%=dSales.getCustNo() %></td>
									<td><%=dSales.getSaleNol() %></td>
									<td><%=dSales.getpCode() %></td>
									<td><%=dSales.getPrice() %></td>
								</tr>
							</tbody>
							<% } %>
							<tfoot></tfoot>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>