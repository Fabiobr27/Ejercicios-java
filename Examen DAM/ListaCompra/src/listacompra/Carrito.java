/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class Carrito {

    private ArrayList<Elemento> Articulos; 
    
    public  Carrito (){
        Articulos = new ArrayList<Elemento>();
    }
    
     public String toString () {
    String salida = "Contenido del carrito :\n";
    salida += " ----------------------- \n"; 
            for(Elemento e:this.Articulos){
                salida += e.toString();
            }
    return salida;
  }
     
     public void agrega(Elemento a){
         this.Articulos.add (a);
     }
     public void elimina(Elemento a){
         this.Articulos.remove (a);
     }
    
     public int numeroDeElementos(){
       
         return Articulos.size();
     }
     /*
     public int importeTotal(){
       int importeTotal =(this.precio*this.cantidad);
         return importeTotal;
     }
*/

    void elimina(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
