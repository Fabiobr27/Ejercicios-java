public class S04E24 {
  public static void main (String [] args ){
    
    int cargoEmp;
    int diasVisitasCliente;
    int estadoCivil;
    int porcentajeIRPF;
    
    double sueldoBase;
    double dietas;
    double retencionIRPF;
    
    double sueldoBruto;
    
    System.out.println("1- Programador Junior");
    System.out.println("2- Programador Senior");
    System.out.println("3- Jefe de Proyecto");
    System.out.print("Introduzca el cargo del empleado del 1-3: ");
    
     String entrada = System.console().readLine();
   
    cargoEmp= Integer.parseInt(entrada);
    
    
    System.out.print("¿Cuantos días has estado visitando clientes? ");
    
    entrada = System.console().readLine();
    diasVisitasCliente = Integer.parseInt(entrada);
    
    
    System.out.print("Introduzca su estado civil: 1= Soltero 2 = Casado ");
    
    entrada = System.console().readLine();
    estadoCivil = Integer.parseInt(entrada);
    
    switch (cargoEmp) {
      case 1:
      sueldoBase = 950 ;
      break;
     
      case 2:
      sueldoBase = 1200 ;
      break;
     
      case 3:
      sueldoBase = 1600 ;
      break;
      
      default:
      sueldoBase = 0 ;
    }
    
    
    dietas = diasVisitasCliente * 30;
    
    sueldoBruto = sueldoBase + dietas ;
    
    
    if ( estadoCivil == 1) {
      porcentajeIRPF = 25;
    } else {
      porcentajeIRPF = 20;
    }
    
    retencionIRPF = sueldoBruto * porcentajeIRPF/100 ;
    
    System.out.printf("--------------------------\n");
    System.out.printf("= Sueldo Base           %7.2f=\n",sueldoBase);
    System.out.printf("= Dietas  (%2d viajes)  %7.2f=\n",diasVisitasCliente,dietas);
    System.out.printf("--------------------------\n");
    System.out.printf("= Sueldo Bruto          %7.2f=\n",sueldoBruto);
    System.out.printf("= RetenciónIRPF  (%2d%%) %7.2f=\n",porcentajeIRPF,retencionIRPF);
    System.out.printf("--------------------------\n");
    System.out.printf("= Sueldo Neto           %7.2f=\n",sueldoBruto - retencionIRPF);
    System.out.printf("--------------------------\n");
    
  
  }
}
