<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/w3.css" rel="stylesheet">
<title>${titulo}</title>
</head>
<body>
<header>
		<div class="w3-row">
			<div class="w3-col s3"><img src="img/logo.jpg" alt="logo" class="w3-image" height="150" width="150"></div>
			<div class="w3-container w3-col s9"><h2 class="w3-center">${tituloPag}</h2></div>
		</div>
		<div class="w3-bar w3-black w3-container">
			<a href="#" class="w3-bar-item w3-button w3-padding-24">Inicio</a>
			<div class="w3-dropdown-hover">
				<button class="w3-button w3-padding-24">Canchas</button>
				<div class="w3-dropdown-content w3-bar-block w3-card-4 w3-black">
					<a href="#" class="w3-bar-item w3-button w3-padding-24">Futbol</a>
					<a href="#" class="w3-bar-item w3-button w3-padding-24">Tenis</a>
					<a href="#" class="w3-bar-item w3-button w3-padding-24">Padel</a>
				</div>
			</div>
			<a href="#" class="w3-bar-item w3-button w3-padding-24">Agregar mi club</a>
			<a href="#" class="w3-bar-item w3-button w3-padding-24">Login</a> 
		</div>
	</header>
