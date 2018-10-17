import java.util.Scanner;

public class sumanumeros2{
  public static void main (String[] args ){
    int numero1;
    int numero2;
    
    
    Scanner escanerEntrada = new Scanner(System.in);
    
    System.out.println("Introduzca el primer sumando:");
    numero1 = Integer.parseInt(escanerEntrada.nextLine());
    
    //numero1 = escanerEntrada.nextInt();
   
    System.out.println("Introduzca el primer sumando :");
    numero2 = Integer.parseInt(escanerEntrada.nextLine());
    
    int resultado;
    resultado= numero1+numero2;
    System.out.printf("numero1= %d ; numero2 = %d\n ; resultado= %d +  %d\n ");
  }
}  

