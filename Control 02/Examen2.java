public class Examen2{
  public static void main (String [] args ){
  
  System.out.println("Introduce el primer numero");
  long numero1 = Long.parseLong(System.console().readLine());
  
  System.out.println("Introduce el segundo numero");
  long numero2 = Long.parseLong(System.console().readLine());
  
 boolean encontrado = false;
  long aux1;
  long aux2;
  int contadorDigitos1 =0;
  int contadorDigitos2 =0;
  long contadorDigitosRepetidos = 0;
  int aux = 0;
  
  System.out.println("");
  
  System.out.println("Digitos numero 1:");
  for (int i = 0; i < 10; i++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux1 = numero1;
      while (aux1 > 0) {
        if (aux1 % 10 == i) {
          encontrado = true;
          contadorDigitos1++;
        }
        aux1 /= 10;
      }
      if (encontrado) {
        System.out.print(i + " ");
      }
    }
    System.out.println("");
    System.out.println("Digitos numero 2");
      for (int j = 0; j < 10; j++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux2 = numero2;
      while (aux2 > 0) {
        if (aux2 % 10 == j) {
          encontrado = true;
          contadorDigitos2++;
        }
        aux2 /= 10;
      }
      if (encontrado) {
        System.out.print(j+ " ");
      }
    }
    //Crea array
    
    int  [] digitos1 = new int [contadorDigitos1];
    int  [] digitos2 = new int [contadorDigitos2];
    

    //Mete los numero en el array
    for (int i = 0; i < 10; i++) {
      
      encontrado = false;
      aux1 = numero1;
      while (aux1 > 0) {
        if (aux1 % 10 == i) {
          encontrado = true;
          
        }
        aux1 /= 10;
      }
      if (encontrado) {
        digitos1 [aux] = i ;
        aux++;
      }
    }
    
      aux=0;
      for (int j = 0; j < 10; j++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux2 = numero2;
      while (aux2 > 0) {
        if (aux2 % 10 == j) {
          encontrado = true;
        }
        aux2 /= 10;
      }
      if (encontrado) {
        digitos2[aux] = j;
        aux++;
      }
    }
    for(int i = 0 ; i <contadorDigitos1; i++){
      
      for(int j = 0 ;j < contadorDigitos2; j++)
      
      if (digitos1[i]== digitos2[j]){
        contadorDigitosRepetidos++;
      }
    }
    
    //final
    
    System.out.println("");
    
    System.out.println("Digitos en el numero 1");
    System.out.println(contadorDigitos1);
    System.out.println("");
    
    System.out.println("digitos en el numero 2");
    System.out.println(contadorDigitos2);
    System.out.println("");
    System.out.println("La cantidad de numero repetidos en el numero1 y en el numero 2 es de " + contadorDigitosRepetidos);
    
  }
}

