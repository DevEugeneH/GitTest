package org.study.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String path = request.getContextPath(); // 요청 기본 path
		String uri = request.getRequestURI(); // 요청 기본 uri
		String basicURL = uri.substring(path.length()); // /joinOk.do
		
		System.out.println(basicURL);
		
		if(basicURL.equals("/joinOk.do")) {
			String userId = request.getParameter("userId");
			String userName = request.getParameter("userName");
			String[] phoneArr = request.getParameterValues("phone");
			
			System.out.println(userId);
			System.out.println(userName);
			for(String str : phoneArr) {
				System.out.println(str + " ");
			}
		}
		
	}
}
