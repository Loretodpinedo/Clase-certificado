<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrate</title>
</head>
<body>

<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">
			<i>Registrate</i>
		</h1>
		
		<form action="login">
		<font color="#027647" size="5">Usuario:</font><input type="text"
			name="usuario" placeholder="Inserte el nombre de usuario"
			required="required" /> 
			<br /> 
		<font color="#027647" size="5">Password:</font><input
			type="text" name="contraseña" placeholder="Inserte la contraseña"
			required="required" /> 
			<br />
		 <font color="#027647b" size="5">Email:</font><input type="text" name="email"
			placeholder="Inserte su email" required="required" />
			<br /> 
		<font color="#027647" size="5">Introduzca su telefono:</font><input
			type="text" name="telefono" placeholder="Inserte su telefono"
			required="required" /> 
			<br/> 
			
		<input type="submit" value="Enviar">
	</form>
	<form action="login">
		<input type="submit" value="Volver">
	</form>


</body>
</html>