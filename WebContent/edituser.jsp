<%@page import="dao.PersonneDao"%>
<jsp:useBean id="u" class="bean.Personne"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
	int i=PersonneDao.update(u);
	response.sendRedirect("viewusers.jsp");
%>