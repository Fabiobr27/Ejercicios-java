<%-- 
    Document   : login
    Created on : 15-may-2019, 8:35:41
    Author     : FABIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <style>
            
      
            
                    body{
                background-image: url("img/fondo2.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                font-weight: 250;
                line-height: 1.42em;
                color:#A7A1AE;

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
                width: 50%;
                border-radius: 25px;
                text-align: center;
                position: relative;
                          left: 20%;
                margin: 1%;
                padding: 0%; 
                
            }

            .wrapper h1 {
                text-align: center;
                color: #FFF;
                font: 250 3.6em 'Roboto Condensed', 'Open Sans', Arial, 'Helvetica Neue', Sans-serif, Verdana;
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

            #MensajeError{color: white;
                          font-size: 1.3vw; 
                          position: relative;
                          left: 20%;
                     
                             
            }
            
        </style>
   <title>Registro</title>
    </head>
    <body>
       
   

 <div class="wrapper">


            <!-- Formulario -->
            <form action="validaUsuario.jsp" method="post" class="login">
                <h2>Registrarse</h2>

                <!-- Contenedor del Formulario -->
                <div class="login-container">
                    <label>Usuario</label>
                    <input type="text" name="Usuario"/>
                    <label>Contraseña </label>
                    <input type="password" name="Contrasena"/></br>
                



                    <input type="submit" value="Registrarse" class="primary_action">
                    
                </div>
            </form>  
           
            <div id="MensajeError">
            
               
            <%= session.getAttribute("error") == null ? "" : session.getAttribute("error") %>
                
        <p></p>
        </div>
        
          
         <form action="index.jsp">

            <input type="submit" value="Inicio">
        </form>
     
        </div>
    </body>
</html>
