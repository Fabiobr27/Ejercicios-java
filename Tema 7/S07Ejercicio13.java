public class S07Ejercicio13{
  public static void main (String [] args){
    
    int [] numero = new int [100];
    int maximo = 100;
    int minimo = 0;
    int i ;
    for(i = 0 ; i <100 ; i ++){
    numero [i] = (int)(Math.random()*501);
  
  if(numero[i] < minimo){
      minimo = numero[i];
  }
  if (numero[i] > maximo){
    maximo = numero[i];
  }
}
  System.out.println("Array Original");
  for(i= 0 ; i < 100; i++){
    System.out.print( numero [i] + " " );
  }
  
  System.out.println("¿Que quieres resaltar? 1 = minimo ; 2= maximo");
  int opcion = Integer.parseInt(System.console().readLine());
  int destacado;
  if (opcion == 1){
    destacado= minimo;
  }else{
    destacado= maximo;
  }
  
  for(i = 0 ; i < 100;i++){
    if ( numero[i] == destacado){
      System.out.print("**" + numero[i] + "**");
    }else {
      System.out.print( numero[i] + " ");
    }
  }
  
  }
}
