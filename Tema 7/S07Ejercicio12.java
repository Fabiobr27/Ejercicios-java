public class S07Ejercicio12{
  public static void main (String [] args){
  
    int [] numero = new int [10];
    int [] resultado = new int [10];
    int posInicial;
    int posFinal;
    int i;
    boolean valido;
  
  System.out.println("Introduce 10 números por pantalla");
  for( i = 0 ; i <10 ; i++){
    numero [i] = Integer.parseInt(System.console().readLine());
  }
  
 
  do {
    valido = true;
    System.out.println("Introduce la posición inicial");
    posInicial=Integer.parseInt(System.console().readLine());
    if((posInicial < 0 && posInicial > 9)){
      System.out.println("Valor introducido no  válido");
      valido = false;
      }
   
    System.out.println("Introduce la posición final");
    posFinal=Integer.parseInt(System.console().readLine());
       if((posFinal< 0 && posFinal > 9)){
      System.out.println("Valor introducido no  válido");
      valido = false;
    }
    if(posInicial>=posFinal){
      System.out.println("El valor inicial debe ser menor que el final");
    }
  } while (!valido);
  
  System.out.println("Array original");
  for(i = 0 ; i <10; i++){
  System.out.println(i + " " +numero [i]);
  }
  
  for( i = 0 ; i <10; i++){
   resultado [i] = numero[i];
 }
  resultado [posFinal] = numero [posInicial];
 
  for (i = posFinal + 1; i < 10; i++){
      resultado[i] = numero[i - 1];
    }
    resultado[0] = numero[9];
    
    for (i = 0; i < posInicial; i++)
      resultado[i + 1] = numero[i];
      
   
  
  System.out.println("Array Final");
  for(i = 0 ; i <10; i++){
    System.out.println(i + " " + resultado [i]);
  }
    }
  }

