/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BronsonYSusAviones;

public class Paquete {

    private String nombre;
    private double peso;

    public Paquete(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Paquete() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }
//lo mas loka der ciudad bolivar

    public void setPeso(double peso) {
        if (peso > 447700) {
            System.out.println("El paquete no puede ser agregado. Carga maxima");
            
        } else if (peso <= 447700){
            this.peso = peso;
        }
        
        

    }

    @Override
    public String toString() {
        return "Paquete{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }

}
