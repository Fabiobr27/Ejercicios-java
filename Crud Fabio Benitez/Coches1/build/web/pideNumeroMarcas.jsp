<%-- 
    Document   : pideNumeroSocio
    Created on : 20-mar-2019, 23:05:45
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
        <link rel="shortcut icon" href="img/favicon.ico" />
        <style>
            body{
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                font-weight: 300;
                line-height: 1.42em;
                color:#A7A1AE;
                background-color:#1F2739;
            }

            h1 {
                font-size:3em; 
                font-weight: 300;
                line-height:1em;
                text-align: center;
                color: #4DC3FA;
            }

            h2 {
                font-size:1em; 
                font-weight: 300;
                text-align: center;
                display: block;
                line-height:1em;
                padding-bottom: 2em;
                color: #FB667A;
            }

            h2 a {
                font-weight: 700;
                text-transform: uppercase;
                color: #FB667A;
                text-decoration: none;
            }

            .blue { color: #185875; }
            .yellow { color: #FFF842; }

            .container th h1 {
                font-weight: bold;
                font-size: 1em;
                text-align: left;
                color: #185875;
            }

            .container td {
                font-weight: normal;
                font-size: 1em;
                -webkit-box-shadow: 0 2px 2px -2px #0E1119;
                -moz-box-shadow: 0 2px 2px -2px #0E1119;
                box-shadow: 0 2px 2px -2px #0E1119;
            }

            .container {
                text-align: left;
                overflow: hidden;
                width: 80%;
                margin: 0 auto;
                display: table;
                padding: 0 0 8em 0;
            }

            .container td, .container th {
                padding-bottom: 2%;
                padding-top: 2%;
                padding-left:2%;  
            }

            /* Background-color of the odd rows */
            .container tr:nth-child(odd) {
                background-color: #323C50;
            }

            /* Background-color of the even rows */
            .container tr:nth-child(even) {
                background-color: #2C3446;
            }

            .container th {
                background-color: #1F2739;
            }

            .container td:first-child { color: #FB667A; }

            .container tr:hover {
                background-color: #464A52;
                -webkit-box-shadow: 0 6px 6px -6px #0E1119;
                -moz-box-shadow: 0 6px 6px -6px #0E1119;
                box-shadow: 0 6px 6px -6px #0E1119;
            }

            .container td:hover {
                background-color: #FFF842;
                color: #403E10;
                font-weight: bold;

                box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;
                transform: translate3d(6px, -6px, 0);

                transition-delay: 0s;
                transition-duration: 0.4s;
                transition-property: all;
                transition-timing-function: line;
            }

            @media (max-width: 800px) {
                .container td:nth-child(4),
                .container th:nth-child(4) { display: none; }
            }
        </style>



    </head>

    <body>

        <%            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(NombreBaseDatos, nombre, Contrasena);

            Statement s = conexion.createStatement();

            ResultSet listado = s.executeQuery("SELECT * FROM marcas");

        %>


        <table class="container">
            <thead>
                <tr>
                    <th><h1>Codigo</h1></th>
                    <th><h1>Nombre</h1></th>
                    <th><h1>Año fundacion</h1></th>

                    <th><h1><form action="index.html">

                                <input type="submit" value="Inicio">
                            </form></h1></th>
                </tr>
            </thead>
            <tbody>


                <%        while (listado.next()) {

                        out.println("<tr><td>");

                        out.println(listado.getString("CodigoMarca") + "</td>");

                        out.println("<td>" + listado.getString("NombreMarca") + "</td>");

                        out.println("<td>" + listado.getString("AñoFundacion") + "</td>");

                %>

            <td>

                <form method="get" action="borraMarcas.jsp">

                    <input type="hidden" name="CodigoMarca" value="<%=listado.getString("CodigoMarca")%>"/>


                    <input type="submit" value="Borrar">
                    </td>
                    <td>

                </form>

                <form method="get" action="ModificaMarcas.jsp">

                    <input type="hidden" name="CodigoMarca" value="<%=listado.getString("CodigoMarca")%>"/>
                    <input type="hidden" name="NombreMarca" value="<%=listado.getString("NombreMarca")%>"/>
                    <input type="hidden" name="AñoFundacion" value="<%=listado.getString("AñoFundacion")%>"/>
                    <input type="submit" value="Modificar">

                </form>


            </td>
        </tr>

        <%

            } // while   

            conexion.close();

        %>

    </table>

</body>

</html>
