<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JoinContainer</title>
</head>
<body>
	<div class="container">
		<div class="inner-container">
			<div class="join">
				<div class="sections">
					<div class="section sec1">
						<div class="sec-con">
							<div class="join-con">
								<form action="joinOk.do" method="POST" id="joinOkForm">
									<h1 class="title">MEMBER JOIN</h1>
									<div class="form-con">
										<ul>
											<li class="c1">
												<label for="userId">아이디<span class="idCh" style="font-size:0">no</span></label>
												<input type="text" name="userId" id="userId" />
												<input type="button" value="중복체크" id="idCheckedBtn"/>
											</li>
											<li class="c1">
												<label for="userAge">나이</label>
												<input type="text" name="userAge" id="userAge" />
											</li>
											<li class="c1">
												<label for="userName">이름</label>
												<input type="text" name="userName" id="userName" />
											</li>
											<li class="c2">
												<a href="index.do">HOME</a>
												<input type="reset" value="취소" />
												<input type="button" value="회원가입실행" id="joinOkBtn"/>
											</li>
										</ul>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>