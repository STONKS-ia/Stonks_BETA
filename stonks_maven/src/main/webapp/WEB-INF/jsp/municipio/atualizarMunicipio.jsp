<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="src/css/atualizarMunicipio.css">
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@200;300;400;500;600;700&display=swap"
	rel="stylesheet" />
<title>Atualizar Municipio</title>
</head>
<body>
	<form:form modelAttribute="municipioModel" action="${contextPath}/municipio/${municipioModel.id}" method="put" class="container">
		<h1>Atualizar Municipio</h1>
		<form:input type="text" path="nomeMunicipio" id="municipio"	name="municipio" placeholder="Nome Município" />
		<form:input type="text" path="urlPortal" id="portal" name="portal" placeholder="Portal de transparência" />
		<button type="submit">Mandar</button>
	</form:form>
</body>
</html>
