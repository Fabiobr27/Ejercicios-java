public class S05E7{
  public static void main (String [] args) {
    int numerointroducido ;
    boolean acertado = false;
    int numeroentero = 2700;
    int numerointentos = 4;
    System.out.println("Intente adivinar el numero secreto");
    
    
      do{
      System.out.println("Introduzca números enteros hasta poder acertarlo");
      numerointroducido =Integer.parseInt(System.console().readLine());
      numerointentos--;
    
      if (numerointroducido < numeroentero) {
      System.out.println("El numero introducido es menor que el número secreto");
      }
      if  (numerointroducido > numeroentero) {
      System.out.println("El número introducido es mayor que el número secreto");
      }
      if ( numerointroducido == numeroentero) {
      acertado = true;
      System.out.println("!!!Enhorabuena Has acertado!!");
      System.out.println("El numero de intentos ha sido de " + numerointentos +" intentos ");
      }
    }while (numerointentos > 0);
    if (!acertado){
      System.out.println("Lo siento, no has acertado el número secreto");
    }
  }
 } 

    
