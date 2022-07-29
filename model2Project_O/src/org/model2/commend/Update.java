package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.Model2Dao;

public class Update implements ExcuteCommend{
	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String url = "";
		Model2Dao dao = Model2Dao.getInstance();
		int rs = dao.update(userId, userPw, userName);
		
		if(rs==1) {
			System.out.println("update success");
			url = "index.do";
		} else {
			System.out.println("update fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
