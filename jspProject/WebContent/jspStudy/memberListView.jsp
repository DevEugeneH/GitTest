<%@page import="java.util.ArrayList"%>
<%@page import="org.study.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     
    ArrayList<MemberDto> members = new ArrayList<MemberDto>();
    
    members.add(new MemberDto("m1","11","s1",11,"남자"));
    members.add(new MemberDto("m2","21","s2",21,"여자"));
    members.add(new MemberDto("m3","31","s3",31,"남자"));
    members.add(new MemberDto("m4","41","s4",41,"여자"));
    members.add(new MemberDto("m5","51","s5",51,"남자"));
    
    request.setAttribute("members", members);
    
    ArrayList<MemberDto> lists = (ArrayList<MemberDto>) request.getAttribute("members");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디 -->

	<% 
	for(MemberDto member : lists) {
		
	
	%>
		<div>아이디 : <%=member.getUserId() %></div>
		<div>비밀번호 : <%=member.getUserPw() %></div>
		<div>이름 : <%=member.getUserName() %></div>
		<div>나이 : <%=member.getUserAge() %></div>
		<div>성별 : <%=member.getUserGender() %></div>
	<%}
	%>
</body>
</html>