<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<link href="${contextPath}/css/signIn.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@200;300;400;500;600;700&display=swap"
	rel="stylesheet" />
<title>Logar</title>
</head>
<body>
	<form:form modelAttribute="usuarioModel" action="${contextPath}/usuario/login" method="post"
		class="container">

		<spring:hasBindErrors name="usuarioModel">
			<div class="alert alert-danger" role="alert">
				<form:errors path="*" class="has-error" />
			</div>
		</spring:hasBindErrors>

		<h1>S.T.O.N.K.S</h1>
		<form:input type="text" path="email" id="user" name="user"
			placeholder="Usuário" maxlength="50" size="50" />
		<font color="red"><form:errors path="email" /></font>
		<br />

		<form:input type="text" path="senha" id="password" name="password"
			placeholder="Senha" maxlength="50" size="50"  />
		<font color="red"><form:errors path="senha" /></font>
		<br />

		<button type="submit">Entrar</button>
	</form:form>
</body>
</html>