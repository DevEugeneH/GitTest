package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsert implements MemberCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		String custName = request.getParameter("custName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String joinDate = request.getParameter("joinDate");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.joinCommand(custNo, custName, phone, address, joinDate, grade, city);
		String url = "";
		
		if(rs!=0) {
			System.out.println("회원가입 성공");
			url = "memberListView.do";
		} else {
			System.out.println("회원가입 실패");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
