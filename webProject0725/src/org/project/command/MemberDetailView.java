package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.Member_tbl_02;

public class MemberDetailView implements MemberCommand {
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		MemberDao dao = MemberDao.getInstance();

		Member_tbl_02 member = dao.detail(custNo);
		
		String url = "";
		
		if(member!=null) {
			System.out.println("Detail View Success");
			request.setAttribute("member", member);
			url = "/memberList.jsp";
		} else {
			System.out.println("Detail View Fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
