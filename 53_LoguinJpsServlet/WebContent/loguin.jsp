<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>

</head>
<body background="sandia.jpg">

<h1
			style="color: #51030d; font-family: Calibri (Cuerpo); font-size: 60px; text-align: center;">
			<i>Registro</i>
		</h1>
		<!--  donde y como va a llevar-->
		<form action="ServletLoguin"  method="post" style="color: #51030d; font-size: 50px; text-align: center;">
		
		<font  >Usuario:</font> <br/><input type="text"
			name="nombre" placeholder="Inserte el nombre de usuario"
			required="required" /> 
			<br /> 
		<font>Contraseña:</font><br/><input
			type="password" name="contraseña" placeholder="Inserte la contraseña"
			required="required" /> 
			<br />
			
		<input type="submit" value="Enviar">
		
	</form>	
	
	

</body>
</html>