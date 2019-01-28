<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Utilisateurs</title>
<link href="style.css" style="stylesheet">
</head>
<body>

<%@page import="dao.PersonneDao,bean.Personne,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Utilisateurs</h1>

	<%
		List<Personne> list = PersonneDao.getAllRecords();
			request.setAttribute("list",list);
	%>

	<table>
	<tr>
		<th>Id</th>
		<th>Nom</th>
		<th>Prénom</th>
		<th>Téléphone</th>
		<th>E-Mail</th>
		<th>Adresse</th>
		<th>Mot de passe</th>
		<th>Level</th>
		<th>Association</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.getId()}</td>
			<td>${u.getNom()}</td>
			<td>${u.getPrenom()}</td>
			<td>${u.getTel()}</td>
			<td>${u.getMail()}</td>
			<td>${u.getAdresse()}</td>
			<td>${u.getMdp()}</td>
			<td>${u.getLevel()}</td>
			<td>${u.getAssociation()}</td>
			
			<td><a href="editform.jsp?id=${u.getId()}">Modifier</a></td>
			<td><a href="deleteuser.jsp?id=${u.getId()}">Effacer</a></td>
		</tr>
	</c:forEach>
	</table>
<br/><a href="adduserform.jsp">Ajout Adhérent</a>

</body>
</html>