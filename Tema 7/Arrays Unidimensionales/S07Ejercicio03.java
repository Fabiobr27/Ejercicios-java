public class S07Ejercicio03 {
  public static void main (String [] args) {
    
    int [] num = new int [10];
    int i;
    
    System.out.println("Introduce 10 números enteros");
    
    
    for (i = 0; i <10;i++){
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Los números introducidos al reves son :");
    for (i = 9; i >=0;i--){
      System.out.println(num[i]);
    }
    
  
  }
}
