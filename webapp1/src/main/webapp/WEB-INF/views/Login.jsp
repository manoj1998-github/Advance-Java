<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "response is generated" %>

<form action="ValidateUser" method="POST">
	<pre>
	ID:<input name="ID" type="text">
	Password:<input name="Password" type="password">
	<input name="register" type="submit">
	
	</pre>
</form>

<%= "Successfully registered" %>
<%Object object = request.getAttribute("user1");%> 

	<%="User Details :" + object%></body>
</html>