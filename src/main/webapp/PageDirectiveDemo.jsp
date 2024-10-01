<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@ page session="false"  isELIgnored="true" buffer="8kb" autoFlush="true" %>
<%@ page import="java.util.Date,java.sql.*" import="java.util.pattern.*" %>
<%@page errorPage="MyError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name => ${name}

<% 
	Date d = new Date();
	Scanner scr = null;
	
	int a = 10;
	int b = 0;
	int c = a/b; //ArithmeticException
	out.print(c);
%>

</body>
</html>