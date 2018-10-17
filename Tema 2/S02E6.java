public class S02E6 {
  public static void main (String [] args ){
  
  double baseImponible=234.56;
  int porcentajeIVA = 21;
  
  double incrementoIVA;
  double totalIVAincluido;
  
  incrementoIVA = baseImponible  * porcentajeIVA/100 ;
  totalIVAincluido = baseImponible + incrementoIVA ;
  
  
  //System.out.println("El precio total correspondiente a base imponible " + baseImponible+ " es " + totalIVAincluido);
  System.out.printf("El precio total correspondiente a base imponible %.2f  es %.2f\n" ,baseImponible, totalIVAincluido);
  
 
  
  
  
  }
}
