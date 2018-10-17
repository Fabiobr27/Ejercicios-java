 public class S03E9{
    public static void main (String [] args) {
      
      double PI = 3.14916;
      System.out.println("Volumen de un cono");
      System.out.print("Introduce la altura del cono ");
     
      double h = Double.parseDouble (System.console().readLine() );
     
      System.out.print("Introduce el radio ");
      double r = Double.parseDouble (System.console().readLine() );
     
      double v = (1.0/3.0) * PI * r * r * h;
    
      System.out.print( "El volumen " + v + " centimetros ");
    }  
  }
  
