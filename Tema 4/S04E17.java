public class S04E17 {
  public static void main (String [] args){
    System.out.println("Introduce un número entero");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra es : " + ( n % 10));
  
  }
}
