public class S04E11 {
  public static void main (String [] args ){
  
   System.out.println("Este programa calcula la hora y minutos que faltan para llegar a media noche.");
   System.out.println("Introduce la hora y los minutos");
   
   System.out.println("Hora : ");
   double Hora = Double.parseDouble(System.console().readLine());
   
   System.out.println("Minutos :");
  double Minutos = Double.parseDouble(System.console().readLine());
  
  double segundosTrascurridos = (Hora * 3600) + (Minutos * 60);
  double segundoHastaMediaNoche = (24 * 3600) - segundosTrascurridos ;
  
  System.out.println("Faltan " + segundoHastaMediaNoche + " segundos para llegar a media noche");
   
  }
}
