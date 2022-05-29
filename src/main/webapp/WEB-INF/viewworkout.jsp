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
<title>Heres Your Workout</title>
</head>
<body>
	<div id="header">
		<div id="leftheader" class="flex">
		<h1 ><a class="fixlink" href="/">Fitness</a></h1>
		<h1><a class="fixlink" href="/view/workout">Old Workouts</a></h1>
		</div>
		<a class="fixlink" href="/logout">Logout</a>
	</div>
	
	<div id="maincontent">
	<h1>Workout on <c:out value="${date}"/></h1>
		<table>
			<tr>
				<th>Exercise</th>
				<th>Sets</th>
				<th>Reps</th>
				<th>Weight</th>
			</tr>
			<c:forEach var ="oneLift" items="${allWorkouts}">
				<tr>
					<td><c:out value="${oneLift.exercise }"/></td>
					<td><c:out value="${oneLift.sets }"/></td>
					<td><c:out value="${oneLift.reps }"/></td>
					<td><c:out value="${oneLift.exerciseWeight}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>