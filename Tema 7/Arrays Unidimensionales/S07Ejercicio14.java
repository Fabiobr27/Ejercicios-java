public class S07Ejercicio14 {
  public static void main (String [] args ){
    
    String [] color = {
      "verde" , "rojo" , "azul", "amarillo" , "negro" , "morado" , "naranja" , "rosa" , "blanco"
    };
    int i;
    int j = 0;
  
    String [] palabra = new String  [8]; 
    String [] resultado =new String  [8]; 
    
    System.out.println("Introduzca 8 palabras (incluidas entre ellas algunos colores): ");
    //recoge los datos
    for(i= 0 ; i< 8 ; i++){
      palabra [i] = System.console().readLine() ;
      //inserta los datos en el array 'color'
      for (String c : color){
        if(palabra[i].equals(c)){
          resultado[j++] = c;
        }
    }
  }
  
  //Comprueba si el dato introducido es correcto
   for ( i = 0; i < 8; i++) {
      boolean esColor = false;
    
      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }
      
    
      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }
  
  //Muestra el Array original
   System.out.println("\n\nArray original:");
   for (i = 0; i < 8; i++) {
      System.out.println(i + "-> " + palabra[i]);
    }
    
    System.out.println();
    //Muestra el Array Final
    System.out.println("Array Cambiado");
    for ( i = 0; i < 8; i++) {
      System.out.println( i + "-> " + resultado[i]);
    }
  }
}
