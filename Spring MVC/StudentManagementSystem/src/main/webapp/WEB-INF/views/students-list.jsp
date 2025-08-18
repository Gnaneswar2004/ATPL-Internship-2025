<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 60%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
<h2>Student List</h2>

<a href="${pageContext.request.contextPath}/students/new">Add Student</a>
<br/><br/>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/${student.id}">View</a> |
                <a href="${pageContext.request.contextPath}/students/${student.id}/edit">Edit</a> |
                <a href="${pageContext.request.contextPath}/students/${student.id}/delete">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>