public class S05E14 {
  public static void main (String [] args) {
  
  System.out.println("Calculo de una potencia");
  System.out.println("Introduce la base");
  int base = Integer.parseInt(System.console().readLine());
  
  System.out.println("Introduce el exponente");
  int exponente = Integer.parseInt(System.console().readLine());
  double potencia;
  
  if ( exponente == 1) {
    System.out.println(base);
  }if (exponente > 1) {
    for ( int i = 0 ; i < exponente ; i++){
      potencia *= base;
    }
    potencia= 1/potencia;
  }
  System.out.println("Base" + base + "^" + exponente + "exponente");
  
  }
}
