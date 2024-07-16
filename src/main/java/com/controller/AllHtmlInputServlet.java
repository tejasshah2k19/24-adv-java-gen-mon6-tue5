package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllHtmlInputServlet")
public class AllHtmlInputServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		String birthYear = request.getParameter("birthYear");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		
		String hobby[] = request.getParameterValues("hobby");
	
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.print("FirstName : "+firstName+"<br>");
		out.print("BirthYear : "+birthYear+"<br>");
		out.print("Email : "+email+"<br>");
		out.print("Password : "+password+"<br>");
		out.print("Gender : "+gender+"<br>");
		out.print("City : "+city+"<br>");
		out.print("Address : "+address+"<br>");
		out.print("Hobby : ");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+" ");
		}
		
		
		
		
		
	}
}
