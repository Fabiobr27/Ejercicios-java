public class TorresdeHanoi{
  public static void main (String [] args){
    
    System.out.println("Introduce el numero de discos con los que quieres jugar: ");
    int numeroDiscos = Integer.parseInt(System.console().readLine());
    
    int [][] estadoPoste = new int [3][numeroDiscos+1];
    int contadorPoste0 = numeroDiscos;
    int contadorPoste1 = 0;
    int contadorPoste2 = 0;
    int aux = 0;
    int aux1 = 1;
    for(int i = 0; i <numeroDiscos;i++){
      estadoPoste[0][0] = contadorPoste0;
      estadoPoste[0][aux1] = numeroDiscos - aux;
      aux++;
      aux1++;
    }
    
    int columna;
    int poste;
    int fila;
    int columnaMovida;
    int filaMovida;
    boolean finalizado = false;
    boolean retirada = false;
    System.out.print("       ");
    //pinta tablero
    for(columna = 0; columna < numeroDiscos+1; columna++) {
      System.out.print("   Columna " + columna);
    }
    for(poste = 0; poste < 3; poste++) {

      System.out.print("\nposte " + poste);
  
      for(columna = 0; columna < numeroDiscos+1; columna++) {
        System.out.printf("%9d   ", estadoPoste[poste][columna]);
      }
    }
    System.out.println(" ");
    
    do{
    System.out.println("Indique el poste del disco que quieras mover (Para acabar pon -1): ");
    fila = Integer.parseInt(System.console().readLine());
    
    if(fila == -1) {
        retirada = true;
      }else {
    
    System.out.println("Indique la columna del disco que quieras mover");
    columna = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el poste del disco donde lo quieras mover");
    filaMovida = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique la columna del disco donde lo quieras mover");
    columnaMovida = Integer.parseInt(System.console().readLine());
    
    
    
    if(((estadoPoste[fila][columna] < estadoPoste[filaMovida][columnaMovida - 1]) || (estadoPoste[filaMovida][columnaMovida - 1] == 0)) && (estadoPoste[filaMovida][columnaMovida] == 0) && ((columna != numeroDiscos + 1) || (estadoPoste[fila][columna + 1] == 0))){
      //if(estadoPoste[fila][columna] != 0){
      estadoPoste [filaMovida][columnaMovida] = estadoPoste[fila][columna];
      estadoPoste[fila][columna] = 0;
      
      if ((filaMovida == 1) && (fila==0)){
        contadorPoste0--;
        contadorPoste1++;
        
      }
      if ((filaMovida == 1) && (fila==2)){
        contadorPoste2--;
        contadorPoste1++;
        
      }if ((filaMovida == 0) && (fila==1)){
        contadorPoste1--;
        contadorPoste0++;
        
      }if ((filaMovida == 0) && (fila==2)){
        contadorPoste2--;
        contadorPoste0++;
        
      }if ((filaMovida == 2) && (fila==0)){
        contadorPoste0--;
        contadorPoste2++;
        
      }if ((filaMovida == 2) && (fila==1)){
        contadorPoste1--;
        contadorPoste2++;
        
      }
      
    //pinta tablero
    
      for(columna = 0; columna < numeroDiscos+1; columna++) {
        System.out.printf("%11s %2d   ", "  columna" ,columna);
      }
      for(poste = 0; poste < 3; poste++) {


        System.out.print("\nposte " + poste);
    
        for(columna = 0; columna < numeroDiscos+1; columna++) {
          if ((columna == 0) && (poste==0)){
          System.out.printf("%9d   ", contadorPoste0);
        }
        else if ((columna == 0) && (poste==1)){
          System.out.printf("%9d   ", contadorPoste1);
        }
        else if ((columna == 0) && (poste==2)){
          System.out.printf("%9d   ", contadorPoste2);
        }else {
          System.out.printf("%9d   ", estadoPoste[poste][columna]);
        }
        }
      }
      System.out.println(" ");
    }
    
    
    if(estadoPoste[2][numeroDiscos] != 0){
      finalizado = true;
      
    }
    //}
    }
    }while((finalizado == false) && (retirada == false));
    
    if(retirada){
      System.out.println("Una retirada a tiempo es una victoria :)");
    }else {
       System.out.println("Enhorabuena, has ganado"); 
    }
      
  //cierra
  }
}
