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
<title>Register an Account</title>
</head>
<body>
<h1>Register</h1>
	<form:form action="/registering/account" method = "post" modelAttribute="newUser">
		<p>
			<form:label path="fName">First Name:</form:label>
			<form:errors path="fName"/>
			<form:input path="fName"/>
		</p>
		
		<p>
			<form:label path="lName">Last Name:</form:label>
			<form:errors path="lName"/>
			<form:input path="lName"/>
		</p>
		
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
		
		<p>
			<form:label path="confirm">Confirm Password:</form:label>
			<form:errors path="confirm"/>
			<form:input path="confirm"/>
		</p>
		
		<input type="submit" />
	</form:form>
	<p>Already have an account? <a href="/login">Sign in!</a></p>
</body>
</html>