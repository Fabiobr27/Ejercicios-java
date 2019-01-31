import  Libreria.*;
 public class loteriaRepaso1{
  public static void main (String [] args){
    
    int [] premios = {1000, 500, 250 , 50 , 50, 50 , 50 ,50 , 50, 50 ,50, 50 , 50};
    int [] numerosPremiados = new int [13];
    boolean repetido = false;
    boolean premiado = false;
    int boleto ;
    
    System.out.println("SORTEO LOTERIA");
    
    //Mete los numeros Premiados en un Array
    do{
      for(int i = 0; i < 13 ; i++){
      numerosPremiados [i]= (int)(Math.random()*9999)+1;
      if(numerosPremiados[i] == numerosPremiados[i]){
        repetido = true;
      }
    }
      }while(repetido!=true);
      int ultimoDigito = (numerosPremiados[0]%10);
  
  //Muestra los numeros premiados
    for(int i = 0; i < 13 ; i++){
    System.out.println("El numero " + numerosPremiados[i] + " ha sido premiado con " +  premios[i] + " euros" );
    
  }
  
    //Comprueba su decimo
    do{
      
      System.out.println("Introduce los numeros de su Decimo");
      boleto = Integer.parseInt(System.console().readLine());
      int ultimoDigitoBoleto = (boleto % 10); 
    
      for (int i = 0; i < 1 ; i++){
        boolean  encontrado = false;
        for (int j = 0; j < 13; j++){
          if(boleto == numerosPremiados[j]){
            encontrado = true;
            System.out.println("Número "+boleto +" premiado con: "+ premios[j]+" €");
          }
         
        }
        if ((encontrado == false) && (boleto % 10 != numerosPremiados[0] % 10)) {
         System.out.println("No hay premio");
        }
        
        if((encontrado == false) && (boleto % 10 == numerosPremiados[0] % 10)){
        System.out.println("Boleto premiado con 5 $");
        premiado = true;
      
        }

      }
      
    }while (boleto != 0);
    
    
  //Muestra al terminar los decimos premiados
  for( int i = 0; i < 13 ; i++){
    System.out.printf("El numero %6d ha sido premiado con  %6d €\n",numerosPremiados[i],premios[i]);
  }
  
  System.out.println("Reintegro a la terminacion "  + ultimoDigito);
  System.out.println( boleto% 10);  
  
  //cierra
  }
}
