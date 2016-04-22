<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>


	<h1>All Users</h1>
	</br>

	<table>
		<thead>
			<tr>
				<th>#ID</th>
				<th>Username</th>
				<th>Password</th>
			</tr>
		</thead>
		
		<c:forEach var="user" items=${users} }>
		<tr>
		<td>${user.id}</td>
		<td>${user.userName}</td>
		<td>${user.password}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>