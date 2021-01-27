
<%@ page import="java.util.List"%>

<%@page import="com.jspiders.webapp1.controller.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check User Details:</title>
</head>
<body>
	<h1>To View Details Click Here</h1>
	<a href="displayAllUserDetails">Click Here</a>

	<%
		Object object = request.getAttribute("user2");
	List<User> list = (List<User>) object;
	%>
	<%=list%>

	<table border="1px">

		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Password</td>
		</tr>

		<tr>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
		
		<tr>
			<td><%=list.get(i).getId()%></td>
			<td><%=list.get(i).getName()%></td>
			<td><%=list.get(i).getEmail()%></td>
			<td><%=list.get(i).getPassword()%></td>
			<%
				}
			%>
		</tr>
	</table>


</body>



</html>