public class S04E3 {
  public static void main (String [] args ){
  
      String dia;
    
    System.out.println(" Introduzca un número del 1 al 7");
    int n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      case 1 : 
      System.out.println("Lunes");
      break;
    
      case 2:
      System.out.println("Martes");
      break;
      
      case 3:
      System.out.println("Miertcoles");
      break;
      
      case 4:
      System.out.println("Jueves");
      break;
      
      case 5:
      System.out.println("Viernes");
      break;
      
      case 6:
      System.out.println("Sabado");
      break;
      
      case 7:
      System.out.println("Domingo");
      break;
      
      default:
      System.out.println("Debe introducir un número del 1 al 7");
    }
  }
}
