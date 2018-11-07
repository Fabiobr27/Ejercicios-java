public class S06Ejercicio14 {
  public static void main (String [] args ){
    int oportunidades= 5;
    int numeroaleatorio;
    int respuesta;
    boolean acertado = false;
    numeroaleatorio = (int)(Math.random()*100)+1;
    
      System.out.println("Este programa crea un numero aleatorio entre 0 y 100");
   
  
    do{
      System.out.println("Introduce un número");
      respuesta = Integer.parseInt(System.console().readLine());
      
     if((respuesta< numeroaleatorio)&&(oportunidades>0)){
       System.out.println("El numero intoducido es menor que el numero aleatorio");
       oportunidades--;
      System.out.println("Te quedan " + oportunidades + " intentos");
     }if((respuesta>numeroaleatorio)&&(oportunidades>0)){
       System.out.println("El número introducido es mayor que el numero aleatorio");
       oportunidades--;
      System.out.println("Te quedan " + oportunidades + " intentos");
     }if((respuesta==numeroaleatorio)&&(oportunidades>0)){
       acertado = true;
       System.out.println("Enhorabuena  has acertado");
     }
     }while(!acertado && (oportunidades>0));
      if(!acertado){
      System.out.println("Lo siento no has acertado, el número aleatorio era " + numeroaleatorio);
      }
    
  }
}
      
