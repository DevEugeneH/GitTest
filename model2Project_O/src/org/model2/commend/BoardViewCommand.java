package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;
import org.model2.dto.Board1;

public class BoardViewCommand implements ExcuteCommend{
	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = BoardDao.getInstance();
		
		Board1 boardView = dao.boardView(no);
		
		String url = "";
		
		if(boardView!=null) {
			System.out.println("BoardView Success");
			request.setAttribute("boardView", boardView);
			url = "/boardView.jsp";
		} else {
			System.out.println("BoardView Fail");
			url = "/index.do";
		}
		request.setAttribute("url", url);
	}
}
