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
<title>Pick Your Workout!</title>
<link rel="stylesheet" type="text/css" href="/CSS/routine.css" />
</head>
<body>
	<div id="header">
		<div id="leftheader" class="flex">
		<h1 ><a class="fixlink" href="/">Fitness</a></h1>
		<h1><a class="fixlink" href="/find/workout">Old Workouts</a></h1>
		</div>
		<a class="fixlink" href="/logout">Logout</a>
	</div>
	
	<div id="maincontent" class="flex">
	<a href="${linkbeg}" target="_blank">
		<div class="colcontainer fixlink">
			<h1>Beginner</h1>
			<div class="col" id="beginner"></div>
		</div>
	</a>
	<a href="${linkint}" target="_blank">
		<div class="colcontainer">
			<h1>Intermediate</h1>
			<div class="col" id="intermediate"></div>
		</div>
	</a>
	<a href="${linkadv}" target="_blank">
		<div class="colcontainer">
			<h1>Advanced</h1>
			<div class="col" id="advanced"></div>
		</div>	
	</a>
	</div>
</body>
</html>