public class Repaso1{
  public static void main (String [] args){
    int [] numero = new int [5];
    int i ;
    
    System.out.println("Introduce 5 numeros"); 
    
    for( i =0; i<5;i++){
        numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Array dado la vuelta");
  for ( i =4; i >=0;i--){
    System.out.println(numero[i]);
  }
}
}
