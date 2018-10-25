public class S6Ejercicio03{
  public static void main (String [] args ){
       String carta = "";
   String palo = "";
    
    int numeroPalo= (int)(Math.random()*4+1);
    
    switch(numeroPalo){
      case 1:
      palo = "Vasto";
      break;
      case 2:
      palo = "Copa";
      break;
      case 3:
      palo="Espada";
      break;
      case 4:
      palo="Oro";
      default:
    }
     int numeroCarta= (int)(Math.random()*13+1);
    switch(numeroCarta){
      case 1:
      carta = "As";
      break;
      case 11:
      carta = "Caballo";
      break;
      case 12:
      carta= "Sota";
      break;
      case 13:
      carta= "Rey";
      break;
      default:
      
      carta = String.valueOf(numeroCarta);
    }
    
    
    System.out.println( carta + " de " + palo);


  
  
  }
}
