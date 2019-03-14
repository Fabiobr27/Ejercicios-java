/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FABIO
 */
public class ListaCompra {

    public static void main(String[] args) {

        int opcion;
        Scanner s = new Scanner(System.in);
        Carrito miCarrito = new Carrito();
        do {

            System.out.println("\n\nPonte y Quita:");
            System.out.println("1.- Añadir elemento al carrito");
            System.out.println("2.-Quitar elemento del carrito");
            System.out.println("3.- Mostrar carrito");
            System.out.println("0.- Salir.");
            System.out.print("--> Indique opción: ");

            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del articulo");
                    String nombre = s.nextLine();
                    System.out.println("Introduce el precio del articulo");
                    int precio = Integer.parseInt(s.nextLine());
                    System.out.println("Introduce la cantidad del articulo");
                    int cantidad = Integer.parseInt(s.nextLine());

                    miCarrito.agrega(new Elemento(nombre, (float) precio, cantidad));
                    break;
                case 2:
                    System.out.println("Introduce el nombre del articulo que quieres quitar");
                    nombre = s.nextLine();
                    
                    miCarrito.elimina(nombre);

                    break;
                case 3:
                    System.out.println(miCarrito);

                    System.out.print("Hay " + miCarrito.numeroDeElementos());
                    System.out.println(" productos en la cesta.");
                   // System.out.println("El total asciende a " + miCarrito.importeTotal() + " euros");
                    break;
                default:
            }

        } while (opcion != 0);
    }
}
