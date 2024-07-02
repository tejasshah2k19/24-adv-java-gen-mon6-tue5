package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String operation = request.getParameter("operation");// +
		int ans = 0;

		if (operation.equals("+")) {
			ans = n1 + n2;
		} else if (operation.equals("-")) {
			ans = n1 - n2;
		} else if (operation.equals("*")) {
			ans = n1 * n2;
		} else if (operation.equals("div")) {
			ans = n1 / n2;
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("ans = " + ans);
	}

}
