public class Adivinanumero{
  public static void main (String [] args) {
    int numerointroducido ;
    boolean acertado = false;
    int numeroentero = 27;
    System.out.println("Intente adivinar el numero secreto");
    
    
      do{
      System.out.println("Introduzca números enteros hasta poder acertarlo");
      numerointroducido =Integer.parseInt(System.console().readLine());
    
      if (numerointroducido < numeroentero) {
      System.out.println("El numero introducido es menor que el número secreto");
      }
      if  (numerointroducido > numeroentero) {
      System.out.println("El número introducido es mayor que el número secreto");
      }
      if ( numerointroducido == numeroentero) {
      acertado = true;
      System.out.println("!!!EnhorabuenaHas acertado!!");
      }
    }while (!acertado);
    if (!acertado){
      System.out.println("");
    }
      
  }
}
     
  

