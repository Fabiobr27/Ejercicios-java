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

    </head>

    <body>

        <%

            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches1", "root", "");

            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

           // String CodEspe ="select MAX(CodEspe) from especificaciones";
            
            String insercion = "INSERT INTO especificaciones (Caballos, Año, CodigoMod , Combustible) VALUES (" 
                    + " " + Integer.valueOf(request.getParameter("Caballos"))
                    + ", " + Integer.valueOf(request.getParameter("Año"))
                    + " , " + Integer.valueOf(request.getParameter("CodigoMod"))
                    + ", '" + request.getParameter("Combustible") + "')";
            
           s.execute(insercion);
            conexion.close();

             
            //out.print(insercion);
          
        %>



         <script>document.location = "index.jsp" </script> 
    </body>

</html>