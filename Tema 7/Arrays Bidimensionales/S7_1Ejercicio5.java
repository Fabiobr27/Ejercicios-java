public class S7_1Ejercicio5{
  public static void main (String [] args){
  
  int [][] numero = new int [6][10] ; 
  
  int fila;
  int columna;
 
  int minimo = Integer.MAX_VALUE;
  int filaminimo = 0 ;
  int columnaminimo = 0;
    
  int maximo = Integer.MIN_VALUE;
  
  int filamaximo = 0;
  int columnamaximo = 0 ;
  
   System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        numero[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", numero[fila][columna]);
        
        
        // Calcula el mínimo y guarda sus coordenadas
        if (numero[fila][columna] < minimo) {
          minimo = numero[fila][columna];
          filaminimo = fila;
          columnaminimo = columna;
        }
        
        // Calcula el máximo y guarda sus coordenadas
        if (numero[fila][columna] > maximo) {
          maximo = numero[fila][columna];
          filamaximo = fila;
          columnamaximo = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filamaximo + ", columna " + columnamaximo);
   
      System.out.println("El mínimo es " + minimo + " y está en la fila " + filaminimo + ", columna " + columnaminimo);
  }
}
