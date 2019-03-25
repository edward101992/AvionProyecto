/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoaviones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java. util. Date;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date;  
import java.util.Scanner;
/**
 *
 * @author SuperUs
 */
public class Inicio {
    
       public BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
       public HashMap<Integer, Avion>avi;
       private HashMap<Integer, Persona>persona;
      
       public Inicio(){
           avi = new HashMap();
           persona = new HashMap();   
       }
       
       public void menuInicio(){
           try{
              String opc="";
               do{
           System.out.println("******Aeropuerto*********");
           System.out.println("1. Insertar Cliente");
           System.out.println("2. Reservar");
           System.out.println("3. Buscar Cliente");
           System.out.println("4. Buscar Asiento");
           System.out.println("5. Despegar Avion");
           System.out.println("6. Salir");
           opc = datos.readLine();
           
           if(opc.equals("1")){
               System.out.println("*******Agregar Cliente*********");
               System.out.println("Digite Identificacion");
               int codigoCliente = Integer.parseInt(datos.readLine());
               System.out.println("Digite el nombre :");
               String nombre = datos.readLine();
               System.out.println("Digite Apellido");
               String apellido = datos.readLine();
               System.out.println("Fecha Nacimiento");
               String fechanac = datos.readLine();
               agregaCliente(codigoCliente,nombre,apellido,fechanac);
           }else if (opc.equals("2")){
               pintarAvion();
               int codigoCliente;
               codigoCliente = Integer.parseInt(datos.readLine());
               agregarReserva(codigoCliente);
              
 //              String opcavio="";
 //              System.out.println("Digite el Avion: ");
 //              opcavio= datos.readLine();
 //              int asiento;               
 //              if(opcavio.equals("1")){                   
 //                  System.out.println("Digite el numero de asiento");
 //                  asiento = Integer.parseInt(datos.readLine());
 //              }else if(opcavio.equals("2")){
 //                  System.out.println("Digite el numero de asiento");
 //                  asiento = Integer.parseInt(datos.readLine());
 //              }else if(opcavio.equals("3")){
 //                  System.out.println("Digite el numero de asiento");
 //                  asiento = Integer.parseInt(datos.readLine());
 //              }
               
           }else if(opc.equals("3")){
               System.out.println("*********Buscar Cliente*******");
               int codigoCliente;
               System.out.println("Digite Codigo del cliente");
               codigoCliente = Integer.parseInt(datos.readLine());
               verReserva(codigoCliente);             
           }else if(opc.equals("4")){
               String opcAvi="";
               int numeroAsiento;
               System.out.println("*********Buscar Asiento*****");
               System.out.println("Digite el Avion");
               opcAvi = datos.readLine();
              if(opcAvi.equals("1")){
                  System.out.println("Avion numero 1");
                  System.out.println("Digite el Asiento");
                  numeroAsiento=Integer.parseInt(datos.readLine());
              }else if(opcAvi.equals("2")){
                  System.out.println("Avion numero 2");
                  System.out.println("Digite el Asiento");
                  numeroAsiento=Integer.parseInt(datos.readLine());
              }else if(opcAvi.equals("3")){
                  System.out.println("Avion numero 3");
                  System.out.println("Digite el Asiento");
                  numeroAsiento=Integer.parseInt(datos.readLine());
              }
           }else if(opc.equals("5")){
               System.out.println("Digite Avion que desdegara");
               int opcavi = Integer.parseInt(datos.readLine());
               if(opcavi >=4){
                   System.out.println("Avion NO Valido");
               }
               despegarAvion(opcavi);
           }
               }while(!(opc.equals("6")));
               
           }catch(Exception Ex){
               System.out.println(Ex.getMessage());
               System.out.println("Error en Menu");
           }
           
           
       }
       
       public void pintarAvion(){
            System.out.println("********RESERVAR***********"); 
               System.out.println("");               
               System.out.println("*********************************");
               System.out.println("*********Avion Numero 1 MIXTO **********");
               System.out.println("VIP = 50.000 - COMERCIAL = 20.000");
               System.out.println("");
               System.out.println("1 - 3" + " X X X Clase VIP");
               System.out.println("4 - 6" + " X X X Clase VIP");
               System.out.println("7 - 9" + " X X X Clase COMERCIAL");
               System.out.println("10-12" + " X X X Clase COMERCIAL");
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("*********Avion Numero 2 EJECUTIVO **********");
               System.out.println("EJECUTIVO = 30.000");
               System.out.println("");
               System.out.println("1 - 3" + " X X X ");
               System.out.println("4 - 6" + " X X X ");
               System.out.println("7 - 9" + " X X X ");
               System.out.println("10-12" + " X X X ");               
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("*********Avion Numero 3 NORMAL **********");
               System.out.println("NORMAL = 15.000");
               System.out.println("");
               System.out.println("1 - 3" + " X X X ");
               System.out.println("4 - 6" + " X X X ");
               System.out.println("7 - 9" + " X X X ");
               System.out.println("10-12" + " X X X ");
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("Digite codigo cliente");

       }
       
       
       public void insertarAvion(){
            avi = new HashMap<>();
            //Avion 1
            avi.put(1,new Avion(1,1,1,50000));
            avi.put(2,new Avion(2,1,2,50000));
            avi.put(3,new Avion(3,1,3,50000));
            avi.put(4,new Avion(4,1,4,50000));
            avi.put(5,new Avion(5,1,5,50000));
            avi.put(6,new Avion(6,1,6,50000));
            //clase ejecutiva
            avi.put(7,new Avion(7,1,7,20000));
            avi.put(8,new Avion(8,1,8,20000));
            avi.put(9,new Avion(9,1,9,20000));
            avi.put(10,new Avion(10,1,10,20000));
            avi.put(11,new Avion(11,1,11,20000));
            avi.put(12,new Avion(12,1,12,20000));
            //Avion 2
           
            avi.put(13,new Avion(13,2,1,30000));
            avi.put(14,new Avion(14,2,2,30000));
            avi.put(15,new Avion(15,2,3,30000));
            avi.put(16,new Avion(16,2,4,30000));
            avi.put(17,new Avion(17,2,5,30000));
            avi.put(18,new Avion(18,2,6,30000));         
            avi.put(19,new Avion(19,2,7,30000));
            avi.put(20,new Avion(20,2,8,30000));
            avi.put(21,new Avion(21,2,9,30000));
            avi.put(22,new Avion(22,2,10,30000));
            avi.put(23,new Avion(23,2,11,30000));
            avi.put(24,new Avion(24,2,12,30000));
            
            //Avion 3
            
            avi.put(25,new Avion(25,3,1,15000));
            avi.put(26,new Avion(26,3,2,15000));
            avi.put(27,new Avion(27,3,3,15000));
            avi.put(28,new Avion(28,3,4,15000));
            avi.put(29,new Avion(29,3,5,15000));
            avi.put(30,new Avion(30,3,6,15000));         
            avi.put(31,new Avion(31,3,7,15000));
            avi.put(32,new Avion(32,3,8,15000));
            avi.put(33,new Avion(33,3,9,15000));
            avi.put(34,new Avion(34,3,10,15000));
            avi.put(35,new Avion(35,3,11,15000));
            avi.put(36,new Avion(36,3,12,15000));
           
       }
     
        public void agregarReserva(int cod){
        try{
            int llaveAvion;
           if(persona.containsKey(cod)){
          // if(1 == 1 ){
                System.out.println("Avion:");
                int avion = Integer.parseInt(datos.readLine());
                System.out.println("Asiento:");
                int asiento = Integer.parseInt(datos.readLine());
          //      System.out.println(avi.size());
                int puestoAvi=0;
                for (HashMap.Entry<Integer,Avion> entry : avi.entrySet()){        
                     if(entry.getValue().codAvion== avion  && entry.getValue().puesto== asiento){
                       puestoAvi= entry.getValue().llave;
                     }
           }                           
               Reserva rep = new Reserva(cod,puestoAvi);
               persona.get(cod).getReserva().put(cod, rep);
            }
        }catch(Exception Ex){
            System.out.println(Ex.getMessage());
            System.out.println("Aqui ocurrio un Error en la Linea 103");
        }       
    }
        
        
    public void agregaCliente(int cod, String nom, String ape,String fech){
          Persona per = new Persona(cod,nom,ape,fech);
          if(persona.containsKey(cod)){
              System.out.println("El cliente ya esta en la Base de Datos");
          }else{
              persona.put(cod, per);
          }
      }
        
         public void verReserva (int cod){
            if(persona.containsKey(cod)){
                if(persona.get(cod).reserva.isEmpty()){
                    System.out.println("La persona no tiene Reservas");
                }else {
                int i = 1;
                System.out.println("Reporte de la Persona:  " + persona.get(cod).getNombre()+ " " + persona.get(cod).getApellido());
                    for(Reserva report : persona.get(cod).getReserva().values()){
                        System.out.println("Boleto :" + i);
                        System.out.println("Codigo de Venta :" + report.getCodigoVenta());
                        System.out.println("Asiento :" + report.getAsiento()); 
                        int avi = report.getAsiento();
                        if(avi<=12){
                            System.out.println("Avion : 1");
                        }else if(avi >= 13 && avi <= 24){
                            System.out.println("Avion : 2");
                        }else if(avi>=25 && avi<=36){
                            System.out.println("Avion : 3");
                        }
                        i++;
                }
            }
          }else{
                System.out.println("La persona no esta registrada");
            }
        }
        
         public void despegarAvion(int avion){
              try{
              if(avi.containsKey(avion)){
                  if(avi.get(avion).reserva.isEmpty()){
                      System.out.println("El avion no tiene ninguna reserva, no puede despegar");
                  }else{
                      int codAvion;
                      System.out.println("Digite el numero del Avion");
                      codAvion = Integer.parseInt(datos.readLine());
                        if(codAvion==1){
                                for(Reserva report : avi.get(avion).getReserva().values()){  
                                     if(report.getCodigoVenta()== codAvion){
                                        for(int i = 1;i<=12;i++){
                                        persona.get(avion).getReserva().remove(i);
                                        
                               }                              
                             }
                           }
                         System.out.println("Avion Despego Satisfactoriamente");    
                        }else if(codAvion==2){
                            for(Reserva report : avi.get(avion).getReserva().values()){  
                                     if(report.getCodigoVenta()== codAvion){
                                        for(int i = 13;i<=24;i++){
                                        persona.get(avion).getReserva().remove(i);
                                        
                               }                              
                             }
                           }
                         System.out.println("Avion Despego Satisfactoriamente");  
                        }else if(codAvion==3){
                            for(Reserva report : avi.get(avion).getReserva().values()){  
                                     if(report.getCodigoVenta()== codAvion){
                                        for(int i = 25;i<=36;i++){
                                        persona.get(avion).getReserva().remove(i);                                      
                               }                              
                             }
                           }
                         System.out.println("Avion Despego Satisfactoriamente");  
                        }
                                              
                      }
              }             
          }catch(Exception ex){
                System.out.println(ex.getMessage());
                
          }             
       }
    }
         
