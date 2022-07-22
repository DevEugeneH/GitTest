package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto0711;

public class MemberViewCommand implements MemberCommand{
	@Override
	public void executeQueryCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		MemberDao dao = MemberDao.getInstance();
		MemberDto0711 member = dao.memberView(userId);
		String url = "";
		
		if(member!=null) {
			System.out.println("success");
			request.setAttribute("member", member);
			
			System.out.println(member.getUserId());
			System.out.println(member.getUserAge());
			System.out.println(member.getUserName());
			url= "/memberView.do";
		} else {
			System.out.println("fail");
			url = "/memberListView";
		}
		request.setAttribute("url", url);
	}
	
}
