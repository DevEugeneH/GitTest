<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<div class="inner-container">
	<div class="login">
		<div class="sections">
			<div class="section sec1">
				<div class="sec-con">
					<form action="./cookie/loginOk.jsp" method="POST">
					<table>
						<thead></thead>
						<tbody>
							<tr>
								<td> <label for="id">아이디</label></td> 
								<td><input type="text" name="id" size="10" /></td>
								<td> <label for="pw">비밀번호</label></td>
								<td><input type="password" name="pw" size="10" /></td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td> <input	type="submit" value="로그인" /></td>
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


