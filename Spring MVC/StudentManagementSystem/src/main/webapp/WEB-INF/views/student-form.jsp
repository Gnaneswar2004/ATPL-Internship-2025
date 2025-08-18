<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head><title>Student Form</title></head>
<body>
<h2>${student.id == 0 ? 'Add Student' : 'Edit Student #' += student.id}</h2>

<form:form modelAttribute="student"
           method="post"
           action="${pageContext.request.contextPath}${student.id == 0 ? '/students' : '/students/' += student.id += '/edit'}">

  <c:if test="${student.id != 0}">
    <p><strong>ID:</strong> ${student.id}</p>
  </c:if>

  <p>
    <form:label path="name">Name</form:label><br/>
    <form:input path="name"/>
    <form:errors path="name"/>
  </p>

  <p>
    <form:label path="email">Email</form:label><br/>
    <form:input path="email"/>
    <form:errors path="email"/>
  </p>

  <p><button type="submit">Save</button>
     <a href="${pageContext.request.contextPath}/students">Cancel</a></p>
</form:form>
</body>
</html>