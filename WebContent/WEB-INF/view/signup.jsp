<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
	<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
	<style>
		form{
			display:flex;
			flex-direction:column;
			gap:10px;
			width:10rem;
		}
		
		select{
			height:2rem;
			outline:none;
		}
	</style>

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
		<form:form action="signup/postsignup" method="post" modelAttribute="signup">
			<form:input path="name" placeholder="Enter Your Name" />
			<form:input path="email" placeholder="Enter Your Email" />
			<form:input path="password" placeholder="Enter Password" />
			<form:select path="country">
				<form:option value="Brazil">Brazil</form:option>
				<form:option value="France">France</form:option>
				<form:option value="Germany">Germany</form:option>
				<form:option value="India">India</form:option>
			</form:select>
			<button type="submit">Submit</button>
		</form:form>
	</div>
	
</body>
</html>