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
<form method="post" action="add">
<table align="center">
<tr>
<td>Student Id</td>
<td><input type="text" name="sid"></td>
</tr>

<tr>
<td>Student Name</td>
<td><input type="text" name="sname"></td>
</tr>
<tr>
<td>Student Address</td>
<td><input type="text" name="saddr"></td>
</tr>
<tr>
<td><input  type="submit" value="ADD"></td>
</tr>
</table>	
</form>
</body>
</html>