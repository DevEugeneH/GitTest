package org.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length());
		String url = "";
		
		System.out.println(basicURL);
		if(basicURL.equals("/index.do")) {
			request.setAttribute("name", "홈페이지");
			request.setAttribute("url", "/index.jsp");
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("/join.do")) {
			request.setAttribute("name", "회원가입페이지");
			request.setAttribute("url", "/join.jsp");
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("/select.do")) {
			request.setAttribute("name", "회원조회페이지");
			request.setAttribute("url", "/select.jsp");
			url = (String) request.getAttribute("url");
			
		} else if(basicURL.equals("/delete.do")) {
			request.setAttribute("name", "회원삭제페이지");
			request.setAttribute("url", "/delete.jsp");
			url = (String) request.getAttribute("url");
			
		}else if (basicURL.equals("/update.do")) {
			request.setAttribute("name", "회원수정페이지");
			request.setAttribute("url", "/update.jsp");
			url = (String) request.getAttribute("url");
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
