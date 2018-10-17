public class S05E17 {
  public static void main (String [] args) {
    
    int numerointroducido = 0;
    
    do {
      System.out.println("Introduce un número positivo");
     numerointroducido = Integer.parseInt(System.console().readLine());
    
      if (numerointroducido < 0) {
      System.out.println("El numero introducido no es válido");
      }
    } while( numerointroducido < 0);
      int suma = 0;
    
    for ( int i = numerointroducido; i < numerointroducido + 100; i++ ){
    suma += i;
    }
    
    System.out.println("La suma de los 100 siguentes números es " + suma);
  
  }
}
