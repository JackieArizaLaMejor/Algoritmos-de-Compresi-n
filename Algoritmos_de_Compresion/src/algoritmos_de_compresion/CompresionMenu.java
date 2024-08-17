/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_de_compresion;


public class CompresionMenu {
    CompressionAlgorithm algorithm;
    private void menus (Scanner sc) {
        System.out.println("Seleccione una opcion: ");
        System.out.println("1) Para comprimir el archivo zip ");
        System.out.println("2) Para comprimir el archivo rar ");
        System.out.println("3) Para comprimir el archivo 7z");
        int opc = Integer.parseInt(sc.nextLine());
        System.out.println("Digite el nombre del archivo: ");
        String filename = sc.nextLine();
        
        switch (opc){
            case 1:
                algorithm =new zip();
                break;
            case 2:
                algorithm =new rar();
                break;
            case 3:
                algorithm =new sietezip();
                break;
           
        }
        algorithm.compress(filename);
    
}
}
