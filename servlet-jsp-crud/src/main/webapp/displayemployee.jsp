<%@page import="com.jsp.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  /* CSS for table */
  table {
    width: 100%;
    border-collapse: collapse;
  }

  th, td {
    border: 1px solid #ddd;
    padding: 8px;
  }

  th {
    background-color: #f2f2f2;
  }

  /* CSS for table styling */
  .table-container {
    margin: 20px;
  }
</style>
</head>
<body>
	<%
	List<Employee> list = (List<Employee>) request.getAttribute("emp");
	%>
	
	

<div class="table-container">
  <table>
    <tr>
      <th>ID</th>
      <th>Email</th>
      <th>Name</th>
      <th>Password</th>
      <th>Phone</th>
    </tr>
    <%
		for (Employee employee : list) {
		%>

		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getPassword()%></td>
			<td><%=employee.getPhone()%></td>
		</tr>

		<%
		}
		%>
    
    <!-- Add more rows as needed -->
  </table>
</div>
	
</body>
</html>