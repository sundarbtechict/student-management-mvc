<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.sundar.studentmanagement.vo.*"%>

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
		<ul class="nav navbar-nav navbar-right">
			<li><a href="./createStudent.jsp"><span
					class="glyphicon glyphicon-plus"></span> Create Student</a></li>
		</ul>
	</div>
	</nav>
	<c:if test="${status.getStatusCode() != null}">
		<c:if test="${status.getStatusCode()=='Success'}">
		<div class="alert alert-success alert-dismissable" style="text-align:center;">
			<a href="#" class="close" data-dismiss="alert">�</a> <strong><c:out
					value="${status.getStatusCode()}" /></strong>
			<c:out value="${status.getStatusMsg()}" />
		</div>
	</c:if>
		<c:if test="${status.getStatusCode() == 'Problem'}">
		<div class="alert alert-warning alert-dismissable" style="text-align:center;" >
			<a href="#" class="close" data-dismiss="alert">�</a> <strong><c:out
					value="${status.getStatusCode()}" /></strong>
			<c:out value="${status.getStatusMsg()}" />
		</div>
		</c:if>
	</c:if>
	
	<br>
	<br>
	<div class="container">
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<tr class="info">
					<th>Register no:</th>
					<th>Name:</th>
					<th>Date of Birth:</th>
					<th>Department:</th>
					<th>Email:</th>
					<th>Mobile:</th>
					<th colspan="3">ACTION</th>
				</tr>
				<c:forEach items="${studentList}" var="st">
					<tr>
						<td><c:out value="${st.getRegNo()}"></c:out></td>
						<td><c:out value="${st.getName()}"></c:out></td>
						<td><c:out value="${st.getDob()}"></c:out></td>
						<td><c:out value="${st.getDept()}"></c:out></td>
						<td><c:out value="${st.getEmail()}"></c:out></td>
						<td><c:out value="${st.getMobile()}"></c:out></td>
						<td><a
							href="./viewStudent?regno=<c:out value="${st.getRegNo()}"></c:out>">View</a></td>
						<td><a
							href="./editStudent?regno=<c:out value="${st.getRegNo()}"></c:out>">Edit</a></td>
						<td><a
							href="./deleteStudent?regno=<c:out value="${st.getRegNo()}"></c:out>">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>