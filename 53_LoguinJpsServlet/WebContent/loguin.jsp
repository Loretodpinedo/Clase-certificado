<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>

<style>

div {
text-align: center;
}

</style>
</head>
<body>

<h1
			style="color: #1cb1bl; font-family: Calibri (Cuerpo); font-size: 60px">
			<i>Registro</i>
		</h1>
		
		<form method="post" action="ServletLoguin">
		<font color="#1cb1db" size="5">Usuario:</font><input type="text"
			name="User" placeholder="Inserte el nombre de usuario"
			required="required" /> 
			<br /> 
		<font color="#1cb1db" size="5">Password:</font><input
			type="password" name="password" placeholder="Inserte la contraseña"
			required="required" /> 
			<br />
			
		<input type="submit" value="Enviar">
		
	</form>	
	<form action="UnMontonDeJabon.html">
		<input type="submit" value="Volver">
	</form>
	

</body>
</html>