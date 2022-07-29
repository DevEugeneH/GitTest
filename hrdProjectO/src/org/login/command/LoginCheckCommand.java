package org.login.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.login.dao.LoginDao;

public class LoginCheckCommand implements loginCommand{
	@Override
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		LoginDao dao = LoginDao.getInstance();
		int login = dao.login(userId, userPw);
		HttpSession session = request.getSession();
		
		String url = "";
		
		if(login!=1) {
			System.out.println("로그인 실패");
			url = "index.ao";
		} else {
			System.out.println("로그인 성공");
			session.setMaxInactiveInterval(60*10);
			session.setAttribute("sessionId", userId);
			url = "index.ao";
		}
		request.setAttribute("url", url);
		
	}
}
