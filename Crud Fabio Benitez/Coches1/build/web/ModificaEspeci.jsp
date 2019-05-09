<%-- 
    Document   : ModificaSocio
    Created on : 21-mar-2019, 10:35:27
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
              <title>Modificar Especie</title>

        <style>

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
                margin: 60px auto;
                max-width: 450px;
                width: 80%;
                position: relative;
                left: -20%;
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
        <% request.setCharacterEncoding("UTF-8");%>

        <div class="wrapper">


            <!-- Formulario -->
            <form action="ActualizaEspeci.jsp" method="post" class="login">
                <h2>Modifica Especificacion</h2>

                <!-- Contenedor del Formulario -->
                <div class="login-container">
                    <input type="hidden"  name="CodEspe" value="<%= request.getParameter("CodEspe")%>">
                    <label>Caballos</label>
                    <input type="text"  name="Caballos" value="<%= request.getParameter("Caballos")%>">
                    <label>Año</label>
                    <input type="text"  name="Año" value="<%= request.getParameter("Año")%>">
                    <label>Combustible</label>
                    <input type="text"  name="Combustible" value="<%= request.getParameter("Combustible")%>">



                    <input type="submit" value="Confirmar" class="primary_action">
                    <input type="submit" value="Volver" href="index.html" class="primary_action" />
                </div>
            </form>
        </div>

    </body>
</html>

