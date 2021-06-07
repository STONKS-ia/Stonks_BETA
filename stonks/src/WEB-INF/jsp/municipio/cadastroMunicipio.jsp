<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<link href="${contextPath}/css/cadastroMunicipio.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@200;300;400;500;600;700&display=swap"
	rel="stylesheet" />

<title>Cadastro Municipio</title>

</head>
<body>
	<form:form modelAttribute="municipioModel"
		action="${contextPath}/municipio" method="post" class="container">
		<h1>Novo Município</h1>
		<input type="text" id="municipio" name="municipio" placeholder="Nome Município">
		<input type="text" id="portal" name="portal" placeholder="Portal de transparência">
		<button type="submit">Entrar</button>
	</form:form>
</body>
</html>
