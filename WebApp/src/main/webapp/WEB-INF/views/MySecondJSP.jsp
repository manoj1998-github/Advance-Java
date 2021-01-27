<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MySecondJSP</title>
</head>
<body>


<% 
		Integer id=	(Integer)request.getAttribute("id");
		String name	= (String)request.getAttribute("name");

%>


<%= "id = "+id %>
<%= "name= "+name%>	

</body>
</html>