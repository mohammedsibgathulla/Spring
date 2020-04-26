<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Java Server Pages ${name}</h1>
<%
System.out.println("hi");
System.out.println(request.getParameter("name"));

Date date = new Date();
System.out.print(date);
%>
<h2>The current date is <%=date%></h2>
</body>
</html>