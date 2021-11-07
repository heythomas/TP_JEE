<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi Colis</title>
</head>
<body>
	<form action="./FindColisServlet" method="get">
		<label for="iden">Votre référence de colis:</label>
		<input type="text" name="id" id="iden"><br/>
		<input type="submit" value="Chercher Colis">
	</form>
</body>
</html>