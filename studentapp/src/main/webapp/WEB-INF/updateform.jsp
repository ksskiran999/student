<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">	
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsps"/>
<br><br><br>
<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<h2 style="color:red;" align="center">Student Edit Form</h2>
<form method="post" action="editform">

<table align="center">
<tr>
<td>Student Id</td>
<td><input type="text" name="sid"></td>
</tr>
<td><input  type="submit" value="GetEditForm"></td>
</tr>
</table>	
</form>
</body>
</html>