
package BronsonYSusAviones;

public class BronsonYSusAviones {
    public static void main(String[] args) {
        Inventario in = new Inventario();
        
        Pasajero av1 = new Pasajero();
        av1.setMatricula("HK345");
        av1.setVelocidad(300);
        av1.setNumPasajeros(299);
        
        Pasajero av2 = new Pasajero();
        av2.setMatricula("HK346");
        av2.setVelocidad(300);
        av2.setNumPasajeros(150);
        
        Carga c1 = new Carga();
        c1.setMatricula ("GOD2412");
        c1.setVelocidad(1000);
        
        Paquete p = new Paquete();
        p.setNombre("Carta al niño Dios");
        p.setPeso(25500.0);
        c1.addPaquete(p);
        
        Paquete p2 = new Paquete();
        p2.setNombre("Regalos");
        p2.setPeso(255000.2);
        c1.addPaquete(p2);
        
        Paquete p3 = new Paquete();
        p3.setNombre("Mirra");
        p3.setPeso(12000.0);
        c1.addPaquete(p3);
        
        in.addAvion(av1);
        in.addAvion(av2);
        in.addAvion(c1);
        in.listarAviones();
    }
    
}
