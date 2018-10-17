public class S03E10 {
  public static void main (String [] args) {
  
    System.out.println(" Conversor de Mb a Kb");
    System.out.print(" Introduce la cantidad que quieras convertir :");
    double mb = Double.parseDouble(System.console().readLine());
  
    System.out.println( mb + " Mb son " + ( mb * 1024 ) + " Kb ");
  }
}
