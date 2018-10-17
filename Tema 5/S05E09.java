public class S05E09 {
  public static void main (String [] args) {
    
    int numeroDigitos = 1,n,numerointroducido;
    
    System.out.println("Introduce un número y te diré cuantos dígitos tiene:");
    numerointroducido = Integer.parseInt(System.console().readLine());
    n =numerointroducido;
    while( n>10 ){ 
      n/=10;
      numeroDigitos++;
    }
    System.out.println("El número introducido tiene " + numeroDigitos + " dígitos");
  }
}
    
