
package BronsonYSusAviones;

import java.util.ArrayList;

public class Inventario{
    private ArrayList<Avion> aviones = new ArrayList();

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public Inventario() {
    }
    
    
    public void addAvion(Avion Avion){
        aviones.add(Avion);
        
    }
    
    public void listarAviones(){
        for (Avion avion : aviones) {
            System.out.println("Matrícula: " + avion.getMatricula() + ", Velocidad: " + avion.getVelocidad());
        }
        
    }
    
    

    
    
    
    
    
    
    
}
