<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Back-office</title>
</head>
<body>
<p>Hi <c:out value="${myname}"/>
<p>Welcome to the machine.</p>
<p>List of the people running the machine:</p>
<table>
<c:forEach items="${users}" var="user"> 
  <tr>
    <td>${user.userName}</td>
    <td>${user.password}</td>
  </tr>
</c:forEach>
</table>
<a href="welcome"><p>GO BACK</p></a>
</body>
</html>