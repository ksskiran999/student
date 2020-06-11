<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">	
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br>
<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<h2 style="color:red;" align="center">Student Details</h2>

<table align="center" border="1">
<tr>
<td>Student Id</td>
<td>${student.sid}</td>
</tr>
<tr>
<td>Student Name</td>
<td>${student.sname}</td>
</tr>
<tr>
<td>Student Address</td>
<td>${student.saddr}</td>
</tr>
</table>
</form>
</body>
</html>