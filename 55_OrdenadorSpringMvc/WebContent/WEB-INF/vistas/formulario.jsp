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
	<font color="#1cb1dc" size="5">Nombre: </font><input type="text" name="nombre" value="" placeholder="nombre">
	<br/>
	<font color="#1cb1dc" size="5">Dirección: </font><input type="text" name="direccion" value="" placeholder="direccion">
	<br/>
	<font color="#1cb1dc" size="5">Email: </font><input type="text" name="email" value="" placeholder="email">
	<br/>
	
	<h3 style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px">¿Que procesador quieres?</h3>
	
	<input type="radio" name="procesador" value="i3">i3. 
	<input type="radio" name="procesador" value="i5">i5.
	<input type="radio" name="procesador" value="i7">i7.
	<input type="radio" name="procesador" value="i9">i9.
	
	<h3 style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px">¿Cuanta RAM quieres?</h3>

	<input type="radio" name="ram" value="8 gb">8 gb. 
	<input type="radio" name="ram" value="16 gb">16 gb.
	<input type="radio" name="ram" value="32 gb">32 gb.
	<input type="radio" name="ram" value="64 gb">64 gb.
 
 	
	<h3 style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px">¿Que perifericos quieres?</h3>
	
	<br/><input type="checkbox" name="componente" value="raton">Ratón.
	<br/><input type="checkbox" name="componente" value="pantalla">Pantalla.
	<br/><input type="checkbox" name="componente" value="teclado">Teclado.
	<br/><input type="checkbox" name="componente" value="Altavoz">Altavoz.
	
	<h3 style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px">Comentarios</h3>
	<textarea rows="10" cols="20" name="comentarios"></textarea>
	<br/>
	<input type="submit" value="Enviar">
	</form>

</body>
</html>