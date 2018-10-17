public class S04E14 {
  public static void main (String [] args) {
  
    System.out.println("Por favor introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0){
      System.out.print("El número es par ");
    } else {
      System.out.print("El número es impar ");
    }
    
    if ((numero % 5) == 0){
      System.out.print(" y  es divisible entre cinco ");
    } else {
      System.out.print(" y  no es dividible entre cinco");
    }
  }
}
