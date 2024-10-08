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

		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String operation = request.getParameter("operation");// + - * div

		boolean isError = false; // no error
		String error = "";// blank

		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			error = "Please Enter Number1<br>";
		}

		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			error += "Please Enter Number2<br>";
		}

		if (operation == null) {
			isError = true;
			error += "Please Select Operation<br>";
		}

		if (isError) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(error);

		} else {
			// code
			Integer x = Integer.parseInt(n1);
			Integer y = Integer.parseInt(n2);

			int ans = 0;

			if (operation.equals("+")) {
				ans = x + y;
			} else if (operation.equals("-")) {
				ans = x - y;
			} else if (operation.equals("*")) {
				ans = x * y;
			} else if (operation.equals("div")) {
				ans = x / y;
			}
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("ans = " + ans);

		}

	}

}
