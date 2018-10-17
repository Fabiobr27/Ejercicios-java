public class S04E9{ 
  public static void main (String [] args) {
    System.out.println("Este programa realiza ecuaciones de 2º grado");
    
    System.out.println("Introduce el valor de x :");
    double x =Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de a :");
    double a =Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b :");
    double b =Double.parseDouble(System.console().readLine());
    
    double resultado = (x*x + x*a + b);
 
    System.out.println("El resultado de la ecuación es " + resultado );
  
  }
}
