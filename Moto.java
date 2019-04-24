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
public class Moto extends Vehiculos {

    //Atributos de moto
    String marca;
    double deposito;
    int caballos;

    //contructores
    public Moto(Vehiculos v, String marca, double deposito, int caballos) {
        super(v.tipo, v.nplaza, v.peso);
        this.marca = marca;
        this.deposito = deposito;
        this.caballos = caballos;

    }

    //contructores
    public Moto(Tipo tipo,int nplaza, double peso, String marca, double deposito, int caballos) {
        super(tipo, nplaza, peso);
        this.marca = marca;
        this.deposito = deposito;
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        String s = "Los datos de la moto son:\n";
        s += "Marca: " + marca + "\n";
        s += "Capacidad de deposito: " + deposito + "\n";
        s += "\n" + "Caballos de fuerza: " + caballos;
        return s;
    }

}
