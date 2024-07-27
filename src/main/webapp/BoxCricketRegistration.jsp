<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String studentNameError = (String) request.getAttribute("studentNameError");//Object
	String playerTypeError = (String) request.getAttribute("playerTypeError");
	//User ->
	%>



	<h2>Box Cricket Registration</h2>
	<form action="BoxCricketRegistrationServlet" method="post">

		StudentName : <input type="text" name="studentName" />
		<%=studentNameError == null ? "" : studentNameError%>
		<br> <Br> PlayerType : <select name="playerType">
			<option value="">Please Select Your Skil</option>
			<option value="batsman">Batsman</option>
			<option value="bowler">Bowler</option>
			<option value="allRounder">All rounder</option>
		</select>
		<%=playerTypeError == null ? "" : playerTypeError%>
		<br> <Br> <input type="submit" value="Register" />


	</form>
</body>
</html>