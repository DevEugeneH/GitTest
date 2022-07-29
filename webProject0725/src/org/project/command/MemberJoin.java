package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberJoin implements MemberCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDao dao = MemberDao.getInstance();
		int custNo = dao.custNoMax();
		
		String url = "";
		if(custNo!=0) {
			System.out.println("회원가입 창 보기 성공");
			request.setAttribute("custNo", custNo);
			url = "join.jsp";
		} else {
			System.out.println("회원가입 창 보기 실패");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
