<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
	<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">


</head>
<body>
	<nav>
		<h1>Spring MVC</h1>
		<div class="right">
			<a href="/spring-mvc-demo/">Home</a>
			<a href="/spring-mvc-demo/signup">SignUp</a>
		</div>
	</nav>
	<div class="main">
		<div>
			<h1>Your Name is : ${ name }</h1>
		</div>
	</div>
	
</body>
</html>