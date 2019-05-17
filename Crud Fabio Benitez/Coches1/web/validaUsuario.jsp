<%-- 
    Document   : validaUsuario
    Created on : 15-may-2019, 8:36:37
    Author     : FABIO
--%>

<%
    String Usuario = request.getParameter("Usuario");
    String Contrasena = request.getParameter("Contrasena");
    if(Usuario.equals("admin") && Contrasena.equals("1234") ){
        session.setAttribute("Usuario", Usuario);
        response.sendRedirect("index.jsp");
    }else{
        
        session.setAttribute("error", "Nombre de usuario o contraseña incorrectos. Por favor intentelo de nuevo");
        response.sendRedirect("login.jsp");
    }

%>