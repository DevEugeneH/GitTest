package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.Dao;
import org.project.dto.Member0729;

public class Select implements Commend{
	@Override
	public void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = Dao.getInstance();
		ArrayList<Member0729> list = dao.list();
		
		String url = "";
		
		if(list!=null) {
			System.out.println("select Success");
			request.setAttribute("list", list);
			url = "memberListView.jsp";
		} else {
			System.out.println("select Fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
