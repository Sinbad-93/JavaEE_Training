<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Java EE</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<p>Bienvenue sur l'accueil Java EE !</p>
<%
String variable = (String) request.getAttribute("variable");
out.println(variable);

%>
</body>
</html>