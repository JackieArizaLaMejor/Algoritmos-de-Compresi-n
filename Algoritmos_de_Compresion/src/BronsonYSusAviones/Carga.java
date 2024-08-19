/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BronsonYSusAviones;

import java.util.ArrayList;

/**
 *
 * @author Yaquis
 */
public class Carga extends Avion {
    private ArrayList<Paquete> paquete = new ArrayList<>();
    private double PESO_MAXIMO ;
    private double pesoActual;

    public ArrayList<Paquete> getPaquete() {
        return paquete;
    }
    
    public void addPaquete(Paquete paquete){
    }

    @Override
    public String toString() {
        return "Carga{" + "paquete=" + paquete + ", PESO_MAXIMO=" + PESO_MAXIMO + ", pesoActual=" + pesoActual + '}';
    }
    
    
}
