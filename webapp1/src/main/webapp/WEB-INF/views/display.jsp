<%@ page import="com.jspiders.webapp1.controller.*"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<h2>Login Successful!</h2>
	
	<h5>Your Details in the DataBase is:</h5>
	<%
		Object object = request.getAttribute("user2");
	User list = (User) object;
	%>
	<%=list%>

	

</body>

</html>