package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailInputServlet")
public class EmailInputServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// read
		String email = request.getParameter("email");

		// validate
		// required
		if (email == null || email.trim().length() == 0) {
			// go back to the InputEmail.html

			//dispatch -> Servet -> HTML 
			//RequestDispatcher -> node -> node -> travel
			//navigate from servlet 
			
			//send data to next page {node} 
			request.setAttribute("email", email);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("InputEmail.html");
			rd.forward(request, response);
			
			
		} else {
			// open new page and print email
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(email);
		}
	}
}
