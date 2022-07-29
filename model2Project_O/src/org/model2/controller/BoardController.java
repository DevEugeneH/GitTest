package org.model2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.commend.BoardListViewCommend;
import org.model2.commend.BoardViewCommand;
import org.model2.commend.BoardWriteCommend;
import org.model2.commend.ExcuteCommend;

@WebServlet("*.bo")
public class BoardController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String url = "";
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		ExcuteCommend command =null;
		
		System.out.println(basicURL);
		
		if(basicURL.equals("boardListView")) {
			command = new BoardListViewCommend();
			command.ExcuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}else if(basicURL.equals("boardWrite")) {
			command = new BoardWriteCommend();
			command.ExcuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		} else if(basicURL.equals("boardView")) {
			command = new BoardViewCommand();
			command.ExcuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
				
	}
}
