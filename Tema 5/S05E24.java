public class S05E24 {
  public static void main (String [] args) {
    
    System.out.println("Introduzca la base de la piramide");
    int alturaIntr = Integer.parseInt(System.console().readLine());
    
    int altura = 1 ;
    int i = 0;
    int espacios = alturaIntr - 1;
    
    while ( altura <= alturaIntr) {
      
    for ( i = 1; i <= espacios ;i++) {
      System.out.print(" ");
    }
    for ( i = 1 ; i< altura; i++) {
      System.out.print(i);
    }
    for (i = altura; i > 0; i--) {
      System.out.print(i);
    }
    System.out.println();
    altura++;
    espacios--;
  }
  }
 } 
