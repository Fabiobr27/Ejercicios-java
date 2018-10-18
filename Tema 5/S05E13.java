public class S05E13 {
  public static void main (String [] args) {
  
  System.out.println("Introcuzca 10 número enteros");
  
  int positivos = 0 ;
  int negativos = 0;
  
  for ( int i = 0; i < 10 ;i++) {
    if (Integer.parseInt(System.console().readLine()) > 0){
      positivos++;
    }else  {
      negativos++;
    }
    System.out.println("Ha introducido  " + positivos + " numeros positivos y  " + negativos + " números negativos");
  
    }
  }
}
