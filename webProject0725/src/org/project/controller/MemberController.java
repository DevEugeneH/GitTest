package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.command.MemberCommand;
import org.project.command.MemberDetailView;
import org.project.command.MemberInsert;
import org.project.command.MemberJoin;
import org.project.command.MemberSaleDetail;
import org.project.command.MemberSaleView;
import org.project.command.MemberSearch;
import org.project.command.MemberUpdate;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);
	}

	public void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		System.out.println(basicURL);
		String url = "";
		
		MemberCommand command = null;
		
		if(basicURL.equals("index")) {
			url = "index.jsp";
		} else if(basicURL.equals("memberListView")) {
			command = new MemberSearch();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("memberList")) {
			command = new MemberDetailView();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("updateOk")) {
			command = new MemberUpdate();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("join")) {
			command = new MemberJoin();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("joinOk")) {
			command = new MemberInsert();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("memberSaleView")) {
			command = new MemberSaleView();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("memberDetailSale")) {
			command = new MemberSaleDetail();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("login")) {
			url = "login.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
