"use strict"

const joinOkForm = document.querySelector('#joinOkForm');
const userId = document.querySelector('#userId');
const userAge = document.querySelector('#userAge');
const userName = document.querySelector('#userName');
const joinOkBtn = document.querySelector('#joinOkBtn');
const idCheckedBtn = document.querySelector("#idCheckedBtn");
const idCh = document.querySelector('.idCh');

idCheckedBtn.addEventListener('click', ()=>{
	const userIdVal = userId.value;
	if(userIdVal==null || userIdVal.length<=0) {
		alert ("이미 사용중인 아이디 Or 공백 없이 입력해주세요");
		userId.focus();
		return false
	}
	
	alert("아이디 중복체크");
	location.href="idChecked.do?userId="+userIdVal;
});


// userId, userAge, userName -> 값을 입력 안하면 팝업 "값을 입력하세요!" 띄우고 다시 입력
// 모두 입력을 하면 form이 정상 실행되도록
	
joinOkBtn.addEventListener('click' ,()=>{
	if(idCh.innerText=="no") {
		alert("아이디 중복체크를 먼저 하세요.");
		idCh.focus();
		return false;
	}
	if(userId==null || userId.value=="" || userId.value<=0) {
		alert("아이디를 입력하세요");
		userId.focus();
		return false;
	}
	if (userAge==null || userAge.value=="" || userAge.value<=0) {
		alert("나이를 입력하세요")
		userAge.focus();
		return false;
	} 
	if (userName==null || userName.value=="" || userName.value<=0) {
		alert("이름을 입력하세요")
		userName.focus();
		return false;
	}
	alert("회원가입 실행");
	joinOkForm.submit();
		
		
});