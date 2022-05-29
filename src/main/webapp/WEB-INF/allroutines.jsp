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
<title>Pick a Routine</title>
<link rel="stylesheet" type="text/css" href="/CSS/allroutines.css" />
</head>
<body>
	<div id="header">
		<div id="leftheader" class="flex">
		<h1 ><a class="fixlink" href="/">Fitness</a></h1>
		<h1><a class="fixlink" href="/find/workout">Old Workouts</a></h1>
		</div>
		<a class="fixlink" href="/logout">Logout</a>
	</div>
	
	<div id="maincontent">
		<div class="row">
		
			<div id="chest" class="square">
			
				<div class="container">
				<a href="view/chest">
					<h1>Chest</h1>
				</a>
				</div>
			</div>
			
			<div id="legs" class="square">
				<div class="container">
				<a href="/view/legs">
					<h1>Legs</h1>
				</a>
				</div>
			</div>
			
			<div id="back" class="square">
				<div class="container">
				<a href="/view/back">
					<h1>Back</h1>
				</a>
				</div>
			</div> 
		</div>
		
		<div class="row">
			<div id="shoulders" class="square">
				<div class="container">
					<a href="/view/shoulders">
						<h1>Shoulders</h1>
					</a>
				</div>
			</div>
			
			<div id="biceps" class="square">
				<div class="container">
				<a href="view/biceps">
					<h1>Biceps</h1>
				</a>
				</div>
			</div>
			
			
			<div id="triceps" class="square">
				<div class="container">
				<a href="/view/triceps">
					<h1>Triceps</h1>
				</a>
				</div>
			</div> 
			
		</div>
		
		<div class="row">
		
			<div id="cardio" class="square">
				<div class="container">
				<a href="/view/cardio">
					<h1>Cardio</h1>
				</a>
				</div>
			</div>
			
			
			<div id="core" class="square">
				<div class="container">
				<a href="/view/core">
					<h1>Core</h1>
				</a>
				</div>
			</div>
			
			
			<div id="athome" class="square">
				<div class="container">
				<a href="/view/athome">
					<h1>At-Home</h1>
				</a>
				</div>
			</div> 
			
		</div>
		
	</div>
</body>
</html>