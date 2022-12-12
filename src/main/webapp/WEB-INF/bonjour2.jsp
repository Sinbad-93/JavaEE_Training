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
<c:set target="${auteur}" property="famillyName" value="Spin" />

${auteur.name} ${auteur.famillyName} 
Actif : ${auteur.actif ? 'Oui' : 'Non'}
</p>

<p><c:out value="J'utilise JSPL !" /></p>
<p><c:out value="${undefinedVariable}" default="J'adore JSPL !" /></p>
<p><c:out value="${undefinedVariable}">Aute manière valeur par défaut</c:out></p>

<c:set var="chat" value="Elvis" scope="page" />
<!--pour supprimer  <c:remove var="chat" scope="page" /> -->

<!-- 
Autre manière <c:set var="chat" scope="request" >Elvis</c:set>
<c:set var="chat" value="Elvis" scope="request" />
<c:set var="chat" value="Elvis" scope="session" />
<c:set var="chat" value="Elvis" scope="application" />
-->

<c:if test="${ 50 > 10 }" var="variable">
    C'est vrai !
</c:if>

<c:choose>
    <c:when test="${ variable }">Du texte</c:when>
    <c:when test="${ autreVariable }">Du texte</c:when>
    <c:when test="${ encoreUneAutreVariable }">Du texte</c:when>
    <c:otherwise></c:otherwise>
</c:choose>

<c:forEach var="i" begin="0" end="10" step="2">
    <p>Un message n°<c:out value="${ i }" /> !</p>
</c:forEach>
<c:forEach items="${ titres }" var="titre" varStatus="status">
    <p>N°<c:out value="${ status.count }" /> : <c:out value="${ titre }" /> !</p>
</c:forEach>
<c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/ ">
    <p>${ morceau }</p>
</c:forTokens>


</body>
</html>