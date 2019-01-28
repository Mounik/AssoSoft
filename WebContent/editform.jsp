<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifier</title>
<link href="style.css" style="stylesheet">
</head>
<body>
<%@page import="dao.PersonneDao,bean.Personne"%>

<%
	String id = request.getParameter("id");
	Personne u = PersonneDao.getRecordById(Integer.parseInt(id));
%>

<h1>Modifier</h1>
	<form action="edituser.jsp" method="post">
		<input type="hidden" name="idpersonne" value="<%=u.getId()%>"/>
		<table>  
			<tr><td>Nom :</td><td><input type="text" name="nom"/></td></tr>
			<tr><td>Prénom :</td><td><input type="text" name="prenom"/></td></tr>
			<tr><td>Téléphone :</td><td><input type="text" name="tel"/></td></tr>
			<tr><td>Email:</td><td><input type="email" name="mail"/></td></tr>
			<tr><td>Adresse :</td><td><input type="text" name="adresse"/></td></tr>
			<tr><td>Mot de passe :</td><td><input type="password" name="mdp"/></td></tr>
			<tr><td>Level :</td><td><input type="text" name="level"/></td></tr>
			<tr><td>Association :</td><td><input type="text" name="idassociation"/></td></tr>
			  
			<tr><td colspan="2"><input type="submit" value="Sauvegarder"/></td></tr>  
		</table>
	</form>

</body>
</html>