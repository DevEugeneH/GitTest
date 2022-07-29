package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.Commend;
import org.project.commend.Insert;
import org.project.commend.Select;

@WebServlet("*.do")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);	
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);
	}
	public void doAction(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		
		System.out.println(basicURL);
		String url = "";
		Commend command = null;
		
		if(basicURL.equals("index")) {
			url = "/index.jsp";
		} else if(basicURL.equals("join")) {
			url = "/join.jsp";
		} else if(basicURL.equals("joinOk")) {
			command = new Insert();
			command.query(request, response);
			url = (String)request.getAttribute("url");
		} else if(basicURL.equals("memberListView")) {
			command = new Select();
			command.query(request, response);
			url = (String) request.getAttribute("url");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
