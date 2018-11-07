public class S07Ejercicio06 {
  public static void main (String [] args){ 
  
    int [] numero = new int [15];
    int i;
    
    System.out.println("Introduce 15 números por teclado");
    System.out.println("Orden inicial"); 
    for(i = 0 ; i < 15;i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    
    int aux = numero [14];
    for (i = 14; i > 0 ; i--){
      numero [i] = numero [i-1];
    }
    numero[0] = aux;
    
    System.out.println("Array rotado");
    for ( i =0; i <15;i++){
      System.out.println(numero[i]);
    }
    
    
    
  
  }
}
