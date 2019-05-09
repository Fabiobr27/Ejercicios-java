package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ListaMarcas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ConectividadBaseDeDatos.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

          
          
           String NombreBaseDatos = "jdbc:mysql://localhost:3306/coches1" ;
           String nombre =  "root";
           String Contrasena = "";
           
        
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\" />\n");
      out.write("        <title>Lista Marcas</title>\n");
      out.write("         <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"img/fondo2.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-weight: 50;\n");
      out.write("                line-height: 1.42em;\n");
      out.write("                color:#A7A1AE;\n");
      out.write("                background-color:#1F2739;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-size:3em; \n");
      out.write("                font-weight: 300;\n");
      out.write("                line-height:1em;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #4DC3FA;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                font-size:1em; \n");
      out.write("                font-weight: 300;\n");
      out.write("                text-align: center;\n");
      out.write("                display: block;\n");
      out.write("                line-height:1em;\n");
      out.write("                padding-bottom: 2em;\n");
      out.write("                color: #FB667A;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 a {\n");
      out.write("                font-weight: 700;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #FB667A;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .blue { color: #185875; }\n");
      out.write("            .yellow { color: #FFF842; }\n");
      out.write("\n");
      out.write("            .container th h1 {\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 1em;\n");
      out.write("                text-align: left;\n");
      out.write("                color: #185875;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container td {\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-size: 1em;\n");
      out.write("                -webkit-box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("                -moz-box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("                box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                text-align: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("                width: 50%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                display: table;\n");
      out.write("                padding: 0 0 8em 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container td, .container th {\n");
      out.write("                padding-bottom: 2%;\n");
      out.write("                padding-top: 2%;\n");
      out.write("                padding-left:2%;  \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Background-color of the odd rows */\n");
      out.write("            .container tr:nth-child(odd) {\n");
      out.write("                background-color: #323C50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Background-color of the even rows */\n");
      out.write("            .container tr:nth-child(even) {\n");
      out.write("                background-color: #2C3446;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container th {\n");
      out.write("                background-color: #1F2739;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container td:first-child { color: #FB667A; }\n");
      out.write("\n");
      out.write("            .container tr:hover {\n");
      out.write("                background-color: #464A52;\n");
      out.write("                -webkit-box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("                -moz-box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("                box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container td:hover {\n");
      out.write("                background-color: #FFF842;\n");
      out.write("                color: #403E10;\n");
      out.write("                font-weight: bold;\n");
      out.write("\n");
      out.write("                box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;\n");
      out.write("                transform: translate3d(6px, -6px, 0);\n");
      out.write("\n");
      out.write("                transition-delay: 0s;\n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("                transition-property: all;\n");
      out.write("                transition-timing-function: line;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 800px) {\n");
      out.write("                .container td:nth-child(4),\n");
      out.write("                .container th:nth-child(4) { display: none; }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");


            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(NombreBaseDatos, nombre,Contrasena);

            Statement s = conexion.createStatement();

            ResultSet listado = s.executeQuery("SELECT * FROM marcas");

        
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <table class=\"container\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th><h1>Marca</h1></th>\n");
      out.write("                    <th><h1>Nombre marca</h1></th>\n");
      out.write("                    <th><h1>Año fundacion </h1></th>\n");
      out.write("                   \n");
      out.write("                    <th><h1><form action=\"index.html\">\n");
      out.write("\n");
      out.write("                                <input type=\"submit\" value=\"Inicio\">\n");
      out.write("                            </form></h1></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");
        while (listado.next()) {

                        out.println("<tr><td>");

                        out.println(listado.getString("CodigoMarca") + "</td>");

                        out.println("<td>" + listado.getString("NombreMarca") + "</td>");

                        out.println("<td>" + listado.getString("AñoFundacion") + "</td>");


                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
        } // while   

                    conexion.close();

                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("   \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
