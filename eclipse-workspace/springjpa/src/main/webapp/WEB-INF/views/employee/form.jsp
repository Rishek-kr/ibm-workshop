<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
    <link rel="stylesheet" href="<c:url value='/resources/style.css' />">
</head>
<body>
    <h1>Employee Form</h1>
    
    <form:form action="save" method="POST" modelAttribute="employee">
        <form:hidden path="id" />
        
        <div class="form-group">
            <label for="name">Employee Name:</label>
            <form:input path="name" id="name" cssClass="form-control" />
            <form:errors path="name" cssClass="error" />
        </div>
        
        <div class="form-group">
            <label for="department">Department:</label>
            <form:select path="department.id" id="department" cssClass="form-control">
                <form:option value="" label="-- Select Department --" />
                <form:options items="${department}" itemValue="id" itemLabel="name" />
            </form:select>
            <form:errors path="department" cssClass="error" />
        </div>
        
        <div class="form-actions">
            <input type="submit" value="Save" class="btn btn-primary" />
            <a href="<c:url value='/employee' />" class="btn btn-secondary">Cancel</a>
        </div>
    </form:form>
</body>
</html>