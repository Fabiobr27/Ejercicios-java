<%-- 
    Document   : logout
    Created on : 15-may-2019, 8:40:13
    Author     : FABIO
--%>


<%
session.removeAttribute("Usuario");
session.removeAttribute("error");
response.sendRedirect("index.jsp");


%>