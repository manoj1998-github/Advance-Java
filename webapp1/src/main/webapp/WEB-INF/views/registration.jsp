<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>

	<%="response is generated"%>

	<form action="registerUser" method="POST">
		<pre>
	id:<input name="id" type="text">
	name:<input name="name" type="text">
	email:<input name="email" type="text">
	password:<input name="password" type="password">
	<input name="register" type="submit">
	
	</pre>
	</form>

	<%="Successfully registered"%>
	<%
		Object object = request.getAttribute("user1");
	%>

	<%="User Details :" + object%></body>
</html>