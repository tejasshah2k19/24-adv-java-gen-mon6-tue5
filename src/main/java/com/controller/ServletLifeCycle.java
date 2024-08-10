package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("Servlet::init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Servlet::service()");
	}

	public void destroy() {
		System.out.println("Servlet::destroy()");
	}
}
