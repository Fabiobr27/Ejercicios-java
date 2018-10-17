public class S05E27 {
  public static void main (String [] args) {
  
  System.out.println("Introduce un número entero mayor que 1");
  int numeroIntr= Integer.parseInt(System.console().readLine());
  
  int cuenta = 0 ;
  int suma = 0;
  
  for ( int i = 1 ; i < numeroIntr; i++) {
    if ((i % 3) == 0) {
      System.out.print( i + " ");
      cuenta++;
      suma += i;
    }
  }
  
  System.out.println("Desde de 1 hasta " + numeroIntr + " hay " + cuenta + " multiplos");
   System.out.println("Multiplos de 3 y suma " + suma); 
  
  
  
  
  }
 } 
