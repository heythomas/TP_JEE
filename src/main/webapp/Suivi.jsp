<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi Colis</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="login-box">
	  <h2>Suivre votre colis</h2>
		<form action="./FindColisServlet" method="get">
			<div class="user-box">
				<input type="text" name="id" id="iden">
				<label for="iden">Votre référence de colis:</label>
			</div>
			<input type="submit" value="Valider">
		</form>
	</div>
</body>
</html>