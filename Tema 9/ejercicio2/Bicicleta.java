/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author FABIO
 */
public class Bicicleta extends Vehiculo{
    
       final int pinones ;//Numero de pìñones
    
    public Bicicleta(int p ){
        super();
        this.pinones = p;
    }
 
    public void hazElCaballito(){
        System.out.println("Estoy haciendo el caballito");
    }
}
