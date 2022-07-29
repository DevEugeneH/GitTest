package org.project.command;

import org.project.dao.MemberDao;
import org.project.dto.MemberDetailSale;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSaleDetail implements MemberCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		
		MemberDao dao = MemberDao.getInstance();
		
		ArrayList<MemberDetailSale> dSale = dao.dSale(custNo);
		
		String url = "";
		
		if(dSale!=null) {
			System.out.println("MemberDetail Sale view Success");
			request.setAttribute("dSale", dSale);
			url = "/memberDetailSale.jsp";
		} else {
			System.out.println("MemberDetail Sale View Fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
}
}
