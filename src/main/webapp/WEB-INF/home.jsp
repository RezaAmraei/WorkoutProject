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
<title>Home</title>
<link rel="stylesheet" type="text/css" href="/CSS/home.css" />
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
		<div class="col" id="viewworkoutcol">
			<a href="/view/all/routines">
				<button>
					<div class="text">
						<h2>View Possible Workouts</h2>
					</div>
				</button>
			</a>
		</div>
		<div class="col" id="logworkoutcol">
			<a href="/log/workout">
				<button>	
					<div class="text">
						<h2>Log Workouts</h2>
					</div>
				</button>
			</a>
		</div>
		<div class="col" id="logeatingcol">	
			<a href="">
				<button>
					<div class="text">
						<h2>Log Your Meals</h2>
					</div>
				</button>
			</a>
		</div>
	</div>
</body>
</html>