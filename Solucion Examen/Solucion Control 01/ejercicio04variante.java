public class ejercicio04variante {
  public static void main (String[] args) {
    float dineroInicial;
    float rentabilidadMensual; // entendida como %
    float dineroFinal;
    
    int cantidadMinMeses = 0;
    
    System.out.print ("Introduzca la cantidad inicial de dinero: ");
    dineroInicial = Float.parseFloat(System.console().readLine());
    
    System.out.print ("Introduzca la rentabilidad mensual (entendida como %, sin símbolo %): ");
    rentabilidadMensual = Float.parseFloat(System.console().readLine());
    
    System.out.print ("Introduzca la cantidad final de dinero: ");
    dineroFinal = Float.parseFloat(System.console().readLine());
    
    
    // rentabilidad ingresada "al final del periodo"
    
    float dineroActual = dineroInicial;
  
    while (dineroActual < dineroFinal) {
      dineroActual += dineroActual*rentabilidadMensual/100;
      cantidadMinMeses++;      
    }
  
    System.out.println("Necesitará " + cantidadMinMeses + " meses para llegar al dinero final indicado");
  
  }

}
