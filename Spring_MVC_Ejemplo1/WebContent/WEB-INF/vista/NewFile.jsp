<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registros</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
	
	Nombre : <form: input path="nombre"/>
	
	<br><br><br>
	
	Apellido : <form: input path="apellido"/> 
	
	<br><br><br>
	
	<input type="submit" value="Enviar">
	
	
	</form:form>

</body>
</html>