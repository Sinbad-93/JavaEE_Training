<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Project Java EE</title>
</head>
<body>
<p>Bonjour Java EE !</p>
<%
String variable = (String) request.getAttribute("variable");
out.println(variable);

String heure = (String) request.getAttribute("heure");
if (heure.equals("jour")) {
    out.println("Bonjour"); 
}
else {
    out.println("Bonsoir");
}
%>

<p>
    <%
        for (int i = 0 ; i < 20 ; i++) {
            out.println("Une nouvelle ligne !<br />");
        }
    %>
</p>
</body>
</html>