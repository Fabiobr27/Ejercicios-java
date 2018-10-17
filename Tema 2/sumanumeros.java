public class sumanumeros {
  public static void main (String[] args ){
    int numero1;
    int numero2;
    
    
    String lineaDeEntrada;
    
    System.out.println("Introduzca el primer sumando:");
    lineaDeEntrada = System.console().readLine();
    numero1 = Integer.parseInt(lineaDeEntrada);
   
    System.out.println("Introduzca el primer sumando :");
    lineaDeEntrada = System.console().readLine();
    numero2 = Integer.parseInt(lineaDeEntrada);
    int resultado= numero1 + numero2;
    
    System.out.printf("numero1= %d ; numero2 = %d\n ;resultado=",numero1,numero2,resultado);
  }
}  

