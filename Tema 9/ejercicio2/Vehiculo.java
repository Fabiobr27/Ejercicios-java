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
public abstract class Vehiculo {
      private static int KilometrajeTotal = 0;
    private static int vehiculosCreados = 0;
    
    private int KilometrajeRecorrido;
    
    public Vehiculo(){
        this.KilometrajeRecorrido= 0;
    
    }
    
    public int getKilometrajeRecorrido(){
     return this.KilometrajeRecorrido;  
    }
    
    public int getKilometrajeTotal(){
        
        return Vehiculo.KilometrajeTotal;
    
    } 
    
    public void recorre(int k) {
       this.KilometrajeRecorrido  += k;
       Vehiculo.KilometrajeTotal  += k;   
    }
    
}
