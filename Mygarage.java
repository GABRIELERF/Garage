/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygarage;

/**
 *
 * @author Gabriel
 */
public class Mygarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculos[] vehiculos = new Vehiculos[5];

        Coche c1 = new Coche(Vehiculos.Tipo.COCHE, 4, 400, "Lamborgini", "Toro", "Amarillo", 70);
        vehiculos[0] = c1;

        Coche c2 = new Coche(Vehiculos.Tipo.COCHE, 4, 700, "Ferrari", "F342", "Rojo", 45);
        vehiculos[1] = c2;

        Moto m1 = new Moto (Vehiculos.Tipo.MOTO, 2, 100, "Harley devison", 30.5, 200);
        vehiculos[2] = m1;
        
        for (int i=0; i<vehiculos.length; i++){
            System.out.println(vehiculos[i].toString());
            //MARCARA UN ERROR POR NO TERMINAR LOS 5 ARRAYS
        }
    }

}
