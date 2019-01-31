public class Array7primeros{
  public static void main (String [] args ){
    
    int [] array = new int [5];
    int [] arrayFinal = new int [5];
    int auxiliar = 0;
    int auxiliar7= 0;
    int contadorDe7 = 0;
    boolean hay7 = false;
    for (int i = 0;i < 5; i++){
      
      System.out.println("Introduce numeros para meterlos en el array");
      array[i]=Integer.parseInt(System.console().readLine());
    }  
    
    System.out.println("Array Original");
    
    
    for (int i = 0;i < 5; i++){
      System.out.print(array[i] + "  " );
    }  
      
      //comprueba si hay numero que tengan 7 en el array
    for (int i = 0;i < 5; i++){
      int elemento = array[i];
     
      while(elemento > 0 && hay7 == false){
        if(elemento % 10 == 7){
          hay7 = true;
          contadorDe7++;
        }
          elemento/=10;
      }
      hay7 = false;
    }
    
    int [] arrayCon7 = new int [contadorDe7];
    int [] arraySin7 = new int [5-contadorDe7];
    
    for (int i = 0;i < 5; i++){
      int elemento = array[i];
     
      while(elemento > 0){
        if(elemento % 10 == 7){
          hay7 = true;
        }
          elemento/=10;
      }
      if(hay7){
        arrayCon7[auxiliar7] = array[i];
        auxiliar7++;
      }else{
        arraySin7[auxiliar]= array[i];
        auxiliar++;
      }
      hay7 = false;
    }
    
    
    System.out.println();
    
    System.out.println("Array Cambiado");
    
    arrayFinal=concatena(arrayCon7, arraySin7);
        
    for (int i = 0;i < 5; i++){
      System.out.print(arrayFinal[i] + "  " );
    }  
    
    
  
    
  
    
  
  } 
   public static int[] concatena(int[] a, int[] b) {
    int[] largoTotal = new int[a.length + b.length];
    for (int i = 0; i < largoTotal.length; i++) {
      if(i < a.length) {
        largoTotal[i] = a[i];
      } else{
        largoTotal[i] = b[i - (a.length)];
      }
    }
    return largoTotal;
  }
}
