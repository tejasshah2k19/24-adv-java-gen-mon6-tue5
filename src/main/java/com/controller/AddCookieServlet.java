package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// cookie create -> set
		String firstName = request.getParameter("firstName");

		//cookie create 
		Cookie c = new Cookie("firstName", firstName);//create 
		c.setMaxAge(60*60*24*7);//60second 
		response.addCookie(c);//set browser 
		
		response.sendRedirect("InputCookie.jsp");	
	}
}
