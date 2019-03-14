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

    public Carrito() {
        Articulos = new ArrayList<Elemento>();
    }

    public String toString() {
        String salida = "Contenido del carrito :\n";
        salida += " ----------------------- \n";
        for (Elemento e : this.Articulos) {
            salida += e.toString();
        }
        return salida;
    }

    public void agrega(Elemento a) {
        this.Articulos.add(a);
    }

    public void elimina(String a) {
        for (int i = 0; i < Articulos.size(); i++) {
            if (a.equals(Articulos.get(i).getProducto())) {
                //i = indice del articulo(lugar que ocupa en el arraylist)
                //(Articulos.get(i) = Muestra el elemento que esta enn la posicion i
                //get.producto = Saca el nombre del elemento en la posicion i
                Articulos.remove(i);
                System.out.println("Elemento borrado ");
            } else {
                System.out.println("Ese producto no existe");
            }
        }

    }

    public int numeroDeElementos() {

        return Articulos.size();
    }
    /*
     public int importeTotal(){
     float resultado = (float)0.00;
     for(Elemento e : this.articulos){
     resultado += e.getSubtotal();
     }
       //int importeTotal =(this.precio*this.cantidad);
         return importeTotal;
     }


    void elimina(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
}
