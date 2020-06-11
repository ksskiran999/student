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

<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<h2 style="color:red;" align="center">Student Edit Form</h2>
<form method="post" action="update">


<table align="center">
<tr>
<td>Student Id</td>
<td>${student.sid}</td>
</tr>
<tr>
<td><input type="text" name="sname" value='${student.sname}'></td>
</tr>

<tr>
<td><input type="text" name="saddr" value='${student.saddr}'></td>
</tr>

<tr>
<td><input  type="submit" value="UPDATE"></td>
</tr>

</table>	
<input type="hidden" name="sid" value="${student.sid}"/>
</form>
</body>
</html>