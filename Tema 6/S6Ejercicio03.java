public class S6Ejercicio03{
  public static void main (String [] args ){
       String carta = "";
   String palo = "";
    
    int numeroPalo= (int)(Math.random()*4+1);
    
    switch(numeroPalo){
      case 1:
      palo = "vasto";
      break;
      case 2:
      palo = "copa";
      break;
      case 3:
      palo="espada";
      break;
      case 4:
      palo="oro";
      default:
    }
    
    int numeroCarta= (int)(Math.random()*12+1);
    
    carta = String.valueOf(numeroCarta);
   
    System.out.println( carta + " de " + palo);


  
  
  }
}
