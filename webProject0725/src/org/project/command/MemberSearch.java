package org.project.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.Member_tbl_02;

public class MemberSearch implements MemberCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDao dao = MemberDao.getInstance();
		ArrayList<Member_tbl_02> member= dao.member();
		
		String url ="";
		
		if(member!=null) {
			System.out.println("search success");
			url = "memberListView.jsp";
			request.setAttribute("member", member);
		} else {
			System.out.println("search fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
