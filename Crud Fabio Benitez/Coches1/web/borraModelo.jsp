<%-- 
    Document   : borraSocio
    Created on : 20-mar-2019, 23:20:29
    Author     : FABIO
--%>

<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Statement"%>

<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

  <head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  </head>

  <body>

    <%

      Class.forName("com.mysql.jdbc.Driver");

      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches1","root", "");

      Statement s = conexion.createStatement();



      s.execute ("DELETE FROM modelo WHERE CodigoMod=" + request.getParameter("codigo"));

    %>	

    <script>document.location = "pideNumeroModelo.jsp" </script> 
  </body>

</html>