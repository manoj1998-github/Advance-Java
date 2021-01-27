<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Invalid Credentials!</h2>
	
	<h5>Your Details is not present in the DataBase!!!</h5>
	<%
		Object object = request.getAttribute("user2");
	
	%>
	<%=object%>

	

</body>
</html>