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
			stripe landing page.<span class="ps"> Lorem ipsum dolor sit
				amet, consectetur adipisicing.</span>
		</h2>
		<div class="btns">
			<a href="${contextPath}/usuario/login?action=SignIn"><button class="btn btn--primary">Logar</button></a>
			<a href="${contextPath}/usuario/login?action=SignUp"><button class="btn">Cadastrar</button></a>
		</div>
		<div class="hill"></div>
	</header>
</body>
</html>