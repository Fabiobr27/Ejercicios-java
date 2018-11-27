public class S7_1Ejercicio1 {
  public static void main (String [] args){
    
   
    int [][] numero = new int [3][6];
    
    numero[0][0] = 1;
    numero[0][1]= 30;
    numero[0][2]= 2;
    numero[0][5]=5 ;
    numero[1][0]=75 ;
    numero[1][4]=  0;
    numero[2][2]= -2;
    numero[2][3]= 9;
    numero[2][5]= 11;
    
    int filas;
    int columnas;
    
    for(columnas=0;columnas<6;columnas++){
  
    System.out.print("   Columna " + columnas );
    
  }
  for(filas=0;filas<3;filas++){
    System.out.print("\nFilas" + filas);
  
    for(columnas=0;columnas<6;columnas++){
    System.out.printf("%9d ", numero[filas][columnas]);
      
      }
    }
  }

}

