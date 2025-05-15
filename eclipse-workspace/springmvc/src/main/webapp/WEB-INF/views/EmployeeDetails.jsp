<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h2>Submitted Employee Information</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td>${employee.name}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${employee.email}</td>
		</tr>
		<tr>
			<td>Department:</td>
			<td>${employee.department}</td>
		</tr>
	</table>
</body>
</html>