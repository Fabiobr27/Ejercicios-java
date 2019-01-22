import java.util.Scanner;

public class Repaso4{
  public static void main (String [] args){

    System.out.println("Introduce el numero de palabras que vas a introducir");
   int  tamanoArray = Integer.parseInt(System.console().readLine());
    
    int auxiliar;    
    int i;
    int contador = tamanoArray;
    Scanner teclado = new Scanner (System.in);
    
     int [] orden = new int [tamanoArray];
    String [] palabra = new String [tamanoArray];
    
    for(i = 0 ; i <tamanoArray ;i++){
      System.out.println("Introduce las palabras que quieras almacenar " + "(te quedan " + contador + " palabras)");
      palabra[i]= teclado.nextLine();
     
      System.out.println("Introduce el orden de las palabras");
     orden [i] =Integer.parseInt(System.console().readLine());
      if (orden[i] > tamanoArray){
        System.out.println("Numero no válido , introduce otro numero , tiene que ser menor que " + tamanoArray);
        orden [i] =Integer.parseInt(System.console().readLine());
      }if(orden [i] == orden[i]){
      System.out.println("Numero ya introducido , introduce otro numero");
        orden [i] =Integer.parseInt(System.console().readLine());
      }
      
       contador--;
  }
    System.out.println(" ");
  
  
  
  
  }
}
