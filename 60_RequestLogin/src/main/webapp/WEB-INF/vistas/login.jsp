<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<style type="text/css">
form{
color: #024b2e;
font-family: Bodoni MT Condensed;
font-size: 30px;
align-content: center;
}

</style>
</head>
<body>

<h1
		style="color: #024b2e; font-family: Bodoni MT Condensed; font-size: 80px">
		<i>Bienvenides</i>
	</h1>

	<form action="doLogin">

			Usuario:<input type="text" name="nombre" placeholder="Inserte su usuario"> 
			Password:<input type="password" name="pass" placeholder="Inserte su paswword" /> 
			<input style="color: #024b2e; text-align: center" type="submit" value="logarse">
						
	</form>


</body>
</html>