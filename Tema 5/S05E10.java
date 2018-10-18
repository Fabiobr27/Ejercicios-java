public class S05E10 {
  public static void main (String [] args) {
   
   double numerointroducido = 0;
   double numero = 0;
   double suma = 0;
    System.out.println("Este programa hace la media de los número introducidos,se para introduciendo un numero negativo.");
    System.out.println("Introduce los números que quieras");
    
    
    while (numerointroducido >= 0) {
      numerointroducido= Double.parseDouble(System.console().readLine());
      numero++;
      suma += numerointroducido;
      }
      System.out.println("La media de los números introducidos es " + (suma - numerointroducido)/(numero-1));
      
  }
}  

