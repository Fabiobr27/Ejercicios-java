public class Repaso03 {
  public static void main (String [] args ){  
    int i = 1;
  System.out.println("Introduce el número de números que quieres que muestre por pantalla");
  int numero = Integer.parseInt(System.console().readLine());
  while(i <= numero){
    System.out.println(i);
    i++;
    }
  }
}
