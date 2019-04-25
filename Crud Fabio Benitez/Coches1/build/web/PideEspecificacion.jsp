<%-- 
    Document   : PideEspecificacion
    Created on : 11-abr-2019, 21:08:49
    Author     : FABIO
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%> 
<%@page import="java.sql.DriverManager"%> 
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/favicon.ico" />
        <title>Pide Especificacion</title>


        <style>
         

            * { box-sizing: border-box; }

            body {
                font-family: "Lato", sans-serif;
                background-color: #c7b7a7;
                background-image: url(img/fondo2.jpg);
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
            }

            main {
                position: relative;
                top: 50%;
                left: 10%;
                width: 30%;
                max-width: 900px;
                margin: 2%;
                text-align: center;
              color: white;
                padding: 4%;
                font-size: 100%;
            }

            .menu {
                margin: 4rem auto;
                max-width: 300px;
                text-transform: uppercase;
                font-weight: 700%;
                padding: 2px;
                font-size: 5%;
            }

            .panel,
            .dropdown .row {
                padding: 12px 15px;
                background-color: #f8f8f8;
                color: #888888;
                border-radius: 3px;
                box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
                display: flex;
                justify-content: space-between;
                align-items: center;
                text-decoration: none;
            }

            .text { font-size: 30px; }
           

            .panel :hover {
                color: #6c6c6c;
                cursor: pointer;
            }

            input#toggle { display: none; }
            input#toggle ~ .dropdown { display: block; }
            input#toggle:checked ~ .dropdown { display: none; }

            .dropdown { margin-top: 7px; }

            .dropdown .arrow {
                width: 10%;
                height: 0;
                border-left: 7px solid transparent;
                border-right: 7px solid transparent;
                border-bottom: 9px solid #f8f8f8;
                margin-left: 20px;
            }

            .dropdown .row {
                border-radius: 0;
                box-shadow: none;
                box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
                text-align: left;
            }

            .dropdown .row:nth-child(2) { border-radius: 3px 3px 0 0; }
            .dropdown .row:last-child { border-radius: 0 0 3px 3px; }

            .dropdown:hover > .row { color: #bebebe; }

            .dropdown .row:hover {
                background-color: #ebebeb;
                color: #6c6c6c;
            }
        </style>
    </head>
    <body>
        <form  id = "RecogidaDatos" method="get" action="ListaEspeci.jsp" >
            <main>
                

            <h2>Señala la marca que quieres mostrar:</h2>
            <div class="menu">

                <div class="panel">
                    <label class="text" for="toggle">Modelo</label>
                    
                </div>

                <input type="checkbox" id="toggle">

                <div class="dropdown">
                    <div class="arrow"></div>

                    <a href="#" class="row">
                        <div class="text">  <select name="CodigoMod" onchange="salta(this.form)">
                        </div>
                        <i class="icon fas fa-user"></i>
                    </a>



  <%

                    Class.forName("com.mysql.jdbc.Driver");

                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches1", "root", "");

                    Statement s = conexion.createStatement();

                    ResultSet listado = s.executeQuery("SELECT  NombreMod, mo.CodigoMod"
                            + " FROM  modelo  mo, especificaciones espe "
                            + "Where mo.CodigoMod = espe.CodigoMod"
                    );
                %>



                    <option selected> ---
                         <%        while (listado.next()) {

                            out.println("<option value=\"" + (listado.getString("CodigoMod") + "\">" + listado.getString("NombreMod")));
                    %>







                        <%        } // while   

                            conexion.close();

                        %>
                </div>

            </div>
        </select>
        <input type="submit" value="Aceptar">  
        </main>
 
</body>
</html>

