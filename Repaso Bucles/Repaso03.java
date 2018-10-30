public class Repaso03 {
  public static void main (String [] args ){  
    
  System.out.println("Introduce el primer número");
  int primernumero = Integer.parseInt(System.console().readLine());

  
  System.out.println("Introduce el número de números que quieres que muestre por pantalla");
  int numero = Integer.parseInt(System.console().readLine());
  
  System.out.println("introduce el numero de salto");
  int salto = Integer.parseInt(System.console().readLine());
  
  while(numero>0){
    System.out.println(primernumero);
    primernumero +=salto;
    numero--;
    }
  }
}
