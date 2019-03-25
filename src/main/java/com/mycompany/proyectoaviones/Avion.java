/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoaviones;

import java.util.HashMap;

/**
 *
 * @author SuperUs
 */
public class Avion {
 
    public int llave;
    public int codAvion;
    public int puesto;
    public int precio;
    public HashMap<Integer,Reserva> reserva;
    
    
    public Avion(int llave,int codAvion, int puesto, int precio) {
        this.llave = llave;
        this.codAvion = codAvion;
        this.puesto = puesto;
        this.precio = precio;     
    }

      public int getLlave() {
        return llave;
    }

    
    public int getCodAvion() {
        return codAvion;
    }

    public int getPuesto() {
        return puesto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }
    public void setCodAvion(int codAvion) {
        this.codAvion = codAvion;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
     
    public HashMap<Integer, Reserva>getReserva(){
        return reserva;
    }
    
    public void setReserva(HashMap<Integer, Reserva>reserva){
        this.reserva = reserva;
    }
}
