<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: #374259;
}

a {
	text-decoration: none;
	outline: none color: white;
}

fieldset {
	width: fit-content;
	border-radius: 5px;
	color: white;
	font-size: 20px;
	display: flex;
	align-items: center;
	padding-left: 10px;
	gap: 10px;
}
/* Button styles */
.button {
	display: inline-block;
	padding: 10px 20px;
	font-size: 16px;
	font-weight: bold;
	text-align: center;
	text-decoration: none;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

/* Primary button */
.button-primary {
	background-color: #57b6e5;
	color: white;
}

.button-primary:hover {
	background-color: #378ec5;
}

/* Secondary button */
.button-secondary {
	background-color: #f2f2f2;
	color: #444;
	border: 2px solid #ccc;
}

.button-secondary:hover {
	background-color: #e0e0e0;
}

/* Success button */
.button-success {
	background-color: #4caf50;
	color: white;
}

.button-success:hover {
	background-color: #45a049;
}

/* Danger button */
.button-danger {
	background-color: #f44336;
	color: white;
}

.button-danger:hover {
	background-color: #d32f2f;
}
</style>
</head>
<body>
	<fieldset>
		<legend>CrudOpertions</legend>
		<button class="button button-primary">
			<a href="register.jsp">Register Employee</a>
		</button>
		<br> <br>
		<button class="button button-danger">
			<a href="deleteemployee.jsp">Delete Employee</a>
		</button>
		<br> <br>
		<button class="button button-success">
			<a href="editemployee.jsp">Edit Employee</a>
		</button>
		<br> <br>
		<button class="button button-secondary">
			<a href="displayemployee">Display Employee</a>
		</button>
	</fieldset>
</body>
</html>