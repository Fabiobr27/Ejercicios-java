public class S07Ejercicio04{
  public static void main (String [] args) {
    
    int [] numero = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    
    int i ;
    
    for (i = 0; i <20;i++){
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] =numero [i]  * numero [i];
      cuadrado[i] =numero [i]  * numero [i] * numero [i];
    }
    System.out.println("Tabla de los numero con sus cuadrados y sus cubos");
    for (i = 0; i< 20;i++){
      System.out.println("  n | n^2 |n^3\n---|----|------");
      System.out.printf("4%d  | 5%d |8%d\n", numero [i],cuadrado [i], cubo [i]);
    }
    
  
  }
}
