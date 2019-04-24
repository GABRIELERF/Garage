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
public class Coche extends Vehiculos{
    //Atributos de coche
    String marca;
    String modelo;
    String color;
    double deposito;

    public Coche(Vehiculos v, String marca, String modelo,String color, double deposito){
       super(v.tipo,v.nplaza,v.peso);
       this.marca=marca;
       this.modelo=modelo;
       this.color=color;
       this.deposito=deposito;
   }
   
     public Coche(Tipo tipo,int nplaza, double peso, String marca, String modelo,String color, double deposito){
       super(tipo,nplaza,peso);
       this.marca=marca;
       this.modelo=modelo;
       this.color=color;
       this.deposito=deposito;
     }
    @Override
     public String toString(){
         String s="Los datos del coche son:\n";
         s += "Marca: "+this.marca+"\n";
         s +="Modelo: "+this.modelo+"\n";
         s +="Color: "+this.color+"\n";
         s +="Capacidad de tanque: "+this.deposito+"L."+"\n";
         return s;
     }
}
