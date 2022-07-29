package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.Dao;

public class Insert implements Commend{
	@Override
	public void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userAge = request.getParameter("userAge");
		String userName = request.getParameter("userName");
		
		Dao dao = Dao.getInstance();
		int rs = dao.insert(userId, userAge, userName);
		String url = "";
		
		if(rs==1) {
			System.out.println("join success");
			url = "memberListView.do";
		} else {
			System.out.println("join fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
