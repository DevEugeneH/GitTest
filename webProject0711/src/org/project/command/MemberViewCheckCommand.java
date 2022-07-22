package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto0711;

public class MemberViewCheckCommand implements MemberCommand{
	@Override
	public void executeQueryCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		MemberDao dao = MemberDao.getInstance();
		MemberDto0711 member = dao.memberViewCheck(userId, userName);
		String url = "";
		
		if(member!=null) {
			System.out.println("success");
			request.setAttribute("member", member);
			url= "/memberView.do";
		} else {
			System.out.println("fail");
			url = "/memberListView.do";
		}
		request.setAttribute("url", url);
	}
	
}
