"use strict";
const searchForm=document.querySelector('#searchForm');
const sel=document.querySelector('#sel');
const search=document.querySelector('#search');
const searchBtnOk=document.querySelector('#searchBtnOk');

searchBtnOk.addEventListener('click',()=>{
	
	
	
	if(sel==null || sel.value.length<=0){
		alert('select선택오류');
		sel.focus();
		return false;
	}
	
	if(search==null || search.value.length<=0){
		alert('비빌번호입력오류');
		search.focus();
		return false;
	}
	
	
	alert("검색 실행");	
	searchForm.submit();
	
	
	
	
});