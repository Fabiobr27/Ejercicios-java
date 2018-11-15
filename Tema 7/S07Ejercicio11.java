public class S07Ejercicio11 {
  public static void main (String [] args ){
    
    int [] numero = new int [10];
    int [] primo =  new int [10];
    int [] Noprimo = new int [10];
    int i;
    int j;
    int primos = 0;
    int Noprimos= 0;
    boolean esPrimo = false;
    
    
    System.out.println("Introduce 10 números por teclado");
    for(i = 0 ; i<10; i++){
     numero[i] =Integer.parseInt(System.console().readLine());
     esPrimo= true;
     for( j = 2 ; j < numero[i];j++){
       if(numero[i] % 2 == 0){
         esPrimo = false;
       }
     }
       if(esPrimo){
      primo[primos++]=numero[i];
    }else{
      Noprimo[Noprimos++]=numero[i];
     }
     }
     
     System.out.println("Array Original");
     
     for(i= 0 ; i <10; i++){
       System.out.println(numero[i]);
     }
     for (i = 0 ; i < primos+ Noprimos; i++){
       numero[i] = primo[i];
     }
     for (i = primos ; i < primos + Noprimos; i++){
      numero[i] = Noprimo[i - primos];
     }
            
     System.out.println("Array Cambiado");
     for(i = 0 ; i <10;i ++){
       System.out.println(numero[i]);
       }
    
  
  }
  }
