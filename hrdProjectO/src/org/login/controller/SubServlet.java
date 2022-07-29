package org.login.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class SubServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		ServletConfig config = getServletConfig();

		String driver = config.getServletContext().getInitParameter("driver");
		String url2 = config.getServletContext().getInitParameter("url2");
		String user = config.getServletContext().getInitParameter("user");
		String password = config.getServletContext().getInitParameter("password");
		
		System.out.println("초기화 파라미터 : " + driver);
		System.out.println("초기화 파라미터 : " + url2);
		System.out.println("초기화 파라미터 : " + user);
		System.out.println("초기화 파라미터 : " + password);
		
		// 특정 서블릿 초기화 파라미터
		String userId = config.getInitParameter("userId");
		String userPw = config.getInitParameter("userPw");
		
		System.out.println("초기화 파라미터 : " + userId);
		System.out.println("초기화 파라미터 : " + userPw);
		
	}
}
