<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Progression</title>
</head>
<body>
	<h1>Changer les coordonées d'un colis</h1>
	<form action="./UpdateColisServlet" method="get">
		<label for="iden">Votre référence de colis:</label>
		<input type="text" name="id" id="iden"><br/>
		<label for="latitude">Latitude:</label>
		<input type="text" name="latitude" id="latitude"><br/>
		<label for="longitude">Longitude:</label>
		<input type="text" name="longitude" id="longitude"><br/>
		<label for="emplacement">Emplacement:</label>
		<input type="text" name="emplacement" id="emplacement"><br/>
		<label for="etat">Etat:</label>
		<input type="text" name="etat" id="etat"><br/>
		<input type="submit" value="Enregistrer Colis">
	</form>
</body>
</html>