"use strict"

const joinOkForm = document.querySelector('#joinOkForm');
const userId = document.querySelector('#userId');
const userAge = document.querySelector('#userAge');
const userName = document.querySelector('#userName');
const joinOkBtn = document.querySelector('#joinOkBtn')

joinOkBtn.addEventListener('click', ()=> {
	if(userId==null || userId.value=="", userId.value<=0) {
		alert("아이디를 입력하세요");
		userId.focus();
		return false;
	}
	if(userAge==null || userAge.value=="", userAge.value<=0) {
		alert("나이를 입력하세요");
		userAge.focus();
		return false;
	}
	if(userName==null || userName.value=="", userName.value<=0) {
		alert("이름을 입력하세요");
		userName.focus();
		return false;
	}
	joinOkForm.submit();
	alert("회원가입 실행");
});