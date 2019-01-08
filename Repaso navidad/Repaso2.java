public class Repaso2{
  public static void main (String [] args){
    int [] numero = new int [5];
    int i;
    System.out.println("Introduce números en el array");
      
    for (i = 0 ;i < 5; i++){
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    //rota posicion
    System.out.println();
    int  aux = numero [4];
    
    for(i = 4; i > 0 ;i--){
      numero[i] = numero[i-1];
    }
    numero[0] = aux;
    
    System.out.println("Array Invertido");
    for(i=0;i<5;i++){
      System.out.println(numero[i]);
      
    
      
    }
  
  
  
  
  }
}
