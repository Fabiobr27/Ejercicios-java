public class Adivinanumeros2 {
  public static void main (String [] args) {
    int numerointroducido ;
    boolean acertado = false;
    int numeroentero = 27;
    int numerointentos = 0;
    System.out.println("Intente adivinar el numero secreto");
    
    
      do{
      System.out.println("Introduzca números enteros hasta poder acertarlo");
      numerointroducido =Integer.parseInt(System.console().readLine());
      numerointentos++;
    
      if (numerointroducido < numeroentero) {
      System.out.println("El numero introducido es menor que el número secreto");
      }
      if  (numerointroducido > numeroentero) {
      System.out.println("El número introducido es mayor que el número secreto");
      }
      if ( numerointroducido == numeroentero) {
      acertado = true;
      System.out.println("!!!EnhorabuenaHas acertado!!");
      System.out.println("El numero de intentos ha sido de " + numerointentos +" intentos ");
      }
    }while (!acertado);
    if (!acertado){
      System.out.println("");
    }
  }
 } 
