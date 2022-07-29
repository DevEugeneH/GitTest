package org.project.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberSaleDto;

public class MemberSaleView implements MemberCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberSaleDto> sale = dao.sale();
		
		String url = "";
		
		if(sale!=null) {
			System.out.println("매출 조회 성공");
			url = "memberSaleView.jsp";
			request.setAttribute("sale", sale);
		} else {
			System.out.println("매출 조회 실패");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
