public class S06Ejercicio16 {
  public static void main (String [] args){
    
  int simbolo; 
  int simbolo1 = 0;
  int simbolo2 = 0 ;
  int simbolo3 = 0;
  
  for(int i= 0; i < 3;i++){
    simbolo =(int)(Math.random()*5);
  switch (simbolo) {
    case 0:
      System.out.print(" Corazón");
    break;
    case 1:
       System.out.print ( " Diamante");
      break;
    case 2:
       System.out.print(" Herradura");
    break;
    case 3:
       System.out.print(" Campana");
    break; 
    case 4:
     System.out.print(" Limón");
    break;
    default:
    }
    
    switch(i){
      case 0:
      simbolo1 = simbolo;
      break;
      case 1:
      simbolo2 = simbolo;
      break;
      case 2:
      simbolo3 = simbolo;
      break;
      default:
    }
  }
    // tres simbolos diferentes has perdido
    if ((simbolo1 != simbolo2) && (simbolo2 != simbolo3) && (simbolo1 != simbolo3)){
    System.out.println("\n Lo siento has perdido");
    }//tres simbolos iguales
   else if ((simbolo1 == simbolo2) && (simbolo2 == simbolo3)){
    System.out.println("\n Enhorabuena has ganado 10 monedas");
    }//dos simbolos iguales
     else {
    System.out.println("\n Has recuperado tu dinero");
    }
  }
}
