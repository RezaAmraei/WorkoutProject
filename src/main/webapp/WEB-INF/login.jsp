<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    		<%@ page isErrorPage="true" %>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
		<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
		<form:form action="/logging/in" method = "post" modelAttribute="loginUser">
		<p>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</p>
		
		<p>
			<form:label path="password">Password:</form:label>
			<form:errors path="password"/>
			<form:input path="password"/>	
		</p>
		
		<input type="submit" />
	</form:form>
	<p>Don't have an account? Register <a href="/register/account">here</a>!</p>
</body>
</html>