public class S05E12 {
  public static void main (String [] args) {
    
  System.out.println("Este progrma muestra los primeros n números de la serie de Fibonacci");
  System.out.println("Introduce el número que quieres que muestre por pantalla");
  int n = Integer.parseInt(System.console().readLine());
  
  switch (n){
    case 1:
    System.out.println("0");
    break;
    case 2:
    System.out.println("0 1");
    break;
    default:
    System.out.println("0 1");
    int f1 = 0 ;
    int f2 = 1 ;
    int aux ;
    
    while ( n > 2) {
      aux = f1;
      f1 = f2 ;
      f2 = aux + f2;
      System.out.println(" " + f2 );
      n--;
    }
  System.out.printf("");
  }
  
  }
}
