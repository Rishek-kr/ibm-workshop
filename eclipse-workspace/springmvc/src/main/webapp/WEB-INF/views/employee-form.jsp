<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<h2>Add Employee</h2>
	<form:form action="save" method="post" modelAttribute="employee">
		Name:<form:input path="name" /><br/>
		Email:<form:input path="email" /><br/>
		Department:<form:input path="department" /><br/>
		<input type="submit" value="Save">
	</form:form>
</body>
</html>