package org.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.command.JoinCommand;
import org.login.command.LoginCheckCommand;
import org.login.command.LogoutCommand;
import org.login.command.loginCommand;

@WebServlet("*.ao")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		request.setCharacterEncoding("UTF-8");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		String path = request.getContextPath();
		String uri = request.getRequestURI();

		String basicURL = uri.substring(path.length() + 1, uri.length() - 3);

		String url = "";

		System.out.println(basicURL);

		loginCommand command = null;

		if (basicURL.equals("loginView")) {
			url = "/login.jsp";
		} else if (basicURL.equals("joinView")) {
			url = "/joinView.jsp";
		} else if (basicURL.equals("joinOk")) {
			command = new JoinCommand();
			command.login(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("index")) {
			url = "/index.jsp";
		} else if (basicURL.equals("loginOk")) {
			command = new LoginCheckCommand();
			command.login(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("logout")) {
			command = new LogoutCommand();
			command.login(request, response);
			url = (String) request.getAttribute("url");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
