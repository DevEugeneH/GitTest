<%@page import="java.util.ArrayList"%>
<%@page import="org.study.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	ArrayList<MemberDto> members = new ArrayList<MemberDto>();
	members.add(new MemberDto("m1", "1111", "m1Name", 11, "남"));
	members.add(new MemberDto("m2", "2111", "m2Name", 21, "여"));
	members.add(new MemberDto("m3", "3111", "m3Name", 31, "여"));
	members.add(new MemberDto("m4", "4111", "m4Name", 41, "남"));
	members.add(new MemberDto("m5", "5111", "m5Name", 51, "남"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression(표현식)</title>
</head>
<body>
	<div class="member">
		<ul>
			<%
				for (MemberDto list : members) {
			%>
			<li>
			<span> 아이디 : <%=list.getUserId()%></span>
			<span>비밀번호 : <%=list.getUserPw()%></span>
			<span> 이름 : <%=list.getUserName()%>	</span>
			<span>이름 : <%=list.getUserName()%></span>
			<span>나이 : <%=list.getUserAge()%>	</span>
			<span>성별 : <%=list.getUserGender()%></span> 
			</li> 
			<%
				}
			%>
		</ul>
	</div>
</body>
</html>