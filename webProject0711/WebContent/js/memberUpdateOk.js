"use strict"

const memberUpdateOkForm = document.querySelector('#memberUpdateOkForm');
const memberUpdateBtn = document.querySelector('#memberUpdateBtn');
const userId = document.querySelector('#userId');
const userAge = document.querySelector('#userAge');
const userName = document.querySelector('#userName');
const memberDeleteBtn = document.querySelector('#memberDeleteBtn');


// userId, userAge, userName -> 값을 입력 안하면 팝업 "값을 입력하세요!" 띄우고 다시 입력
// 모두 입력을 하면 form이 정상 실행되도록
	
memberUpdateBtn.addEventListener('click' ,()=>{
	if(userId==null || userId.value=="" || userId.value<=0) {
		alert("아이디를 입력하세요")
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
	alert("회원수정 실행");
	memberUpdateOkForm.submit();
		
		
});

memberDeleteBtn.addEventListener('click' ,()=>{
	

		if(userId==null || userId.value=="" || userId.value<=0) {
			alert("아이디를 입력하세요")
			userId.focus();
			return false;
		}if (userName==null || userName.value=="" || userName.value<=0) {
			alert("이름을 입력하세요")
			userName.focus();
			return false;
		}
	
	
	alert("회원탈퇴 실행");
		
		
});