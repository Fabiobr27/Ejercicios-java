public class OrdenaPar {   
  public static int[] OrdenaPar (int [] baraja){
    int i ; 
    int j; 
    int k ; 
    int aux;
    for ( i = 0; i < 10 ; i++){
      
      j = i;
      
      while ((baraja[j++] % 2 != 0) && (j < 10 ));
        
        if ( j < 10){
          for ( k = j - 1; k > i ; k-- ){
            aux = baraja[k];
            baraja[k] = baraja[k-1];
            baraja[k-1] = aux;
      
          }
        }
    }
    return  baraja;
  }
}
