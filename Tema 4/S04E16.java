public class S04E16 {
  public static void main (String [] args){
    
    String respuesta ;
    int puntos = 0;
    
  
  System.out.println("Este programa realiza un tes de infeidelidad:");
  System.out.println("Responda v o f");
  System.out.println("1-Tu pareja parece estar mas inquieta de lo normal sin ningun motivo:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("2-Ha aumentado los gastos de ropa:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("3-Ha perdido el interes que mostraba antes hacia a ti:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("4-Tu pareja se afeita con más frecuencia (si es hombre) o se arregla el pelo mas frecuentemente(si es mujer)");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("5-No te deja mirar su agenda del movil:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("6-A veces no quiere responder llamadas delante tuya:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("7-Últimamente se cuida mas que antes:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("8-A veces llega mucho mas tarde de trabajar porque dice que tiene mucho trabajo");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("9-Has notado que se perfuma mas que antes");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  System.out.println("10-Se confunde y te dice sitios en los que no ha estado contigo:");
  respuesta = System.console().readLine();
  if (respuesta.equals("v")) {
    puntos +=3 ;
  }
  
  if (puntos < 10) {
    System.out.println("Enhorabuena su pareja es fiel");
  }
  if ((puntos > 11) && ( puntos <= 22 )) {
    System.out.println("Existe peligro de que halla otra pareja en su vida ");
  }
   if ((puntos > 22) && ( puntos <= 30)) {
    System.out.println("Tu pareja es infiel ");
  }
  

  System.out.println("Su puntuación es " + puntos + " puntos");
  
  }
}
