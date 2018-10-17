public class S04E6{ 
  public static void main(String [] args) {
  
     System.out.println("Este programa calcula el tiempo  que tarde un objeto al caer desde una altura h:");
     System.out.println("Introduce el valor de h :");
     double h = Double.parseDouble(System.console().readLine());
     double g;
     //Formula = t =raiz cuadrada (2h/g) g=9.81
     g = 9.81;
     double tiempo = Math.sqrt(2*h/g);
     //Raiz cuadrada = Math.sqrt(
     System.out.println("El tiempo que tarda en care el objeto es : " + tiempo);
     
  }
}
