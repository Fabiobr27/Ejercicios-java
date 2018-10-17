public class S05E21 {
  public static void main (String [] args) {
    
    System.out.println("Introduce números enteros (Número negativo para finalizar)");
    
    int numerointroducido ;
    int numerodeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar= 0;
    
    do {
      numerointroducido = Integer.parseInt(System.console().readLine());
      
      if ( numerointroducido  >= 0 ) {
        numerodeElementos++;
        if ( (numerointroducido % 2) == 1)
        sumaImpares += numerointroducido;
        numeroDeElementosImpares++;
      } else 
      if ( numerointroducido > maximoPar)
      maximoPar = numerointroducido;
      
    } while (numerointroducido >= 0);
  
   System.out.println("Ha introducido " + numerodeElementos +" numeros");
   System.out.println("La media de los impares es " + sumaImpares/numerodeElementos); 
   System.out.println("El máximo de los  pares es " + maximoPar);
     
    
  }
 } 
