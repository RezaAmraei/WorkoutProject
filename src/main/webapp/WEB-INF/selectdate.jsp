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
<title>When was the workout?</title>
</head>
<body>
	<div id="header">
		<div id="leftheader" class="flex">
		<h1 ><a class="fixlink" href="/">Fitness</a></h1>
		<h1><a class="fixlink" href="/view/workout">Old Workouts</a></h1>
		</div>
		<a class="fixlink" href="/logout">Logout</a>
	</div>
	
	<div id="mainbody">
		<form action="/finding/workout" method="post">
			<label for="date">When was the workout you're looking for?</label>
			<input type="date" name="date"/>
			
			<input type="submit" />
		</form>
	</div>
</body>
</html>