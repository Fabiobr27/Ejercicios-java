public class ParesoNones{
  public static void main (String [] args){
    System.out.println("Pares o nones");
    int jugador = 0;
    int ordenador = 0;
    int dedospc ;
   
    
    
      System.out.println("Intoduce 1-pares 2-nones");
      jugador =Integer.parseInt(System.console().readLine());
     
     if(jugador ==1){
       ordenador =2;
     }if(jugador == 2 ){
       ordenador =1;
     }
     
     System.out.println(jugador);
     System.out.println(ordenador);
     
     System.out.println("Introduce los dedos que quieras sacar");
     int dedos = Integer.parseInt(System.console().readLine());
     
     
     System.out.println("Dedos ordenador");
     dedospc = (int)(Math.random()*10);
     System.out.println(dedospc);
     
     
     if((dedospc + dedos) % 2 == 0){
       System.out.println("Gana Pares");
     }else{
       System.out.println("Gana Jugador");
     }
     
     
 
  
  
  
  
  
  
  
  //cierra
  }
  public static int dedosOrdenador(int x){
    
    
    x = (int)(Math.random()*10);
    return x;
  }
  
}
