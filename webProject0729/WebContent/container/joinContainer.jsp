<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<div class="inner-container">
		<div class="join">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
							<form action="joinOk.do" method="POST" id="joinOkForm">
								<table>
									<thead>
										<tr>
											<th colspan="2">회원가입</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><label for="userId">아이디</label></td>
											<td><input type="text" name="userId" id="userId" size="20"/></td>
										</tr>
										<tr>
											<td><label for="userAge">나이</label></td>
											<td><input type="text" name="userAge" id="userAge" size="20" /></td>
										</tr>
										<tr>
											<td><label for="userName">이름</label></td>
											<td><input type="text" name="userName" id="userName" size="20"/></td>
										</tr>
									</tbody>
									<tfoot>
										<tr>
											<td colspan="2">
											<input type="reset" value="초기화" />
											<input type="button" value="회원가입" id="joinOkBtn" />
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