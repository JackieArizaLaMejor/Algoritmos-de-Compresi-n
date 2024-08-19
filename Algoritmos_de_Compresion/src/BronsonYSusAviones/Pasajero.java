/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BronsonYSusAviones;

/**
 *
 * @author Yaquis
 */
public class Pasajero extends Avion{
    private int numPasajeros;

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "numPasajeros=" + numPasajeros + '}';
    }
    
    
}
