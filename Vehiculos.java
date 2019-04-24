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
public class Vehiculos {
    //ENUMERADO
    public enum Tipo {COCHE,MOTO,CAMION,BUS};
    //tipo, numero de placas, peso, numero de ruedas
    Tipo tipo;
    int nplaza;
    double peso;
    
    //contructor
    public Vehiculos(Tipo tipo, int nplaza, double peso) {
        this.tipo = tipo;
        this.nplaza = nplaza;
        this.peso = peso;
      
    }
    
    @Override
    public String toString(){
    String s= "Es un "+tipo.name()+" que tiene "+nplaza+".";
    s +="\n El peso del vehiculo es de "+peso+".";
    return s;
    }
           
    
}
