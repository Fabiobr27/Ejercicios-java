<%-- 
    Document   : grabaSocio
    Created on : 20-mar-2019, 23:19:13
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
        <link rel="stylesheet" type="text/css" href="Estilo/estilo.css" />
        <style>
            body{
                background-image: url("img/fondo1.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                color: white;
            }
            body h2{
                color: black;
                font-size: 8vw;
                background-color: white;

            }
            #wrapper{
                background-color: rgba(51,51,51,0.85);
                border-radius: 25px;
                text-align: center;
                left: 25%;
                margin: 2%;
                padding: 2%;  
            }

            table{
                position: relative;
                left: 5%;
                width:10vw;
            }
        </style>

    </head>

    <body>

        <%            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(NombreBaseDatos, nombre, Contrasena);

            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

            String insercion = "INSERT INTO modelo VALUES ('" + request.getParameter("NombreModelo")
                    + " ', " + Integer.valueOf(request.getParameter("CodigoMod"))
                    + ", " + Integer.valueOf(request.getParameter("CodigoMarca")) + ")";

            s.execute(insercion);
            conexion.close();

        %>

        <script>document.location = "PideModelo.jsp"</script> 
        <a href="index.html" >Inicio</a>
    </body>

</html>