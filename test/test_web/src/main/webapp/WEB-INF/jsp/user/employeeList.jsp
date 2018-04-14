<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>employeeList</title>
</head>
<body>
aaaaaaaaaaaaaaaaaaaaaaaaaaaa

<h3>Employees Details</h3>
		
	<c:if test="${!empty employeeList}">
		<table class="data">
			<tr>
				
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Telephone</th>
				<!-- <th>Username</th>
				<th>Password</th> -->
				
				
			</tr>
			<c:forEach items="${employeeList}" var="employeeBean">
				<tr>
					<td> ${employeeBean.firstName}</td>
					<td>${employeeBean.lastName}</td>
					<td>${employeeBean.email}</td>
					<td>${employeeBean.telephone}</td>
				<%-- 	<td>${employeeBean.userName}</td>
					<td>${employeeBean.password}</td> --%>
					
					<td><a href="edit?id=${employeeBean.id}">Edit</a></td>
      <td><a href="delete?id=${employeeBean.id}">Delete</a></td>
					<%-- <td><a href="delete/${employeeBean.id}">delete</a></td>--%>
					<td><a href="edit/${employeeBean.id}">Edit</a></td> 
				</tr>
			</c:forEach>
		</table> 
	</c:if>
</body>
</html>