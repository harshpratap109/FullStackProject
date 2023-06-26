<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
</head>
<body>

	<h3>Welcome, Enter The Login</h3>
	<h3>${errormsg}</h3>
	<form method="POST" action="login">
		<table>
			<tr>
				<td>Enter EmployeeID: <input type="number" name="empId">
				</td>
			</tr>
			<tr>
				<td>Enter Employee Password: <input type="password" name="password">
				</td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>