<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">
			<i>Bienvenides a nuestro hotel</i>
		</h1>


<form action="inicio">

		<font color="#027647" size="5"> Usuario:</font><input type="text" name="usuario" placeholder="Inserte su usuario"
			required="required"> 
		<font color="#027647" size="5">Password:</font> <input type="password"
			name="contraseña" placeholder="Inserte su paswword" />
			
			<input type="submit" value="Enviar" style="color: #027647; text-align: center"> 
			<a href="registrarse">¿No estas registrado?</a>
		</form>
		


</body>
</html>