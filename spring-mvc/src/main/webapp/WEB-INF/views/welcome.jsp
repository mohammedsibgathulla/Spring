<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to JSP</title>
</head>
<body>
<h1>Welcome to Java Server Pages ${name}</h1>
<h2>Currenty the project is using CI & CD</h2>
<%
System.out.println("hi");
System.out.println(request.getParameter("name"));

Date date = new Date();
System.out.print(date);
%>
<h2>The current date is <%=date%></h2>

<h2>Hi User ${name}</h2>
<h2>You password is ${password}</h2>
</body>
</html>