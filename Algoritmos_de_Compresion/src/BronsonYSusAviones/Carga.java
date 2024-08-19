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

    private ArrayList<Paquete> paquetes = new ArrayList<>();
    private double PESO_MAXIMO;
    private double pesoActual;

    public ArrayList<Paquete> getPaquete() {
        return paquetes;
    }

    public void addPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    @Override
    public String toString() {
        return "Carga{" + "paquete=" + paquetes + ", PESO_MAXIMO=" + PESO_MAXIMO + ", pesoActual=" + pesoActual + '}';
    }

}
