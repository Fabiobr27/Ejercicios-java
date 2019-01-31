package Libreria;

public class premio {
public static int premio (int [] numerosPremiados , int [] premios , int boleto ){
    int gana = 0;
    int [] premiados;  
    for  (int i=0; i< numerosPremiados.length && (gana ==0); i++){
      if (numerosPremiados[i] == boleto){
        gana = premios[i];
      }
    }
    
    if(gana == 0){
      if((boleto % 10) == ( numerosPremiados[0] % 10)){
        gana = 5 ;
      }if ((boleto % 10 )!= ( numerosPremiados[0] % 10 )){
        gana = 0;
      }
    
    }
  return gana;
  }
}
