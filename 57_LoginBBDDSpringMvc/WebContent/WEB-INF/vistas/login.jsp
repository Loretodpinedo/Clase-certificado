<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body
	background="${pageContext.request.contextPath}/recursos/libro2.jpg">

	<h1
		style="color: #024b2e; font-family: Bodoni MT Condensed; font-size: 80px">
		<i>Bienvenides a nuestro hotel</i>
	</h1>

	<h2 style="color: rojo">${param.error}</h2>
	<h2 style="color: #024b2e">${param.hecho}</h2>
	<form action="validacion">

		<font color=" #024b2e " size="5"> Usuario:</font><input type="text"
			name="usuario" placeholder="Inserte su usuario"> <font
			color=" #024b2e " size="5">Password:</font> <input type="password"
			name="password" placeholder="Inserte su paswword" /> <input
			type="submit" value="Enviar"
			style="color: #024b2e; text-align: center"> <a
			href="registrarse">¿No estas registrado?</a>
	</form>



</body>
</html>