package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cookie c = new Cookie("firstName", "");
		c.setMaxAge(0);
		response.addCookie(c);
			
		HttpSession session = request.getSession();
		session.invalidate();//destroy the session from server 

		response.sendRedirect("InputCookie.jsp");
	}
}
