public class S04E7 {
  public static void main (String [] args) {
    
    System.out.println("Este programa calcula la nota media de tres examenes.");
    System.out.println("Introduce el valor de la primera nota: ");
    double x = Double.parseDouble(System.console().readLine());    
    
    System.out.println("Introduce el valor de la segunda nota: ");
    double y = Double.parseDouble(System.console().readLine()); 
    
    System.out.println("Introduce el valor de la tercera nota: ");
    double z = Double.parseDouble(System.console().readLine()); 
    
    double media = (x +y +z)/3;
     
    System.out.println("La nota media es = " + media ); 
  }
}
