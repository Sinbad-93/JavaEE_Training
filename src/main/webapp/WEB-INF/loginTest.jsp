<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>

        <c:if test="${ !empty form.resultat }"><p><c:out value="${form.resultat}" /></p></c:if>
        
        <form method="post" action="FormTest">
           <p> <label for="login">Login : </label>
            <input type="text" name="login" id="login" />
           </p>
           <p> <label for="pass">Pass : </label>
            <input type="password" name="pass" id="pass" />
           </p>
            
            <input type="submit" />
        </form>
        
    </body>
</html>