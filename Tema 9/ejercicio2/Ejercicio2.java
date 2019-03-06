/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author FABIO
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
          int opcion = 0;
        int km;
        Scanner s = new Scanner(System.in);

        Bicicleta Orbea = new Bicicleta(9);
        Coche Audi = new Coche(1000);
        

        while (opcion != 8) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");

            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = Integer.parseInt(s.nextLine());
                    Orbea.recorre(km);
                    break;
                case 2:
                    Orbea.hazElCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = Integer.parseInt(s.nextLine());
                    Audi.recorre(km);
                    break;
                case 4:
                    Audi.QuemaRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos ");
                    System.out.println(Orbea.getKilometrajeRecorrido() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(Audi.getKilometrajeRecorrido() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrajeTotal() + " Km");
                default:

            }

        }
    }
    
}
