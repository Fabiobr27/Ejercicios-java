public class ejercicio03b {
  public static void main (String[] args) {
    int altura;
    
    do {
      System.out.print("Introduzca la altura del romboide (entre 4 y 20): ");  
      altura = Integer.parseInt (System.console().readLine());
    } while ((altura < 4) || (altura > 20));
    

    for (int i=1; i<=altura; i++) {
      // pintar espacios en blanco
      for (int j=1; j<=(altura-i); j++) {
        System.out.print(" ");
      }
      
      // pintar asteriscos
      if ((i ==1) || (i == altura)) {
        for (int j=1; j<=altura; j++) {
          System.out.print("*");
        } 
      }
      else {
        // pintar primer asterisco
        System.out.print("*"); 
        
        // pintar espacios en blanco internos
        for (int j=1; j<=(altura-2); j++) {
          System.out.print(" ");
        }
        
        // pintar último asterisco
        System.out.print("*"); 
        
      }
      System.out.println("");
    }
    
    
    
    
  }
}
