import Libreria.*;
public class RepasoBaraja{
  public static void main (String [] args){
    
    int [] baraja = new int [10];
    int i; 
    int j;
    int k; 
    int aux;
    
    //mete en el array los valores aleatorios
    for (i = 0; i< 10; i++){
      baraja[i] = (int)(Math.random()*10);
      System.out.print(baraja[i] + "   ");
    }
   
   
    //OrdenaPar(baraja(baraja[]));
    //ordenar
    
    for ( i = 0; i < 10 ; i++){
      
      j = i;
      
      while ((baraja[j++] % 2 != 0) && (j < 10 ));
        
        if ( j < 11){
          for ( k = j - 1; k > i ; k-- ){
            aux = baraja[k];
            baraja[k] = baraja[k-1];
            baraja[k-1] = aux;
      
          }
        }
        
        
    }

    
    System.out.println(" ");
    System.out.println("Pares al principio");
    for (i = 0; i < 10 ; i++){
      System.out.print(baraja[i] + "   " );
    }
    
    
    
    
   //cierra 
  }
}
