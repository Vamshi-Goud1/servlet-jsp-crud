<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{
background-color:#4F4557;
}

.form-container {
  max-width: 500px;
  margin: 0 auto;
  padding: 20px;
  background-color: #f2f2f2;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Input box */
.form-container input[type=text] {
  width: 100%;
  padding: 12px;
  margin-bottom: 10px;
  display: inline-block;
  border: none;
  border-radius: 6px;
  background-color: #f7f7f7;
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
  color: #444;
  font-size: 16px;
}

/* Delete button */
.form-container input[type=submit] {
  background-color: #f44336;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.3s ease;
}

.form-container input[type=submit]:hover {
  background-color: #d32f2f;
}
</style>
</head>
<body>
	<div class="form-container">
		<form action="deleteemployee" method="post">


			Id: <input type="text"  name="id" required>
			 <br> <br> <input type="submit" value="Delete">


		</form>
	</div>
</body>
</html>