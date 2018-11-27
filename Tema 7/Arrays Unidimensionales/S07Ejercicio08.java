public class S07Ejercicio08 {
  public static void main (String [] args) {
    
    String [] mes = {
    "Enero","Febrero","Marzo","Abril","Mayo","Junio",
    "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    int [] temperatura = new int [12];
    int i;
    int j;
    
    for(i=0 ; i<12;i++){
      System.out.println("Introduzca la temperatura de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (i = 0; i < 12; i++) {
      System.out.printf("│", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
      }
      System.out.println( " " + temperatura[i] + "ºC");
    }
    
  }
}
