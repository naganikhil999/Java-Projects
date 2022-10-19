<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="<%= request.getContextPath() %>/register"  method="post"> 
<div align="center">
	<h1>Registration </h1>
			<table>
			<tr>
			<td>First Name:</td>
			<td> <input type="text" name="firstname"> </td>
			 </tr>
			 
			<tr> 
			<td>Last  Name: </td>
			<td> <input type="text" name="lastname"> </td>
			</tr>
			
			<tr>
			<td>User Name: </td>
			<td><input type="text" name="username"> </td>
			</tr>
			
			<tr>
			<td>Password: </td>
			<td><input type="password" name="password"> </td>
			</tr>
			
			<tr>
			<td>Address: </td>
			<td><input type="text" name="address"> </td>
			</tr>
			
			<tr>
			<td>Contact No: </td>
			<td><input type="text" name="number"> </td>
			</tr>
			
			</table>
			
			<input type="submit" value="submit"> 
</div>
</form>
</body>
</html>