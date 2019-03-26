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
public class Reserva {
   
    
    public int codigoVenta;
    private int asiento;
   

    public Reserva(int codigoVenta, int asiento) {
        this.codigoVenta = codigoVenta;
        this.asiento = asiento;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
   
}
