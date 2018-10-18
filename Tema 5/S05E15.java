public class S05E15{
  public static void main (String [] args) {

    System.out.println("Introduce un número entero para la base");
    double base = Double.parseDouble(System.console().readLine());
    
     System.out.println("Introduce un número entero para el exponente:");
    int exponentefinal = Integer.parseInt(System.console().readLine());
    
    double potencia ;
    int exponente;
    potencia = 1;
    //exponente = i ;
   
    for ( int i = 1 ; i <= exponentefinal; i++ ) {
       potencia *= base;
       System.out.println( base + " ^ " + i + "=" + potencia);
    }
    
    
      
    
    
    
    
    
    
    
  }
}
