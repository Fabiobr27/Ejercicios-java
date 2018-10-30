public class Repaso01 {
  public static void main (String [] args ){
  
  System.out.println("Introduce un número inicial");
  int numeroinicial = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el número de números que quieres que muestre por pantalla");
  int contador = Integer.parseInt(System.console().readLine());
  while(contador!=0){
    System.out.println(numeroinicial);
    numeroinicial++;
    contador--;
    }
  }
}
