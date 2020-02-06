<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos</title>
<style>

div {
	text-align: center;
}
/* unvisited link */
a:link {
	color: #51030d;
}

/* visited link */
a:visited {
	color: #51030e;
}

/* mouse over link */
a:hover {
	color: #51030f;
}

/* selected link */
a:active {
	color: #51030dg;
}
</style>
</head>
<body background="sandia.jpg">
	<h1
		style="color: #51030d; font-size: 50px; text-align: center;">
		<i>Bienvenide ${usuario.nombre }
			</i>
	</h1>
	<marquee
		style="color: #51030d; font-family: Bodoni MT Condensed; font-size: 30px">
		Bienvenides todes a nuestra web</marquee>
		
		<a style="font-family: Calibri (Cuerpo); font-size: 30px;" href="final">Pincha para ver tus datos</a>
</body>
</html>