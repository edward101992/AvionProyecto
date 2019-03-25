/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoaviones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java. util. Date;
import java.util.HashMap;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author SuperUs
 */
public class Persona implements Serializable{

        
    public int identificacion;
    public String nombre;
    public String apellido;
    public Date fechaNac;
    public HashMap<Integer,Reserva> reserva;
    
    public Persona(){
        
    }
    
    
    public Persona(int identificacion, String nombre, String apellido, String fechaNac) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        setFechaNac(fechaNac);
        reserva = new HashMap<>();
    }
    
    public void setFechaNac(String fechaNac) {
        try {
            this.fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNac);
        } catch (ParseException ex) {
        }
    }


     public Date getFechaNac() {
        return fechaNac;
    }
     
    
    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
      public HashMap<Integer, Reserva>getReserva(){
        return reserva;
    }
    
    public void setReserva(HashMap<Integer, Reserva>reserva){
        this.reserva = reserva;
    }
       
}
