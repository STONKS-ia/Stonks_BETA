<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

<title>Municipios - Listagem</title>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${contextPath}/css/list.css" rel="stylesheet">
<link href="${contextPath}/css/bootstrap.css" rel="stylesheet">
<link href="${contextPath}/css/small-business.css" rel="stylesheet">

</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">

				<h1>Municipios</h1>

				<p class="toolbar">
					<a href="${contextPath}"><button class="btn btn-default">Voltar</button></a>
					<a class="create btn btn-default"
						href="${contextPath}/municipio/form?page=cadastroMunicipio">Novo
						Município</a>

				</p>

				<c:if test="${not empty messages}">
					<h3 class="alert alert-warning">${messages}</h3>
				</c:if>

				<table class="table table-striped">
					<thead>
						<tr>
							<th data-field=idMunicipio>IdMunicipio</th>
							<th data-field=nomeMunicipio>Nome</th>
							<th data-field="urlPortal">urlPortal</th>
							<th class="actions" width="220">Ações</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${municipios}" var="municipio">
							<tr>
								<td>${municipio.idMunicipio}</td>
								<td>${municipio.nomeMunicipio}</td>
								<td>${municipio.urlPortal}</td>

								<td class="actions"><form:form
										action="${contextPath}/municipio/${municipio.idMunicipio}"
										method="delete">

										<a class="btn btn-success btn-xs"
											href="${contextPath}/municipio/form?page=atualizarMunicipio&id=${municipio.idMunicipio}">Editar</a>
										<input type="submit" value="Excluir"
											class="btn btn-danger btn-xs">
									</form:form></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<hr>
	</div>

	<!-- jQuery -->
	<script src="${contextPath}/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${contextPath}/js/bootstrap.min.js"></script>

</body>
</html>