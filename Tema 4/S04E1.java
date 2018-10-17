public class S04E1 {
 public static void main (String [] args ) {
 
  String dia ;
  System.out.println("Introduzca un dia de la semana y te diré que tienes a primera hora");
  dia = (System.console().readLine());
  dia.toLowerCase();
  switch(dia) {
    case "Lunes":
    System.out.println("Sistemas informáticos");
    break;
    
    case "Martes":
    System.out.println("Programación");
    break;
    
    case "Miercoles":
    System.out.println("Entorno de Desarrollo");
    break;
    
    case "Jueves":
    System.out.println("Entorno de desarrollo");
    break;
    
    case "Viernes":
    System.out.println(" Sistemas informaticos");
    break;
    
    case "Sabado":
     System.out.println("No hay clase");
    break;
    
    case "Domingo":
    System.out.println("No hay clase");
    break;
   }
  
  
  
  
  
 }
}
