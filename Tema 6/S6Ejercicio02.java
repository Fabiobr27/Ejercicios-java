public class S6Ejercicio02{
  public static void main (String [] args) {
    
   String carta = "";
   String palo = "";
    
    int numeroPalo= (int)(Math.random()*4+1);
    
    switch(numeroPalo){
      case 1:
      palo = "picas";
      break;
      case 2:
      palo = "trebol";
      break;
      case 3:
      palo="corazones";
      break;
      case 4:
      palo="diamantes";
      default:
    }
    
    int numeroCarta= (int)(Math.random()*13+1);
    switch(numeroCarta){
      case 1:
      carta = "As";
      break;
      case 11:
      carta = "J";
      break;
      case 12:
      carta= "Q";
      break;
      case 13:
      carta= "K";
      break;
      default:
      
      carta = String.valueOf(numeroCarta);
    }
    
    System.out.println( carta + " de " + palo);



  }
}
    