<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
	<p>Please fill out the form below and press register button</p>

	<form:form method="post" modelAttribute="userForm"
		action="${pageContext.request.contextPath}/newUser">
		<table>
			<thead>
				<tr>
					<td>Your user name:</td>
					<td><input type="text" name="userName"> <form:errors
							path="userName" /></td>
				</tr>
				<tr>
					<td>Your password:</td>
					<td><input type="text" name="password"> <form:errors
							path="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="submit" title="submit"
						value="Register"></td>
				</tr>
			</thead>
		</table>
	</form:form>

</body>
<font color="red"><c:out value="${warning}" /></font>
</html>