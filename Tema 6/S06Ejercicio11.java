public class S06Ejercicio11 {
  public static void main (String [] args ){
  
  System.out.println("Este programa genera 20 notas aleatorias");
  
  int notas;  
  int suspensos = 0;
  int suficiente = 0;
  int bien = 0;
  int notable = 0;
  int sobresaliente = 0;
  
  for (int i = 0; i <20;i++){
  notas = (int)(Math.random()*11);

  if ( notas <5){
    System.out.print("suspenso ");
    suspensos++;
  }if (notas==5){
    System.out.print("suficientes ");
    suficiente++;
  }if(notas==6){
    System.out.printf("bien ");
    bien++;
  }if((notas>=7)&&(notas<=8)){
    System.out.print("notable ");
    notable++;
  }if ((notas>=9)&&(notas<=10)){
    System.out.printf("sobresaliente ");
    sobresaliente++;
  }
    
  
  
  System.out.println(notas);
    }  
    System.out.println("El numero de suspensos es " + suspensos  + " suspensos");
    System.out.println("El numero de suficientes es " + suficiente + " suficientes");
    System.out.println("El número de bienes es " + bien + " bienes");
    System.out.println("El número de notables es " + notable + " notables");
    System.out.println("El numero de sobresalientes es " + sobresaliente + " sobresalientes");
    
    
  }
}
