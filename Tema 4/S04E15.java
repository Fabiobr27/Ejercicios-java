public class S04E15 {
  public static void main (String [] args){
    System.out.println("Este programa dibuja una piramide:");
    System.out.println("Elija un caracter para realizar la piramide;");
    String r = System.console().readLine();
    
    
    System.out.println("Elige el diseño de  la piramide :");
    
    System.out.println("1-Vertice hacia arriba");
    System.out.println("2-Vertice hacia abajo");
    System.out.println("3-Vertice hacia la izquierda");
    System.out.println("4-Vertice hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion){
      case 1 :
      System.out.println("  " +   r );
      System.out.println(" "+ r + r + r );
      System.out.println( r + r+ r + r + r);
      break;
      case 2:
      System.out.println( r + r+ r + r + r);
      System.out.println(" "+ r + r + r );
      System.out.println("  " +   r );
      break;
      case 3:
      System.out.println("  " +  r );
      System.out.println(" " +r + ""+ r );
      System.out.println("" + r + "" + r + ""+ r );
      System.out.println(" " + r + "" + r );
      System.out.println("  "+ r );
      break;
      
      case 4:
      System.out.println("" +    r );
      System.out.println("" +r + r );
      System.out.println("" + r + r + r );
      System.out.println("" + r + r );
      System.out.println(""+ r );
      break;
      default:
    }
    
    
    
  }
}
