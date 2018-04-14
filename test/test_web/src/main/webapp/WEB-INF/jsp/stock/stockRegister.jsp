<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<center>
 <div style="color: teal; font-size: 30px">Tech M | Stock
   Registration</div>


<form:form  action="addStock" commandName="stockBean" method="post">
   <table>
			
			<tr>
				<td><form:label path="stockCode">stockCode</form:label></td>
				<td><form:input path="stockCode" /></td>
				<td><form:errors path="stockCode" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="stockName">stockName</form:label></td>
				<td><form:input path="stockName" /></td>
				<td><form:errors path="stockName" cssClass="error"></form:errors></td>
			</tr>
			
			
			<tr>
				<td><form:label path="compName">compName</form:label></td>
				<td><form:input path="compName" /></td>
				<td><form:errors path="compName" cssClass="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="compDesc">compDesc</form:label></td>
				<td><form:input path="compDesc" /></td>
				<td><form:errors path="compDesc" cssClass="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="remark">remark</form:label></td>
				<td><form:input path="remark" /></td>
				<td><form:errors path="remark" cssClass="error"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
		
		<a href="employeelistMethod">Click Here to see Stock List</a>  
		
		<h3>Stock Details</h3>
		
	<c:if test="${!empty employeeList}">
		<table class="data">
			<tr>
				
				<th>FirstName</th>
				<th>LastName</th>
				
			</tr>
			<c:forEach items="${employeeList}" var="employeeBean">
				<tr>
					<td> ${employeeBean.compDesc}</td>
					<td>${employeeBean.compDesc}</td>
					
					<td><a href="edit?id=${stockBean.id}">Edit</a></td>
      <td><a href="delete?id=${stockBean.id}">Delete</a></td>
      
      
      
      
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