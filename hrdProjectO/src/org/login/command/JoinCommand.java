package org.login.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.dao.LoginDao;

public class JoinCommand implements loginCommand{
	@Override
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		LoginDao dao = LoginDao.getInstance();
		int rs = dao.join(userId, userPw);
		
		String url = "";
		
		if(rs!=0) {
			System.out.println("join success");
			url = "index.ao";
		} else {
			System.out.println("join fail");
			url = "index.ao";
		}
		request.setAttribute("url", url);
	}
}
