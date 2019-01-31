public class TresenRaya{
  public static void main(String [] args){
  String jugador = "X";
  String Maquina = "O";
  String [][] tablero = new String [3][3];
  boolean GanaJugador= false;
  
  
  
  for (int i = 0;i< 3;i++ ){
     for (int j = 0;j< 3;j++ ){
      tablero [i][j] = " ";
    }
  }
  //Pinta tablero
   System.out.println();
    System.out.print(" |");
    for (int j=0; j<3; j++) {
      System.out.print((j+1)+"|");
    }
    System.out.println();
    for (int j=0; j<8; j++){
      System.out.print("—");
    }
    
    for (int i=0; i<3; i++) {
      System.out.println();
      System.out.print((i+1)+"|");
      for (int j=0; j<3; j++) {
        System.out.print(tablero[i][j]+"|");
      }
      System.out.println();
      for (int j=0; j<8; j++){
        System.out.print("—");
      }
    }
    
    GanaJugador= ((tablero[][] == Jugador ) && (tablero [][] == Jugador ) && (tablero[][]== Jugador),
    System.out.println();
    for(int i = 0; i <3; i++){
        for (int j = 0; j <3 ; j++){
          if(( 
        }
      }
  
  
  
  //cierra
  }
}
