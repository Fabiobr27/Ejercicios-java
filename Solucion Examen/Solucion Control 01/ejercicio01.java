public class ejercicio01 {
  public static void main (String[] args) {
    int numeroDecimal;
    String numeroEnBinario = "";
    
    do {
      System.out.print("Introduzca un nº decimal (entre 0 y 9999):");
      numeroDecimal = Integer.parseInt(System.console().readLine());
    } while ((numeroDecimal <0) || (numeroDecimal > 9999));
    
    int cociente = numeroDecimal;
    int resto;
  
    while (cociente > 0) {
        resto = cociente % 2;
        cociente = cociente / 2;
        
        numeroEnBinario = resto + numeroEnBinario;
      
    }
  
    if (numeroEnBinario == "") {
      numeroEnBinario = "0";
      
    }
  
    System.out.println("El número " + numeroDecimal + " se escribe en binario así: " + numeroEnBinario);
  }
}
