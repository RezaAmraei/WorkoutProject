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
<title>Insert title here</title>
</head>
<body>
	<form:form action="/registering/details" method="post" modelAttribute="newUserDetails">
		
		<p>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"/>
			<form:input path="age" type="number"/>
		</p>
		
		<p>
			<form:label path="weight">Weight:</form:label>
			<form:errors path="weight"/>
			<form:input path="weight" type="number"/>
		</p>
		
		<p>
			<form:label path="height">Height:</form:label>
			<form:errors path="height"/>
			<form:input path="height" type="number"/>
		</p>
		
		<p>
			<form:label path="gender">Gender:</form:label>
			<form:errors path="gender"/>
			<form:input path="gender"/>
		</p>
		
		<form:input path="user" value ="${id}"/>
		<input type="submit" />
	</form:form>
</body>
</html>