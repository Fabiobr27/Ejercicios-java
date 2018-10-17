public class S04E8 {
  public static void main (String [] args){
    
    System.out.println("Este programa calcula la nota media de tres examenes.");
    System.out.println("Introduce el valor de la primera nota: ");
    double x = Double.parseDouble(System.console().readLine());    
    
    System.out.println("Introduce el valor de la segunda nota: ");
    double y = Double.parseDouble(System.console().readLine()); 
    
    System.out.println("Introduce el valor de la tercera nota: ");
    double z = Double.parseDouble(System.console().readLine()); 
    
    double media = (x +y +z)/3;
    System.out.println("La nota media es = " + media ); 
     
    if (media < 5) {
        System.out.print(" Insuficiente ");
    }
    if (( media >= 5) && ( media <6)) {
      System.out.print("Suficiente "); 
    }  
    
    if ((media >= 6) && ( media <7 )) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && ( media < 9 )) {
      System.out.print("Notable");
    }
    
    if ((media >= 9) && ( media <10 )) {
      System.out.print("Sobresaliente");
    }
  }
}
    
   
 


  
  
