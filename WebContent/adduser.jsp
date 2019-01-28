<%@ page import="dao.PersonneDao" %>  
<jsp:useBean id="u" class="bean.Personne"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%
    	int i=PersonneDao.save(u);  
    if(i>0){  
    	response.sendRedirect("viewusers.jsp");  
    }else{  
    	response.sendRedirect("adduserform.jsp");  
    }
    %>