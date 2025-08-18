<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>Student Details</title></head>
<body>
<h2>Student #${student.id}</h2>
<p><strong>Name:</strong> ${student.name}</p>
<p><strong>Email:</strong> ${student.email}</p>

<p>
  <a href="${pageContext.request.contextPath}/students/${student.id}/edit">Edit</a> |
  <a href="${pageContext.request.contextPath}/students">Back</a>
</p>
</body>
</html>