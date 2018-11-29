public class S7_1Ejercicio3 {
  public static void main (String [] args){
  
  int [][] numeros = new int [4][5];
      
      int filas;
      int columnas;
      
      System.out.println("Introduce números enteros");
      for(filas=0;filas<4;filas++){
        for(columnas=0;columnas<5;columnas++){
        int aleatorios = (int)(Math.random ()* 900 + 100);
        System.out.println(" Fila " + filas + " Columnas " + columnas + ":");
        numeros[filas][columnas]= aleatorios;
      }
    }
      
      int sumaFilas;
      for(filas=0;filas<4;filas++){
      sumaFilas=0;
      for(columnas=0;columnas<5;columnas++){
        System.out.printf("%7d  ",numeros[filas][columnas]);
        sumaFilas += numeros[filas][columnas];
      }
      System.out.printf("|%7d\n",sumaFilas);
    }
    //pinta las rayas
    for(columnas = 0; columnas < 5; columnas++){
      System.out.print("----------");
    }
    System.out.println("-----------");

      
      int sumaColumnas;
      int sumaTotal = 0;
      
      for(columnas=0;columnas<5;columnas++){
        sumaColumnas=0;
      for(filas=0;filas<4;filas++){
      
      sumaColumnas += numeros[filas][columnas];
      }
    sumaTotal += sumaColumnas;
    System.out.printf("%7d  ", sumaColumnas);
    }
    System.out.printf("|%7d  ", sumaTotal);
  
  //cierra public static
  }
}
