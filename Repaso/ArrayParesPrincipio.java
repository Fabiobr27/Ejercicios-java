public class ArrayParesPrincipio{
  public static void main (String [] args){
    
    System.out.println("Introduce el numero de digitos con los que vas a jugar");
    int numeroDigitos = Integer.parseInt(System.console().readLine());
    int contadorPares = 0;
    int contadorImpares = 0;
    
    int [] digitos= new int [numeroDigitos];
    System.out.println("Introduce los Digitos");
    for(int i = 0; i < numeroDigitos; i++){
      digitos[i] = Integer.parseInt(System.console().readLine());
      
     
    }
    
    for(int i = 0; i < numeroDigitos; i++){
     System.out.print(digitos[i]  + " " );
     
      if(esPar(digitos[i])){
        contadorPares++;
      }else{
        contadorImpares++;
      }
    }
    
    int [] arrayPar = new int [contadorPares];
    int [] arrayImpar = new int [numeroDigitos - contadorPares];
    
    int auxpar= 0;
    int aux = 0;
    
    for(int i = 0; i < numeroDigitos ; i++){
     
      if(esPar(digitos[i])){
        arrayPar[auxpar] = digitos[i];
        auxpar++;
      }else{
        arrayImpar[aux] = digitos[i];
        aux++;
      }
    }
     System.out.println(  );
    System.out.println("Par ");
      for(int i = 0; i < contadorPares;i++){
         
          System.out.println(arrayPar[i] + "  ");
         
      }  
      System.out.println(  );
      System.out.println("Impar" );
        for(int j = 0; j <numeroDigitos-contadorPares;j++){
        
          System.out.println(arrayImpar[j] + "  ");
        }
      
      int [] arrayFinal = new int [numeroDigitos];
      arrayFinal = concatena(arrayPar , arrayImpar);
      
      System.out.println("Array final");
      for(int i = 0; i < numeroDigitos; i++){
        System.out.println(arrayFinal[i]);
      }
      
    
    
    
    
    
    
  
  
  }

  public static boolean esPar(int x){
    if((x % 2 )== 0){
      return true;
    }else{
      return false;
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

