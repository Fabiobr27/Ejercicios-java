public class ejercicio02b {
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
      for (int j=1; j<=altura; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    
    
  }
}
