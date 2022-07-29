<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
		Object obj1 = session.getAttribute("root1");
		String mySessionName = (String) obj1;
		out.println(mySessionName + "<br />");
		
		Object obj2 = session.getAttribute("rootNUM");
		Integer myNum = (Integer)obj2;
		
		/* int sessionId2 = (int) session.getAttribute("rootNUM"); */
		
		out.println(myNum + "<br />");
		
		Object obj3 = session.getAttribute("rootPW");
		Integer MyNum2 = (Integer)obj3;
		out.println(MyNum2 + "<br />");
		
		out.println("=========================== <br />");
		
		
		String sName;
		String sValue;
		
		Enumeration enumeration = session.getAttributeNames();
		
		while (enumeration.hasMoreElements()){
			sName = enumeration.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("sName : " + sName + ", sValue : " + sValue + "<br />");
		}
		out.println("====================== <br />");
		
		//WAS 자동으로  1개 설정... 30분
		String sessionID = session.getId();
		out.println("sessionID :" + sessionID + "<br />");
		
		int sessionInter = session.getMaxInactiveInterval();
		out.println("sessionInter : " + sessionInter + "<br />");
		
		session.removeAttribute("root1");
		Enumeration enumeraion1 = session.getAttributeNames();
		
		while(enumeraion1.hasMoreElements()) {
			sName = enumeraion1.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("sName : " + sName + "<br />");
			out.println("sValue : " + sValue + "<br />" );
		}
		
		out.println("====================== <br />");
		
		session.invalidate();
		
		if(request.isRequestedSessionIdValid()) {
			out.println("session valid");
		} else {
			out.println("session invalid");
		}
		
	%>
</body>
</html>