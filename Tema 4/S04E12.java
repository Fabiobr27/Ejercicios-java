public class S04E12 {
  public static void main (String [] args){
    int puntos = 0;
    String respuesta;
    
    System.out.println("Cuestionario sobre las asignaturas");
    System.out.println("1-¿Que es java?");
    
    System.out.println("a) Un ordenador\nb) Un lenguaje de programación\nc) Una  memoria ram ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("2-¿Que es un bucle?");
    
    System.out.println("a)Una sentencia de programación\nb)Un lenguaje de programación\nc)Un repetidor ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    
    System.out.println("3- ¿Para que sirve Html?");
    
    System.out.println("a)Para nada \nb)Para ver series\nc)Para desarrollar paginas web");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("4- ¿Cual es la funcion del if?");
    
    System.out.println("a)ejecuta una sentecia si es verdadero u otra si es falsa \nb)calcular una operación s\nc)Visualizar paginas web");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5- ¿Que es una entidad?");
    
    System.out.println("a)un concepto abstracto que tiene existencia por si mismo\nb)Un programa \nc)Una sentecia del Geany");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6- ¿Caul de estas No es una sentencia de programación?");
    
    System.out.println("a)If \nb)While\nc)Por");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("7- ¿Que son : int , char, varchar..?");
    
    System.out.println("a)Lenguajes de programación\nb)Tipos de datos\nc)Paginas web");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("8- ¿Cual es el correpondiente del número 1010 en decimal?");
    
    System.out.println("a)12 \nb)11\nc)10");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("9- ¿Que es un booleano?");
    
    System.out.println("a)Un tipo de datos que solo admiten dos opciones \nb)Un tipo de datos que admite infinitos valores\nc)Una base de datos");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("10- ¿Que es una base de datos?");
    
    System.out.println("a)Un lugar donde se almacenan los datos que van a ser borrados \nb)Un conjuntos de datos almacenados istematicamete para su posterior uso\nc)Una aplicación de smartphone que alamcena datos en un pendrive");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    
    
    
    
    System.out.println("Has obtenido " + puntos + " puntos");
    
    
  
  }
}
