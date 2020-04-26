<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>
<form action="/welcome" method="post">
<label>Username</label>
<input type="text" name="username">

<label>Password</label>
<input type="password" name="password">

<button type="submit" value="Login">Login</button>
</form>
</body>
</html>