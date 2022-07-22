package org.project.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto0711;

public class MemberSelectCommnad implements MemberCommand{
	@Override
	public void executeQueryCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto0711> lists = dao.lists();
		
		String url = "";
		
		if(lists!=null) {
			System.out.println("success");
			url = "/memberListView.do";
			request.setAttribute("lists", lists);
		} else {
			System.out.println("fail");
			url = "/index.do";
		} 
		request.setAttribute("url", url);
	}
}
