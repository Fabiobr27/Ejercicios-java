<%-- 
Document   : ActualizaMarcas
Created on : 11-abr-2019, 20:16:14
Author     : FABIO
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="ConectividadBaseDeDatos.jsp" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>


    </head>
    <body>
        <%            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(NombreBaseDatos, nombre, Contrasena);

            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

            String actualizacion = "UPDATE especificaciones SET "
                    + "Caballos =" + request.getParameter("Caballos")
                    + ",Año =" + request.getParameter("Año")
                    + ",Combustible ='" + request.getParameter("Combustible")
                    + "' Where CodEspe = " + Integer.parseInt(request.getParameter("CodEspe"));

            //out.println(actualizacion);
            s.execute(actualizacion);
            out.println("Modelo actualizado correctamente.");

            conexion.close();

        %>
        <br>
        <script>document.location = "pideNumeroEspeci.jsp"</script> 
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
