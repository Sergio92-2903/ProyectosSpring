<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de registro</title>
</head>
<body>

	El alumno con nombre
	<strong>${elAlumno.nombre}</strong>, apellido
	<strong>${elAlumno.apellido}</strong>, edad
	<strong>${elAlumno.edad}</strong> y email
	<strong>${elAlumno.email}</strong> se ha registrado con éxito. El
	código postal es
	<strong>${elAlumno.codigoPostal}</strong> La asignatura escogida es:
	<strong>${elAlumno.optativa}</strong> .
	<br /> La provincia donde iniciará los estudios el alumno es:
	<strong>${elAlumno.ciudadEstudios}</strong>.
	<br /> Los idiomas que cursará ${elAlumno.nombre} ${elAlumno.apellido}
	son:
	<strong>${elAlumno.idiomasAlumnos}</strong>.


</body>
</html>