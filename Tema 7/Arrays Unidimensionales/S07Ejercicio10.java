public class S07Ejercicio10{
  public static void main (String [] args){
    
    int[] numero = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
     
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 101);
      // Separa los números metiendo los pares en un array
      // y los impares en otro.
      if (numero[i] % 2 == 0) {
        par[pares++] = numero[i];
      } else {
        impar[impares++] = numero[i];
      }
    }
    
    
    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    
    // pares
    for (i = 0; i < pares; i++) {
      numero[i] = par[i];
    }
    
    // impares 
    for (i = pares; i < 20; i++) {
      numero[i] = impar[i - pares];
    }

    //resultado.
    System.out.println("Array con los pares al principio:");
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
  }
}
