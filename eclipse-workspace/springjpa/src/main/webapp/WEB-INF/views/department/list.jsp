<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Departments</title>
    <link rel="stylesheet" href="<c:url value='/resources/style.css' />">
</head>
<body>
    <h3>Department List</h3>
    <a href="<c:url value='/department/new'/>">Add New Department</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${department}" var="department">
            <tr>
                <td>${department.id}</td>
                <td>${department.name}</td>
                <td>
                    <a href="<c:url value='/department/edit/${department.id}'/>">Edit</a>
                    <a href="<c:url value='/department/delete/${department.id}'/>">Delete</a>
                    <a href="<c:url value='/employee/department/${department.id}'/>">View Employees</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>