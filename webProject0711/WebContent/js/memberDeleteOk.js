const memberDeleteOkForm = document.querySelector('#memberDeleteOkForm');
const memberDeleteBtn = document.querySelector('#memberDeleteBtn');
const userId = document.querySelector('#userId');
const userName = document.querySelector('#userName');



// userId, userAge, userName -> 값을 입력 안하면 팝업 "값을 입력하세요!" 띄우고 다시 입력
// 모두 입력을 하면 form이 정상 실행되도록
	
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
	memberDeleteOkForm.submit();
	
});