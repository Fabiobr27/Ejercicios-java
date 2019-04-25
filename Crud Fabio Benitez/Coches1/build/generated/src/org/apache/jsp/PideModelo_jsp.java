package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class PideModelo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pide Modelo</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @import \"https://fonts.googleapis.com/css?family=Lato:300,700\";\n");
      out.write("            @import \"https://use.fontawesome.com/releases/v5.7.2/css/all.css\";\n");
      out.write("\n");
      out.write("            * { box-sizing: border-box; }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: \"Lato\", sans-serif;\n");
      out.write("                background-color: #c7b7a7;\n");
      out.write("                background-image: url(\"http://oi64.tinypic.com/i3zbs7.jpg\");\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            main {\n");
      out.write("                max-width: 900px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu {\n");
      out.write("                margin: 4rem auto;\n");
      out.write("                max-width: 300px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-weight: 700;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .panel,\n");
      out.write("            .dropdown .row {\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                background-color: #f8f8f8;\n");
      out.write("                color: #888888;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text { font-size: 16px; }\n");
      out.write("            .icon { font-size: 20px; }\n");
      out.write("\n");
      out.write("            .panel :hover {\n");
      out.write("                color: #6c6c6c;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input#toggle { display: none; }\n");
      out.write("            input#toggle ~ .dropdown { display: block; }\n");
      out.write("            input#toggle:checked ~ .dropdown { display: none; }\n");
      out.write("\n");
      out.write("            .dropdown { margin-top: 7px; }\n");
      out.write("\n");
      out.write("            .dropdown .arrow {\n");
      out.write("                width: 0;\n");
      out.write("                height: 0;\n");
      out.write("                border-left: 7px solid transparent;\n");
      out.write("                border-right: 7px solid transparent;\n");
      out.write("                border-bottom: 9px solid #f8f8f8;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .row {\n");
      out.write("                border-radius: 0;\n");
      out.write("                box-shadow: none;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .row:nth-child(2) { border-radius: 3px 3px 0 0; }\n");
      out.write("            .dropdown .row:last-child { border-radius: 0 0 3px 3px; }\n");
      out.write("\n");
      out.write("            .dropdown:hover > .row { color: #bebebe; }\n");
      out.write("\n");
      out.write("            .dropdown .row:hover {\n");
      out.write("                background-color: #ebebeb;\n");
      out.write("                color: #6c6c6c;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  id = \"RecogidaDatos\" method=\"get\" action=\"ListaModelo.jsp\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2>Señala la marca que quieres mostrar:</h2>\n");
      out.write("            Nombre Marca \n");
      out.write("            <div class=\"menu\">\n");
      out.write("\n");
      out.write("                <div class=\"panel\">\n");
      out.write("                    <label class=\"text\" for=\"toggle\">Marcas</label>\n");
      out.write("                    <label class=\"icon fas fa-cog\" for=\"toggle\"></label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <input type=\"checkbox\" id=\"toggle\">\n");
      out.write("\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <div class=\"arrow\"></div>\n");
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"row\">\n");
      out.write("                        <div class=\"text\">  <select name=\"CodMarca\" onchange=\"salta(this.form)\">\n");
      out.write("                        </div>\n");
      out.write("                        <i class=\"icon fas fa-user\"></i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        Class.forName("com.mysql.jdbc.Driver");

                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches1", "root", "");

                        Statement s = conexion.createStatement();

                        ResultSet listado = s.executeQuery("SELECT NombreMarca, CodigoMarca"
                                + " FROM marcas  "
                        );
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <option selected> ---\n");
      out.write("                        ");
        while (listado.next()) {

                                out.println("<option value=\"" + (listado.getString("CodigoMarca") + "\">" + listado.getString("NombreMarca")));
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
        } // while   

                            conexion.close();

                        
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"Aceptar\">  \n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
