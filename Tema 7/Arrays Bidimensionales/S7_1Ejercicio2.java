public class S7_1Ejercicio2 {
  public static void main (String [] args){
      
      int [][] numeros = new int [4][5];
      
      int filas;
      int columnas;
      
      System.out.println("Introduce números enteros");
      for(filas=0;filas<4;filas++){
        for(columnas=0;columnas<5;columnas++){
        System.out.println(" Fila " + filas + " Columnas " + columnas + ":");
        numeros[filas][columnas]=Integer.parseInt(System.console().readLine());
      }
    }
      
      int sumaFilas;
      for(filas=0;filas<4;filas++){
      sumaFilas=0;
      for(columnas=0;columnas<5;columnas++){
        System.out.printf("%7d  ",numeros[filas][columnas]);
        sumaFilas += numeros[filas][columnas];
      }
      System.out.println(sumaFilas);
    }
      
      
      int sumaColumnas;
      int sumaTotal = 0;
      
      for(columnas=0;columnas<5;columnas++){
        sumaColumnas=0;
      for(filas=0;filas<4;filas++){
      
      sumaColumnas += numeros[filas][columnas];
      }
    sumaTotal += sumaColumnas;
    System.out.printf("%7d", sumaColumnas);
    }
    System.out.printf("%7d", sumaTotal);
  }
}
