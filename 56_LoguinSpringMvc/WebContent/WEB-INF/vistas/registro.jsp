<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="final">
	<font color="#51030d" size="5">Nombre: </font><input type="text" name="nombre" value="" placeholder="nombre">
	<br/>
	<font color="#51030d" size="5">Dirección: </font><input type="text" name="direccion" value="" placeholder="direccion">
	<br/>
	<font color="#51030d" size="5">Edad: </font><input type="text" name="edad" value="" placeholder="edad">	
	<br/>
	<font color="#51030d" size="5">Contraseña: </font><input type="password" name="contraseña" value="" placeholder="contraseña">	
	<br/>
	
	<h3 style="color: #51030d; font-family: Calibri (Cuerpo); font-size: 30px">Hobbies</h3>
	<textarea rows="10" cols="20" name="hobbies"></textarea>
	<br/>
	<input type="submit" value="Enviar">
	</form>

</body>
</html>