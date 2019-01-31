//Hecho por Fabio Benitez
public class PiedraPapeloTijera {
public static void main (String [] args ){
  
  System.out.println("Piedra papel o tijera");
  
  String valor = " ";
  int contadorJugador = 0;
  int contadorOrdenador = 0;
  int contadorEmpate = 0;
  boolean valorValido = true;
  System.out.println("Introduce el numero de rondas que quieras jugar");
  int numeroRondas = Integer.parseInt(System.console().readLine());
  
  
  for(int i = 0; i< numeroRondas;i++){
    
    System.out.println(" ");
    System.out.println("Introduce el valor que quiera sacar( 1 tijeras , 2 papel , 3 piedra)");
    int jugador= Integer.parseInt(System.console().readLine());
    //Comprueba si el numero es valido
    do{
    if(jugador ==1){
      valor = "Tijeras";
      valorValido =true;
    }if(jugador == 2){
      valor = "Papel";
      valorValido =true;
    }if(jugador == 3){
      valor = "Piedra";
      valorValido =true;
    }if ( jugador > 3){
      System.out.println("Valor no válido");
      jugador= Integer.parseInt(System.console().readLine());
      valorValido =false;
    }if ( jugador < 1){
      System.out.println("Valor no válido");
      jugador= Integer.parseInt(System.console().readLine());
      valorValido =false;
    }
  }while(!valorValido);
  
    //Jugada Ordenador
    System.out.println(valor);
    System.out.println(" ");
    System.out.println("Jugada del ordenador");
    int ordenador = (int)(Math.random()*3+1);
     if(ordenador ==1){
      valor = "Tijeras";
    }if(ordenador == 2){
      valor = "Papel";
    }if(ordenador == 3){
      valor = "Piedra";
    }
    System.out.println(valor);
    System.out.println(" ");
    
    //Comprueba partida
    
    //Jugador gana
    if((jugador ==1) && (ordenador == 2)){
      contadorJugador++;
      System.out.println("Partida Ganada por jugador");
    }if((jugador ==2) && (ordenador == 3)){
      contadorJugador++;
      System.out.println("Partida Ganada por jugador");
      
    }if((jugador ==3) && (ordenador == 1)){
      contadorJugador++;
      System.out.println("Partida Ganada por jugador");
    }
    
    //Ordenador Gana
    if((jugador ==1) && (ordenador == 3)){
      contadorOrdenador++;
      System.out.println("Partida Ganada por ordenador");
    }if((jugador ==2) && (ordenador == 1)){
      contadorOrdenador++;
      System.out.println("Partida Ganada por ordenador");
    }if((jugador ==3) && (ordenador == 2)){
      contadorOrdenador++;
      System.out.println("Partida Ganada por ordenador");
    }
    //Empate
    if((jugador == 1) && (ordenador == 1)){
      contadorEmpate++;
      System.out.println("Partida Empatada");
    }if((jugador == 2) && (ordenador == 2)){
      contadorEmpate++;
      System.out.println("Partida Empatada");
    }if((jugador == 3) && (ordenador == 3)){
      contadorEmpate++;
      System.out.println("Partida Empatada");
    }
    
  }
  System.out.println(" ");
  //Muestra quien ha ganado
  if(contadorJugador > contadorOrdenador){
    System.out.println(" ");
    System.out.println("El jugador Gana ");
    System.out.println(" ");
  }if(contadorJugador < contadorOrdenador){
    System.out.println(" ");
    System.out.println("El ordenador Gana "); 
    System.out.println(" ");
  }if(contadorJugador == contadorOrdenador){
    System.out.println(" ");
    System.out.println("Partida Empatada "); 
    System.out.println(" ");
  }
  //Muestra todos los resultados
  System.out.println("Número total de partidas es de " + numeroRondas);
  System.out.println("El numero de partidas ganadas por el jugador es de " + contadorJugador + " partidas");
   System.out.println("El numero de partidas ganadas por el Ordenador es de " + contadorOrdenador + " partidas");
   System.out.println("El numero de partidas empatadas por el jugador es de " + contadorEmpate + " partidas");
  
  //cierra
  }
}
