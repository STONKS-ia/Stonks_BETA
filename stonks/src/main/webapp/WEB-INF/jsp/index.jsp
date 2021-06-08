<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<link href="${contextPath}/css/style.css" rel="stylesheet">

<title>Home page</title>
</head>
<body>
	<header class="header">
		<div class="circle c1"></div>
		<div class="circle c2"></div>
		<h1 class="logo">
			<div class="arrow"></div>
		</h1>
		<h2 class="slogan">
			Seja Bem Vindo.<span class="ps"> Essa é a tela administrativa.</span>
		</h2>
		<div class="btns">
			<a href="${contextPath}/municipio"><button class="btn btn--primary">Municipio</button></a>
			<a href="${contextPath}/usuario"><button class="btn">Usuario</button></a>
		</div>
		<div class="hill"></div>
	</header>
</body>
</html>