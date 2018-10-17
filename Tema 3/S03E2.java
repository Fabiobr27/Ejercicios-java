public class S03E2 {
  public static void main(String [] args){
    System.out.print ("Introduzca la cantidad de euros que quiera converir a pesetas: ");
    double euros = Double.parseDouble(System.console().readLine());
    int pesetas = (int) (euros * 166.368);
    System.out.print(euros +" euros son " + pesetas + " pesetas");
  
  
  
  }
}
