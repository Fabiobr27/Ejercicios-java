public class S06Ejercicio15 {
  public static void main (String [] args ){
    
    int notas = 4 *(int) (Math.random() *7+1);
    String nota = "";
    String PrimeraNota = "";
    int contadorNota;
    
    for(contadorNota= 1; contadorNota <= notas; contadorNota++){
    switch ((int)(Math.random()*7) ){
      case 0:
        nota = "Do";
      break;
      case 1:
        nota ="Re";
      break;
      
      case 2:
        nota ="Mi";
      break;
      case 3:
        nota = "Fa";
      break;
      case 4:
        nota ="Sol";
      break;
      case 5:
        nota = "La";
      break;
      case 6:
        nota ="Si";
      break;
      default:
      }
    
    if(contadorNota == 1){
      PrimeraNota = nota;
    }if(contadorNota == notas){
      nota = PrimeraNota;
    }
    System.out.print( nota + " ");
      
    if(contadorNota == notas){
    System.out.print("| |");
    } else if(contadorNota % 4 == 0){
    System.out.print("|");
    }
   }  
  }
}
