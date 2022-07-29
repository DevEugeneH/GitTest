package org.login.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCommand implements loginCommand{
	@Override
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String url = "";
		HttpSession session = request.getSession(false);
		if(session!=null) {
			session.invalidate();
			url = "index.ao";
		}
		request.setAttribute("url", url);
	}
}
