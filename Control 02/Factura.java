public class Factura{
  public static void main (String [] args){
   
    double precioArticulo;
    double numeroUnidades;   
    double codigoDescuento;
    double precioDescuento;
   
    System.out.println("Introduce el precio del articulo");
    precioArticulo = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el numero de unidades");
    numeroUnidades=Double.parseDouble(System.console().readLine());
       
    double precioTotal =(numeroUnidades*precioArticulo);
       
    System.out.println("Introduce el código de descuento ");
    codigoDescuento= Double.parseDouble(System.console().readLine());
    double Descuento = 0;
    double precioConDescuento = precioTotal;
    double aux;
    
      aux = 1;
   
   
    if(codigoDescuento == 685){
      precioConDescuento = (precioTotal - 15);
      Descuento = 15;
    }if(codigoDescuento == 778){
      //5 % descuento 20 primera unidades
      for(int i = 0 ; i < 20; i++){
      Descuento = (precioArticulo * 0.05) * numeroUnidades;
      precioConDescuento = (precioTotal - Descuento);
      }
      
      
    }
    if((codigoDescuento ==219) && ( numeroUnidades > 5)){
      Descuento = (precioArticulo * 5);
      precioConDescuento = (precioTotal - Descuento);
    
      
      
    }

    
    double ivaPrecio = (precioConDescuento * 0.21);
    double precioFinal = (precioConDescuento + ivaPrecio);
    /*
    System.out.println("A continuación , se le muestra el precio desglosado del pedido:");
    //Salida formateada
    System.out.println("----------------------------------------------------------");
    System.out.printf("Precio del articulo                      %7.2f > € \n" , precioArticulo);
    System.out.printf("Numero de unidades                      %4d\n", numeroUnidades );
    System.out.println("Precio total de unidades                %7.2f > € \n" + precioTotal);
    System.out.println("Descuento aplicado :Código de descuento : " + codigoDescuento + "---->" +Descuento + " $ "); 
    System.out.println("Precio con descuento ---------------------------> " +  precioConDescuento + " $ ");
    System.out.println("IVA (21%) --------------------------------------> " +  ivaPrecio + " $ ");
    System.out.println("-----------------------------------------------------------");
    System.out.println("Precio Final -----------------------------------> " + precioFinal + " $ ");
    */
    
    System.out.println("----------------------------------------------------------");
    System.out.println("Precio del articulo ---------------------------->  " + precioArticulo + " $ ");
    System.out.println("Numero de unidades ----------------------------->  " + numeroUnidades + " $ ");
    System.out.println("Precio total de unidades------------------------>  " + precioTotal + " $ ");
    System.out.println("Descuento aplicado :Código de descuento : " + codigoDescuento + "---->" +Descuento + " $ "); 
    System.out.println("Precio con descuento ---------------------------> " +  precioConDescuento + " $ ");
    System.out.println("IVA (21%) --------------------------------------> " +  ivaPrecio + " $ ");
    System.out.println("-----------------------------------------------------------");
    System.out.println("Precio Final -----------------------------------> " + precioFinal + " $ ");
  
    
    
  }
  
}
