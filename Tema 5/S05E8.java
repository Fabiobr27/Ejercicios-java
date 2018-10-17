public class S05E8 {
  public static void main (String [] args) {
  
    System.out.println("Introduce un número y te diré su tabla de multiplicar ");
   int numerointroducido = Integer.parseInt(System.console().readLine());
  
    for (int i = 0; i<=10; i++){ 
    System.out.print("La tabla de multiplicar de " + numerointroducido + " es ");
    System.out.println(numerointroducido + "x" + i + " = " + numerointroducido*i);
    }
  }
}
