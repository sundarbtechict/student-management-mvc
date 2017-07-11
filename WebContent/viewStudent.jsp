<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.sundar.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./plugins/bootstrap.css" rel="stylesheet" />
<script type="text/javascript" src="./plugins/bootstrap.min.js"></script>
<script type="text/javascript" src="./plugins/jquery.2.2.3.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
  	<div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="./././index.jsp">Student Management</a>
    </div>
    </div>
	</nav>
	<br><br>

	<div class="container">
			<table class="table table-striped">
				<tr>
					<th>Register no:</th>
					<td><c:out value="${std.getRegNo()}"/></td>
				</tr>
				<tr>
					<th>Name:</th>
					<td><c:out value="${std.getName()}"/></td>
				</tr>
				<tr>
					<th>Date of Birth:</th>
					<td><c:out value="${std.getDob()}"/></td>
				</tr>
				<tr>
					<th>Department:</th>
					<td><c:out value="${std.getDept()}"/></td>
				</tr>
				<tr>
					<th>Email:</th>
					<td><c:out value="${std.getEmail()}"/></td>
				</tr>
				<tr>
					<th>Mobile:</th>
					<td><c:out value="${std.getMobile()}"/></td>
				</tr>
			</table>
		<a href='./././index'> Back</a>
	</div>
</body>
</html>