
package BronsonYSusAviones;

public class Avion {
    
    private int velocidad;
    private String matricula;

    public Avion() {
    }

    public Avion(int velocidad, String matricula) {
        this.velocidad = velocidad;
        this.matricula = matricula;
    }
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Avion{" + "velocidad= " + velocidad + ", matricula= " + matricula + '}';
    }
    
   
    
}
