<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
</head>
<body>
<h1>Employee Login</h1>
<p><font color="red">${errorMessage}</font></p>
<form action="/spring-mvc/employee_login" method="post">
<label>Username</label>
<input type="text" name="name">

<label>Password</label>
<input type="password" name="password">

<button type="submit" value="Login">Login</button>
</form>
</body>
</html>