<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>contacto</title>
</head>
<body>
<header>
<h1>Contacto</h1>
</header>
	<nav class="navbar navbar-light bg-light">
		<ul>
			<li> <a  class="navbar-brand" href="home">Home</a></li>
		</ul>
	</nav>
	<form action="mostrarConfirmacion">
		<div class="form-group">
			<label for="nombre">Nombre:</label>
			<input class="form-control" type="text" id="nombre" name="nombre">
		</div>
		<div class="form-group">
			<label for="apellido">Apellido:</label>
			<input class="form-control" type="text" id="apellido" name="apellido">
		</div>
		<input class="btn btn-primary" type="submit" value="Enviar">
	</form>
</body>
</html>