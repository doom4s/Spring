<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vlajko</title>
</head>
<body>
	<p>Hello, please input your credentials.</p>
	<form:form method="post" modelAttribute="userForm"
		action="${pageContext.request.contextPath}/dashboard">
		<table>
			<thead>
				<tr>
					<td>User name:</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr><td></td><td><input type="submit" name="submit" title="submit" value="Login"></td></tr>
			</thead>
		</table>
	</form:form>
	<p>Current users in the system:</p>
	New user ? <a href="registration">Register here</a>
	
</body>
</html>