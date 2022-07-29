package org.project.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberUpdate implements MemberCommand {
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
		int rs = dao.updateDo(custNo, custName, phone, address, joinDate, grade, city);
		
		String url = "";
		
		if(rs!=1) {
			System.out.println("Update Fail");
			url = "index.do";
		} else {
			System.out.println("Update Success");
			url = "memberList.do?custNo="+custNo;
		}
		request.setAttribute("url", url);
		
	}
}
