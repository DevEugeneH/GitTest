package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Commend {
	void query(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException;
}
