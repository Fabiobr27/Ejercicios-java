<%-- 
    Document   : index
    Created on : 15-may-2019, 8:29:47
    Author     : FABIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title> Base De Datos Coches Prueba</title>
        <meta charset="UTF-8">
       
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="shortcut icon" href="img/favicon.ico" />
        
        <style>
                   body{
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                font-weight: 50;
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
                width: 50%;
                margin: 0 auto;
                display: table;
                padding: 0 0 8em 0;
           
            }

            .container td, .container th {
                padding-bottom: 2%;
                padding-top: 2%;
                padding-left:2%;   
                text-decoration: none;
            }

            /* Background-color of the odd rows */
            .container tr:nth-child(odd) {
                background-color: #323C50;
                text-decoration: none;
            }

            /* Background-color of the even rows */
            .container tr:nth-child(even) {
                background-color: #2C3446;
            }

            .container th {
                background-color: #1F2739;
            }

            .container td:first-child { color: #FB667A; 
            text-decoration: none;}

             .container td a:first-child { color: #FB667A; 
            text-decoration: none;}

            .container tr:hover {
                background-color: #464A52;
                -webkit-box-shadow: 0 6px 6px -6px #0E1119;
                -moz-box-shadow: 0 6px 6px -6px #0E1119;
                box-shadow: 0 6px 6px -6px #0E1119;
              text-decoration: none;}
            

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
             <%
      
        if(session.getAttribute("Usuario") == null){
            %>
            <button>
            <p><a href="login.jsp" style="text-decoration:none;" >Logeate</a></p>
            </button>
            
            
            <table class="container">
            <thead>
                <tr>
                    <th><h1>Marcas</h1></th>
                    <th><h1>Modelos</h1></th>
                    <th><h1>Especificaciones</h1></th> 
                </tr>
                <tr>
                    <td><a href="ListaMarcas.jsp" style="text-decoration: none">Mostrar Marcas</a></td>
                    <td><a href="PideModelo.jsp" style="text-decoration: none">Mostrar Modelo </td>
                    <td><a href="PideEspecificacion.jsp" style="text-decoration: none">Mostrar Especificaciones</a> </td>
                </tr>
            <%
                
        }else{

%>
           
            <button >
                 <p><a href="logout.jsp" style="text-decoration:none;">Cerrar Sesion</a></p>

            </button>
           
            
            
            <table class="container">
            <thead>
                <tr>
                    <th><h1>Marcas</h1></th>
                    <th><h1>Modelos</h1></th>
                    <th><h1>Especificaciones</h1></th> 
                </tr>
                <tr>
                    <td><a href="ListaMarcas.jsp" style="text-decoration: none">Mostrar Marcas</a></td>
                    <td><a href="PideModelo.jsp" style="text-decoration: none">Mostrar Modelo </td>
                    <td><a href="PideEspecificacion.jsp" style="text-decoration: none">Mostrar Especificaciones</a> </td>
                </tr>
                <tr>
                    <td><a href="formularioMarcas.jsp" style="text-decoration: none" >Insertar Marcas</a></td>
                    <td><a href="formularioModelo.jsp" style="text-decoration: none" >Insertar Modelo</a> </td>
                    <td><a href="formularioEspeci.jsp" style="text-decoration: none" >Insertar Especificaciones</a> </td>
                </tr>
                <tr>
                    <td><a href="pideNumeroMarcas.jsp" style="text-decoration: none" >Modificar Marcas</a></td>
                    <td><a href="pideNumeroModelo.jsp" style="text-decoration: none" >Modificar Modelo</a> </td>
                    <td><a href="pideNumeroEspeci.jsp" style="text-decoration: none" >Modificar Especificaciones</a> </td>
                </tr>
            </thead>
            <tbody>
            </tbody>
 </table>
               
           <%}%>

 





    </body>
</html>
