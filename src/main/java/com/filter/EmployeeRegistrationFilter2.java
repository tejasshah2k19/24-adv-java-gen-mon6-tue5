package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EmployeeRegistrationServlet")
public class EmployeeRegistrationFilter2 implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("EmployeeRegistrationFilter2::init()");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("EmployeeRegistrationFilter2::doFilter");
		String firstName = request.getParameter("firstName");

		// firstName => a-z A-Z -> regex

		String alphaRegEx = "[a-zA-Z]+";

		boolean isError = false;
		if (firstName.matches(alphaRegEx) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter valid FirstName");
		}

		if (isError == true) {
			request.getRequestDispatcher("EmployeeRegistration.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		System.out.println("EmployeeRegistrationFilter2::destroy()");

	}
}
