package org.login.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface loginCommand {
	void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
