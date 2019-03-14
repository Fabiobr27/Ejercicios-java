/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

/**
 *
 * @author FABIO
 */
public class Elemento{

  private String producto;
  private float precio ;
  private int cantidad = 1;
   
    public Elemento (String productoIn, float precioIn , int cantidadIn) {
    this.producto = productoIn;
    this.precio = precioIn;
    this.cantidad = cantidadIn;
  }

    public String getProducto() {
        return producto;
    }
    
    
  /*
  public int getPrecio() {
    return this.precio;
  }
    */
  public String toString () {
    String salida= "Producto: ";
    salida += this.producto;
    salida += ": PVP = " + this.precio + " ; Cantidad: " + this.cantidad  + " ; Subtotal: "  + String.format("%.2f",this.cantidad*this.precio) + "\n" ;
    return salida;
  }

}
