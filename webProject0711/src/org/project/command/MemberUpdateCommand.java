package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberUpdateCommand implements MemberCommand{
	@Override
	public void executeQueryCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		int userAge = Integer.parseInt(request.getParameter("userAge"));
		String userName = request.getParameter("userName");
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDO(userId, userAge, userName);
		
		String url = "";
		
		if (rs!=1) {
			System.out.println("fail");
			url = "/memberListView.do";
		} else {
			System.out.println("success");
			url = "/memberView.do?userId="+userId; 
		}
		request.setAttribute("url", url);
	}
}
