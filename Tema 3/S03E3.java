public class S03E3 {
  public static void main(String [] args){
    System.out.print ("Introduzca la cantidad de pesetas que quiera converir a euros: ");
    double pesetas = Double.parseDouble(System.console().readLine());
    int euros = (int) (pesetas / 166.368);
    System.out.print( pesetas +" pesetas son " + euros + " euros");
  
  
  
  }
}
