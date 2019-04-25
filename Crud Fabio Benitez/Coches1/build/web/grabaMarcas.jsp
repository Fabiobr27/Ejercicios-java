<%-- 
    Document   : grabaSocio
    Created on : 20-mar-2019, 23:19:13
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
         <link rel="stylesheet" type="text/css" href="Estilo/estilo.css" />
        <style>
            body{
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                color: white;
            }
            body h2{
                color: aqua;
            }
            form{
                background-color: rgba(51,51,51,0.85);
                border-radius: 25px;
                text-align: center;
                top: 20%;
                left: 25%;
                margin: 2%;
                padding: 2%;  
                width: 50%;
            }

            table{
                position: relative;
                left: 5%;
                width:10vw;
            }
        </style>

    </head>

    <body>

        <%

            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches1", "root", "");

            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

           
            String insercion = "INSERT INTO marcas VALUES ('"  + request.getParameter("NombreMarca")
                    + " ', " + Integer.valueOf(request.getParameter("CodigoMarca"))
                    + ", " + Integer.valueOf(request.getParameter("AñoFundacion")) + ")";

           s.execute(insercion);
            conexion.close();
          

        %>



      <script>document.location = "ListaMarcas.jsp"</script> 
    </body>

</html>