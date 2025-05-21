<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employees</title>
    <link rel="stylesheet" href="<c:url value='/resources/style.css' />">
</head>
<body>
    <h1>Employee List</h1>
    <a href="<c:url value='/employee/new' />">Add New Employee</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${employee}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.department.name}</td>
                <td>
                    <a href="<c:url value='/employee/edit/${employee.id}' />">Edit</a>
                    <a href="<c:url value='/employee/delete/${employee.id}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value='/department' />">Back to Departments</a>
</body>
</html>