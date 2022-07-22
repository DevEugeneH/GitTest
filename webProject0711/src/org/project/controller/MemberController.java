package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.command.MemberCommand;
import org.project.command.MemberDeleteCommand;
import org.project.command.MemberDeleteCommand2;
import org.project.command.MemberIdCheck;
import org.project.command.MemberInsertCommand;
import org.project.command.MemberSelectCommnad;
import org.project.command.MemberUpdateCommand;
import org.project.command.MemberViewCheckCommand;
import org.project.command.MemberViewCommand;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		doAction(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		doAction(request, response);
	}

	public void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String path = request.getContextPath();
		String uri = request.getRequestURI();

		String basicURL = uri.substring(path.length() + 1, uri.length() - 3);

		System.out.println(basicURL);

		response.setContentType("text/html, charset=UTF-8");

		String url = "";
		MemberCommand command = null;

		if (basicURL.equals("index")) {
			url = "/index.jsp";
		} else if (basicURL.equals("joinView")) {
			url = "/join.jsp";
		} else if (basicURL.equals("joinOk")) {
			command = new MemberInsertCommand();
			command.executeQueryCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberListView")) {
			command = new MemberSelectCommnad();
			command.executeQueryCommand(request, response);
			url = "/memberListView.jsp";
		} else if (basicURL.equals("memberView")) {
			command = new MemberViewCommand();
			command.executeQueryCommand(request, response);
			url = "/memberView.jsp";
		} else if (basicURL.equals("memberUpdateOk")) {
			command = new MemberUpdateCommand();
			command.executeQueryCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberDeleteOk")) {
			command = new MemberDeleteCommand();
			command.executeQueryCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberDeleteView")) {
			String userId = (String) request.getParameter("userId");
			request.setAttribute("userId", userId);

			url = "/memberDeleteView.jsp";
		} else if (basicURL.equals("memberDeleteOk2")) {
			command = new MemberDeleteCommand2();
			command.executeQueryCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberViewCheck")) {
			command = new MemberViewCheckCommand();
			command.executeQueryCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberCheck")) {
			String userId = (String) request.getParameter("userId");
			request.setAttribute("userId", userId);
			url = "/memberViewCheck.jsp";
		} else if(basicURL.equals("idChecked")) {
			command = new MemberIdCheck();
			command.executeQueryCommand(request, response);
			url = "/join.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
