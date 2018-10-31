public class S06Ejercicio06 {
  public static void main (String [] args){
  
  int oportunidades = 10;
  int numeroazar ;
  int numerointroducido;
  boolean acertado = false;
  numeroazar= (int)(Math.random()*101);

    do{
      System.out.println("Introduce un numero");
      numerointroducido =Integer.parseInt(System.console().readLine());
      oportunidades--;
    
      if((numerointroducido < numeroazar) && (oportunidades > 0)) {
      System.out.println("Lo siento no has acertado, el número introducido es menor que el número oculto");
      System.out.println("Te quedan " + oportunidades + " intentos");
  
      } if((numerointroducido > numeroazar) && (oportunidades > 0)) {
      System.out.println("Lo siento no has acertado, el numero introducido es mayor que el número oculto");
      System.out.println("Te quedan " + oportunidades + " intentos");
      }
      if ((numerointroducido == numeroazar) &&( oportunidades > 0)) {
      acertado = true;
      System.out.println("Enhorabuena has acertado");
      }
    } while (!acertado && (oportunidades>0));
      if(!acertado){
      System.out.println("Lo siento no has acertado, el número oculto era " + numeroazar);
      }
      
     
  }
}
