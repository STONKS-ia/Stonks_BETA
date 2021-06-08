<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<link href="${contextPath}/css/atualizarMunicipio.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@200;300;400;500;600;700&display=swap"
	rel="stylesheet" />
	
<title>Atualizar Municipio</title>

</head>
<body>
	<form:form modelAttribute="municipioModel" action="${contextPath}/municipio/${municipioModel.idMunicipio}" method="put" class="container">
	
		<h1>Atualizar Municipio</h1>
		
		<form:input type="text" path="nomeMunicipio" id="municipio"	name="municipio" placeholder="Nome Município" maxlength="50" size="50" />
		<font color="red"><form:errors path="nomeMunicipio"/></font><br/>
		
		<form:input type="text" path="urlPortal" id="portal" name="portal" placeholder="Portal de transparência" maxlength="50" size="50" />
		<font color="red"><form:errors path="urlPortal"/></font><br/>
		
		<button type="submit">Atualizar</button>
	</form:form>
</body>
</html>
