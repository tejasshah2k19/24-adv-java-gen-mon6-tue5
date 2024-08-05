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
public class EmployeeRegistrationFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter::init()");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter::doFilter()");

		boolean isError = false;

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String birthYear = request.getParameter("birthYear");

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}
		if (birthYear == null || birthYear.trim().length() == 0) {
			isError = true;
			request.setAttribute("birthYearError", "Please Enter BirthYear");
		}

		if (isError == true) {
			// back
			request.getRequestDispatcher("EmployeeRegistration.jsp").forward(request, response);
		} else {
			// forward
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter::destroy()");

	}
}
