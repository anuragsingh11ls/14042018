<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<center>
 <div style="color: teal; font-size: 30px">Tech M | Employee
   Registration</div>


<form:form  action="addEmployee" commandName="employeeBean" method="post">
   <table>
			
			<tr>
				<td><form:label path="firstName">FirstName</form:label></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="lastName">LastName</form:label></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="telephone">Telephone</form:label></td>
				<td><form:input path="telephone" /></td>
				<td><form:errors path="telephone" cssClass="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="userName">UserName</form:label></td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
		
		<a href="employeelistMethod">Click Here to see Employee List</a>  
		
		<h3>Employees Details</h3>
		
	<c:if test="${!empty employeeList}">
		<table class="data">
			<tr>
				
				<th>FirstName</th>
				<th>LastName</th>
				
			</tr>
			<c:forEach items="${employeeList}" var="employeeBean">
				<tr>
					<td> ${employeeBean.firstName}</td>
					<td>${employeeBean.lastName}</td>
					
					<td><a href="edit?id=${employeeBean.id}">Edit</a></td>
      <td><a href="delete?id=${employeeBean.id}">Delete</a></td>
      
      
      
      
					<%-- <td><a href="delete/${employeeBean.id}">delete</a></td>
					<td><a href="edit/${employeeBean.id}">Edit</a></td> --%>
				</tr>
			</c:forEach>
		</table> 
	</c:if>
		

</form:form>
</center>
</body>
</html>