public class Repaso5{
  public static void main (String [] args){
    System.out.println("Introduce el tamaño del array ");
    int numerointroducido=Integer.parseInt(System.console().readLine());
    
    int [] numero = new int [numerointroducido];
    int [][] arrayBi = new int [3][3];
    
    System.out.println("Introduce valores");
    for (int i = 0; i < numerointroducido; i++){
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    //Intrucuce los valores en el array Bidimensional
    /*
    arrayBi[0][0] = numero[0];
    arrayBi[0][1] = numero[1];
    arrayBi[0][2] = numero[2];
    arrayBi[1][0] = numero[3];
    arrayBi[1][1] = numero[4];
    arrayBi[1][2] = numero[5];
    arrayBi[2][0] = numero[6];
    arrayBi[2][1] = numero[7];
    arrayBi[2][2] = numero[8];
    */
    
    /*
    int k = 0;
    for (int i=0; i<3; i++) {
      for (int j=0; j<3; j++) {
        //arrayBi[i][j] = numero[i*3+j];
        arrayBi[i][j] = numero[k];
        k++;
      }
    }
    */
    
    int fil=0;
    int col=0;
    for (int i=0; i< 9; i++) {
      arrayBi[fil][col] = numero [i];
      col++;
      if (col >=3) {
        fil++;
        col = 0;
      }
      
    }
    
    
    
    //Muestra los valores
    System.out.println("Array 3X3");
    System.out.println("----------------");
    System.out.printf("%4d %4d %4d", arrayBi[0][0], arrayBi[0][1] , arrayBi[0][2]);
    System.out.println();
    System.out.printf("%4d %4d %4d", arrayBi[1][0], arrayBi[1][1], arrayBi[1][2]);
    System.out.println();
    System.out.printf("%4d %4d %4d", arrayBi[2][0], arrayBi[2][1], arrayBi[2][2]);
    System.out.println("----------------");
  
  
  
  }
}
