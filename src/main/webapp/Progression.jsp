<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Progression</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="login-box">
	  <h2>Changer les coordonées d'un colis</h2>
		<form action="./UpdateColisServlet" method="get">
			<div class="user-box">
				<input type="text" name="id" id="iden">
				<label for="iden">Votre référence de colis:</label>
			</div>
			<div class="user-box">
				<input type="text" name="latitude" id="latitude">
				<label for="latitude">Latitude</label>
			</div>
			<div class="user-box">
				<input type="text" name="longitude" id="longitude">
				<label for="longitude">Longitude</label>
			</div>
			<div class="user-box">
				<input type="text" name="emplacement" id="emplacement">
				<label for="emplacement">Emplacement</label>
			</div>
			<div class="user-box">
				<input type="text" name="etat" id="etat">
				<label for="etat">Etat</label>
			</div>
			<input type="submit" value="Valider">
		</form>
	</div>
</body>
</html>