<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


body{
background-color:#212A3E;
}
/* Form container */
.form-container {
  max-width: 500px;
  margin: 0 auto;
  padding: 20px;
  background-color: #f2f2f2;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Form input fields */
.form-container input[type=text], 
.form-container input[type=email], 
.form-container textarea {
  width: 100%;
  padding: 12px;
  margin: 8px 0;
  display: inline-block;
  border: none;
  border-radius: 6px;
  background-color: #f7f7f7;
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
  color: #444;
  font-size: 16px;
}

/* Form label */
.form-container label {
  font-weight: bold;
  display: block;
  margin-bottom: 5px;
}

/* Form input focus */
.form-container input[type=text]:focus, 
.form-container input[type=email]:focus, 
.form-container textarea:focus {
  outline: none;
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1), 0 0 5px #57b6e5;
}

/* Form submit button */
.form-container input[type=submit] {
  background-color: #57b6e5;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 6px;
  cursor: pointer;
  font-size: 18px;
  transition: background-color 0.3s ease;
}

/* Form submit button on hover */
.form-container input[type=submit]:hover {
  background-color: #378ec5;
}


</style>
</head>
<body class="form-container">
<div>
 <form action="saveemployee" method="post">
  Name :   <input type="text" name="name">
    <br>
     <br>
      <br>
   Phone :  <input type="text" name="phone">
    <br>
     <br>
      <br>
    Email : <input type="text" name="email">
    <br>
     <br>
      <br>
    Password : <input type="password" name="pass">
    <br>
     <br>
      <br>
    
    <input type="submit"></input>
    
 </form>
 </div>
</body>
</html>