public class IntercalarNumero{
  public static void main (String [] args ){
    
    int [] arrayInicial = new int [10];
    int [] arrayFinal = new int [10] ;
    int i ;
    int j = 0;
    int par = 0;
    int impar = 0;
    int aux;
    
    for ( i =0 ; i < 10 ; i++){
      arrayInicial[i] = (int)(Math.random() *10); 
      System.out.print(arrayInicial[i] + "  "); 
      
      if(arrayInicial[i] % 2 == 0){
        par++;  
       
      }else{
        impar++;
      }
    }

    boolean esMaximo;
    if(par > impar) {
      esMaximo = true;
    }else {
      esMaximo = false;
    }
    
    
    System.out.println("El numero de par es " + par);
   
    int [] ArrayPar = new int [par] ;
    int [] ArrayImpar = new int [impar] ;
    int k = 0;
    
    for ( i = 0; i < 10 ; i++){
          if(arrayInicial[i] % 2 == 0){
              ArrayPar[k] = arrayInicial[i] ;
              k++;
            }
          if(arrayInicial[i] % 2 != 0){
               ArrayImpar[j] =arrayInicial[i];
              j++;
            
          }
      }
    
    System.out.println("PAR");
    for(i = 0; i < par ; i++){
    System.out.print(ArrayPar[i] + "  ");
    
    }
     System.out.println("");
    System.out.println("IMPAR");
    for (i = 0; i < impar; i++){
    System.out.print(ArrayImpar[i] + "  ");
    }
    int auxMen = 0; //pares
    int auxMay = 0; //impares
    
    for (int q = 0; q < 10; q++) {
      if(esMaximo){
        if(auxMen < par){
          if(esPar(q)){
            arrayFinal[q] = ArrayImpar [auxMay];
            auxMay++;
          }else {
            arrayFinal[q] = ArrayPar [auxMen];
            auxMen++;
          }
        }else {
          arrayFinal[q] = ArrayImpar [auxMay];
          auxMay++;
        }
      }else {
        if(auxMay < impar){
          if(esPar(q)){
            arrayFinal[q] = ArrayImpar [auxMay];
            auxMay++;
          }else {
            arrayFinal[q] = ArrayPar [auxMen];
            auxMen++;
          }
        }else {
          arrayFinal[q] = ArrayPar [auxMen];
          auxMen++;
        }
      }
    }

      
  //cierra
  }
  public static boolean esPar(int n) {
    if(n % 2 == 0){
      return true;
    }else {
    return false;
    }
  }
}


