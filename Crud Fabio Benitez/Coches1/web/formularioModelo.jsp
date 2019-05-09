<%-- 
    Document   : formularioSocio
    Created on : 20-mar-2019, 23:21:35
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
        <title>Formulario Modelo</title>
        <style>

            #RecogidaDatos{
                background-color: rgba(51,51,51,0.85);
                border-radius: 25px;
                text-align: center;
                float:left;
                margin: 2%;
                padding: 2%;  
                width: 5%;
            }



            body{
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                font-weight: 300;
                line-height: 1.42em;
                color:#A7A1AE;

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
                font-weight: 30;
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
                float:left;
                width:1vw;
                text-align: left;
                overflow: hidden;
                width: 55%;
                margin: 0 auto;
                display: table;
                padding: 0 0 8em 0;
                font-size: 15px;
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
            * {
                margin: 0;
                padding: 0;
            }

            body {
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                font-size: 62.5%;
                font-family: 'Open Sans', Arial, 'Helvetica Neue', Sans-serif, Verdana;
            }

            /** =================================
             * Formulario de Logueo
            ====================================*/

            .wrapper {
                margin: 5px auto;
                max-width: 250px;
                width: 25%;
                border-radius: 25px;
                text-align: center;
                float:left;
                margin: 1%;
                padding: 0%; 

            }

            .wrapper h1 {
                text-align: center;
                color: #FFF;
                font: 300 3.6em 'Roboto Condensed', 'Open Sans', Arial, 'Helvetica Neue', Sans-serif, Verdana;
                text-shadow: 0 2px 0 rgba(0,0,0,0.2);
                margin-bottom: 40px;
            }

            .wrapper span {
                color: #74b5dd;
            }

            .login {
                overflow: hidden;
                background: #FFF;
                -webkit-border-radius: 4px;
                -moz-border-radius: 4px;
                border-radius: 4px;
                box-shadow: 0 0 100px rgba(255,255,255,0.15);
            }

            .login h2 {
                display: block;
                padding: 15px 0;
                margin-bottom: 40px;
                border-bottom: 1px solid #649bbd;
                color: #FFF;
                font: 400 3em 'Roboto Condensed', 'Open Sans', Arial, 'Helvetica Neue', Sans-serif, Verdana;
                text-align: center;
                text-shadow: 0 2px 0 rgba(0,0,0, 0.15);
                background: #74b5dd;
                background: -webkit-linear-gradient(#78b7de, #6ea8cc);
                background: -moz-linear-gradient(#78b7de, #6ea8cc);
                background: -o-linear-gradient(#78b7de, #6ea8cc);
                background: linear-gradient(#78b7de, #6ea8cc);
                -webkit-box-shadow: inset 0 1px 1px rgba(255,255,255, 0.4);
                -moz-box-shadow: inset 0 1px 1px rgba(255,255,255, 0.4);
                box-shadow: inset 0 1px 1px rgba(255,255,255, 0.4);
            }

            .login-container {
                padding: 0 30px 30px;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }

            .login input[type="text"], .login input[type="password"] {
                height: 46px;
                width: 100%;
                display: block;
                padding: 0 10px;
                font-size: 1.6em;
                background: #FFF;
                border: 1px solid #CCC;
                color: #4d4d4d;
                -webkit-border-radius: 4px;
                -moz-border-radius: 4px;
                border-radius: 4px;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
                -webkit-transition: border-color 0.4s ease;
                -o-transition: border-color 0.4s ease;
                transition: border-color 0.4s ease;
            }

            .login input[type="text"]:focus, .login input[type="password"]:focus {
                outline: 0;
                border-color: #73b2d9;
            }

            .login label {
                display: block;
                margin-bottom: 12px;
                color: #353942;
                font-weight: 700;
                font-size: 1.6em;
            }

            .login input + label {
                margin-top: 25px;
            }

            .primary_action {
                width: 100%;
                height: 54px;
                margin-top: 30px;
                display: inline-block;
                border: 0;
                color: #FFF;
                text-shadow: 0 -1px 1px rgba(0,0,0,0.2);
                font-size: 1.6em;
                font-weight: 700;
                text-align: center;
                cursor: pointer;
                background: #78b7de;
                -webkit-box-shadow: 0 2px 0 #4a718a;
                -moz-box-shadow: 0 2px 0 #4a718a;
                box-shadow: 0 2px 0 #4a718a;
                -webkit-border-radius: 4px;
                -moz-border-radius: 4px;
                border-radius: 4px;
                -webkit-transition: background 0.3s ease;
                -o-transition: background 0.3s ease;
                transition: background 0.3s ease;
            }

            .primary_action:focus {
                outline: 0;
            }

            .primary_action:hover {
                opacity: 1;
                background: #558eb1;
            }

        </style>
    </head>

    <body>
        <%            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(NombreBaseDatos, nombre, Contrasena);

            Statement s = conexion.createStatement();

            ResultSet listado = s.executeQuery("SELECT NombreMarca, NombreMod , CodigoMod , ma.CodigoMarca"
                    + " FROM modelo mo  , marcas ma "
                    + "Where mo.CodigoMarca = ma.CodigoMarca " + "order by CodigoMod");


        %>

        <table class="container">
            <thead>
                <tr>
                    <th><h1>Nombre Marca</h1></th>
                    <th><h1>Nombre Modelo</h1></th>
                    <th><h1>Codigo Modelo</h1></th>
                    <th><h1>Codigo Marca</h1></th>
                    <th><h1><form action="index.html">

                                <input type="submit" value="Inicio">
                            </form></h1></th>
                </tr>
            </thead>
            <tbody>
                <%                    while (listado.next()) {

                        out.println("<tr><td>");

                        out.println(listado.getString("NombreMarca") + "</td>");

                        out.println("<td>" + listado.getString("NombreMod") + "</td>");

                        out.println("<td>" + listado.getString("CodigoMod") + "</td>");

                        out.println("<td>" + listado.getString("CodigoMarca") + "</td>");

                %>

                </tr>

                <%       } // while   

                    conexion.close();

                %>

        </table>


        <div class="wrapper">


            <!-- Formulario -->
            <form action="grabaModelo.jsp" method="post" class="login"> 
                <h2>Inserta Modelo</h2>

                <!-- Contenedor del Formulario -->
                <div class="login-container">
                    <label>Codigo Modelo</label>
                    <input type="text" name="CodigoMod"/>
                    <label>Nombre Modelo</label>
                    <input type="text" name="NombreModelo"/>
                    <label>Codigo Marca</label>
                    <input type="text" name="CodigoMarca"/>>




                    <input type="submit" value="Confirmar" class="primary_action">

                </div>
            </form>
        </div>



    </body>


</html>
