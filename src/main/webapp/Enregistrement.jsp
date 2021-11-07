<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enregistrement</title>
</head>
<body>
	<form action="./EnregistrementColisServlet" method="get">
		<label for="poids">Poids:</label>
		<input type="text" name="poids" id="poids"><br/>
		<label for="valeur">Valeur:</label>
		<input type="text" name="valeur" id="valeur"><br/>
		<label for="origine">Origine:</label>
		<input type="text" name="origine" id="origine"><br/>
		<label for="destination">Destination:</label>
		<input type="text" name="destination" id="destination"><br/>
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