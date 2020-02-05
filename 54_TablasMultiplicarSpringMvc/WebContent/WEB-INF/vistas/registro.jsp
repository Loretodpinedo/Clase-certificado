<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>

</head>
<body
	background="http://localhost:8080/54_TablasMultiplicarSpringMvc/numbers.jpg">

	<h1
		style="color: black; font-family: Bodoni MT Condensed; font-size: 100px; text-align: center;">
		<i>Bienvenides</i>
	</h1>




	<marquee
		style="color: black; font-family: Bodoni MT Condensed; font-size: 30px">
		Registrate para ver las tablas</marquee>



	<form action="ControladorTabla"
		style="text-align: center; font-size: 25px">
		<font color=black size="5">Usuario</font><br /> <input type="text"
			name="User" placeholder="Inserte el nombre de usuario"
			required="required" /> <br /> <font color=black size="5">Password</font><br />
		<input type="password" name="password"
			placeholder="Inserte la contraseña" required="required" /> <br /> <input
			type="submit" value="Enviar">
	</form>
	<br />

	<form action="" style="text-align: center;">
		<a href="registro.html">¿No estas registrado?</a> <br /> <br /> <input
			type="submit" value="Volver">
	</form>



</body>
</html>