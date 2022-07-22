package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberIdCheck implements MemberCommand{
	@Override
	public void executeQueryCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		MemberDao dao = MemberDao.getInstance();
		int member = dao.idChecked(userId);
		String url = "";
		
		if(member==0) {
			System.out.println("사용가능한 아이디");
			url= "/join.do";
		} else {
			System.out.println("사용불가능한 아이디");
			url = "/join.do";
		}
		request.setAttribute("url", url);
	}
	
}
