<%@page import="java.util.List"%>
<%@page import="com.nama.springboot.firstdemo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees Information</title>
</head>
<body>
	<%
	List<Employee> emps = (List<Employee>) request.getAttribute("empList");
	for (Employee emp : emps) {
		out.println("<table>");
		out.println("<tr><td>" + emp + "</td></tr>");
		out.println("</table>");
	}
	%>
</body>
</html>