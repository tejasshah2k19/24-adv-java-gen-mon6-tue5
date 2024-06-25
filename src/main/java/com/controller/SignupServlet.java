package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//tomcat->lib-> jakarata 
//javax 

//core java -> lib -> X 
//lib-jar-? 
//servlet-api.jar -> google, 
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("SignupServlet::service()");
	}
}

//tomcat->lib->servlet-api.jar 

//project->right click->properties->java build path-> libraries tab->
	//add external jar->browse->c drive -> apache software foundation	
	//->tomcat->lib->servleta-api.jar -> open/select 
	//click on order and export tab -> select all -> apply and close 

