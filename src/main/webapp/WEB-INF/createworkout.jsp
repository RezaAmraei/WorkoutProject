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
<title>Log Your Workout!</title>
</head>
<body>
	<div id="header">
		<h1 ><a class="fixlink" href="/">Fitness</a></h1>
		<a class="fixlink" href="/logout">Logout</a>
	</div>
	
	<div id="maincontent">
		<div id="maincontentheader">
			<h1>Log Your Workout</h1>
		</div>
				<table>
			<c:forEach var ="oneLift" items="${allWorkouts}">
				<tr>
					<td><c:out value="${oneLift.exercise }"/></td>
					<td><c:out value="${oneLift.sets }"/></td>
					<td><c:out value="${oneLift.reps }"/></td>
					<td><c:out value="${oneLift.exerciseWeight}"/></td>
				</tr>
			</c:forEach>
		</table>
		<form:form action="/create/workout" method="post" modelAttribute="newWorkout">
			<form:label path="exercise">What <div class="underline">exercise</div> did you do?</form:label>
			<form:errors path="exercise"/>
			<form:input path="exercise"/>
			
			<form:label path="sets">How many <div class="underline">sets</div> did you do?</form:label>
			<form:errors path="sets"/>
			<form:input path="sets" type="number"/>
			
			<form:label path="reps">How many <div class="underline">reps</div> did you do?</form:label>
			<form:errors path="reps"/>
			<form:input path="reps" type="number"/>
			
			<form:label path="exerciseWeight">How heavy was the <div class="underline">weight</div>?</form:label>
			<form:errors path="exerciseWeight"/>
			<form:input path="exerciseWeight" type="number"/>
			
			<form:label path="dateOfWorkout">When did you do this exercise?</form:label>
			<form:errors path="dateOfWorkout"/>
			<form:input path="dateOfWorkout" type="date"/>
			
			<input type="submit" />
		</form:form>
	</div>
</body>
</html>