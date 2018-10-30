public class S06Ejercicio05{
  public static void main (String [] args){
  
  int minimo = 100;
  int maximo =199;
  int suma = 0;
  int n;
  
  for(int i = 0; i <=50;i++){
    n= (int)(Math.random()*100)+100;
    System.out.println(n+"");
    suma += n;
  }
  System.out.println("La suma de todos los números es " + suma );
  System.out.println("La media de todos los numeros es " + suma/50 );
  
  }
}
