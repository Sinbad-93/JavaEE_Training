<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Project Java EE</title>
</head>
<body>
<%@ include file="menu.jsp" %>

<p>Bonjour ${ !empty name ? name : 'invité'} !</p>

<p>Liste des clients ${ noms[0]} !</p>

<p>
${auteur.name} ${auteur.famillyName} 
Actif : ${auteur.actif ? 'Oui' : 'Non'}
</p>
</body>
</html>