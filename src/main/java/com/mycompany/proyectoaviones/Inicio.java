/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoaviones;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Date;  
/**
 *
 * @author Edward Ramos
 */
public class Inicio {
    
       public BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
       public HashMap<Integer, Avion>avi;
       private HashMap<Integer, Persona>persona;
      
       public Inicio(){
           avi = new HashMap();
           persona = new HashMap();   
       }
       
       /**
        * Metodo MenuInicio es donde inica la aplicacion
        */
       
       
       public void menuInicio(){
           try{
              String opc="";
               do{
           System.out.println("******Aeropuerto*********");
           System.out.println("1. Insertar Cliente");
           System.out.println("2. Reservar");
           System.out.println("3. Buscar Cliente");
           System.out.println("4. Ver Vendidos");
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
               System.out.println("Fecha Nacimiento (dia/mes/año)");
               String fechanac = datos.readLine();
               String message = agregaCliente(codigoCliente,nombre,apellido,fechanac);
               System.out.println(message);
           }else if (opc.equals("2")){
               pintarAvion();               
               int codigoCliente;
               codigoCliente = Integer.parseInt(datos.readLine());
               agregarReserva(codigoCliente);
               
           }else if(opc.equals("3")){
               System.out.println("*********Buscar Cliente*******");
               int codigoCliente;
               System.out.println("Digite Codigo del cliente");
               codigoCliente = Integer.parseInt(datos.readLine());
               verReserva(codigoCliente);             
           }else if(opc.equals("4")){             
               System.out.println("Digite Avion que Desea ver Boletos Vendidos");
               int opcavi = Integer.parseInt(datos.readLine());
                 if(opcavi >=4){
                   System.out.println("Avion NO Valido");
                 }else{
                     despegarAvion(opcavi);
                 }
              
           }
               }while(!(opc.equals("6")));
               
           }catch(Exception Ex){
               System.out.println(Ex.getMessage());
               System.out.println("Error en Menu");
           }
           
           
       }
   /**
    * Metodo insertar avion el cual inserta en el mapa Avion (avi)
    */
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
     /**
      * Metodo insertarClienteQ insertar a usuarios desde el inicio de la aplicacion
      */
       public void insertarClienteQ(){
           persona.put(1,new Persona(1,"Edward","Ramos","10/07/1992"));
           persona.put(2,new Persona(2,"Arturo","Baez","18/07/2002"));
           persona.put(3,new Persona(3,"Juan","Perez","19/07/2010"));

       }
       /**
        * Metodo agregarReserva el cual agrega una reserva al cliente
        * @param cod esta variable es el codigo del pasajero
        */
        public void agregarReserva(int cod){
           try{ 
                     int puestoAvi=0;
                     int codper =0;
                     int key=0;
               if(persona.containsKey(cod)){
                     System.out.println("Avion:");
                     int avion = Integer.parseInt(datos.readLine());
                     System.out.println("Asiento:");
                     int asiento = Integer.parseInt(datos.readLine());
                     if(asiento>=12||avion>=4){
                         System.out.println("Error al analizar los datos");
                     }else{
                         for (HashMap.Entry<Integer,Persona> entry : persona.entrySet()){        
                         codper = entry.getValue().identificacion;
                         key = persona.get(codper).getReserva().size()+key; 
                         }
                         key = key +1; 
                         
                         for (HashMap.Entry<Integer,Avion> entry : avi.entrySet()){        
                            if(entry.getValue().codAvion== avion  && entry.getValue().puesto== asiento){
                               puestoAvi= entry.getValue().llave;
                            }  
                         }
                      persona.get(cod).getReserva().put(key, new Reserva(key,puestoAvi)); 
                     }                
                     }else{
                     System.out.println("El usuario no existe");
                     }
           }catch(Exception Ex){
               System.out.println(Ex.getMessage());
           }
        }
       /**
        * Metodo agregaCliente es el que agrega un cliente al mapa Persona
        * @param cod llave del cliente
        * @param nom nombre del cliente (String)
        * @param ape apellido del cliente (String)
        * @param fech fecha de nacimiento del cliente (String)
        * @return 
        */
    public String agregaCliente(int cod, String nom, String ape,String fech){
          Persona per = new Persona(cod,nom,ape,fech);
          String Message = "";
          if(persona.containsKey(cod)){
              Message = "El cliente ya esta en la Base de Datos";
          }else{
              persona.put(cod, per);
              Message = "Cliente Insertado";
          }
          return Message;
      }
        
         public void verReserva (int cod){
            int avip=0;
            Date fechaNac;
            int edad;
            
             if(persona.containsKey(cod)){
                if(persona.get(cod).reserva.isEmpty()){
                    System.out.println("La persona no tiene Reservas");
                }else {
                int i = 1;
                fechaNac = persona.get(cod).fechaNac;
                Calendar fechaNac_ = Calendar.getInstance();
                fechaNac_.setTime(fechaNac);
                try {
                    edad = Math.abs(Calendar.getInstance().get(Calendar.YEAR) - fechaNac_.get(Calendar.YEAR));
                } catch (ArithmeticException e) {
                    edad = -1;
                }
                System.out.println("Reporte de la Persona:  " + persona.get(cod).getNombre()+ " " + persona.get(cod).getApellido()+" - Edad: " + edad);               
                int rep =  persona.get(cod).reserva.size();
                for(Reserva report : persona.get(cod).getReserva().values()){
                        System.out.println("Boleto :" + i);
                        System.out.println("___________________________");
                        System.out.println("Codigo de Venta :" + report.getCodigoVenta());
                        avip = report.getAsiento();
                        if(avip<=12){
                            System.out.println("Avion : 1");
                        }else if(avip >= 13 && avip <= 24){
                            System.out.println("Avion : 2");
                        }else if(avip>=25 && avip<=36){
                            System.out.println("Avion : 3");
                        }
                        
                        for (HashMap.Entry<Integer,Avion> entry : avi.entrySet()) {
                            if(entry.getValue().llave ==  avip ){
                                System.out.println("Asiento :" + entry.getValue().puesto);
                                System.out.println("Precio :" + entry.getValue().precio);
                            }
                        }
                        i++;
                    }
          }
        }else{
                System.out.println("La persona no esta registrada");
            }
         }
        /**
         * Metodo el cual despega el avion y arroja el total de los pasajes del avion
         * @param avion esta variable es el avion que queremos despegar (1-2-3)
         */
         public void despegarAvion(int avion){                
                     int avip=0;
                     int codper =0;
                     int key=0;
                     int totalVendido = 0;
                     for (HashMap.Entry<Integer,Persona> entry : persona.entrySet()){        
                         codper = entry.getValue().identificacion;
                         for(Reserva report : persona.get(codper).getReserva().values()){
                             avip = report.getAsiento();
                             for (HashMap.Entry<Integer,Avion> entryav : avi.entrySet()) {
                                if(entryav.getValue().llave ==  avip ){
                                    if(entryav.getValue().codAvion == avion)
                                    {
                                        System.out.println("Avion :" + entryav.getValue().codAvion);
                                        System.out.println("Asiento :" + entryav.getValue().puesto);
                                        System.out.println("Precio :" + entryav.getValue().precio);
                                        totalVendido = entryav.getValue().precio + totalVendido;
                                 //       persona.get(codper).getReserva().remove(report.getCodigoVenta());
                                    }    
                                }
                            }
                         }

                         }
                     System.out.println("Total de vendido : " + totalVendido);
                
             }
                     
     /**
      * Metodo pintarAvion el cual pinta los 3 aviones y sus asientos Vacios(X) o ocupados (O)
      * 
      */     
         public void pintarAvion(){
                     int avip=0;
                     int codper =0;
                     String[] A = new String [37];
                     for(int i=0; i<=36; i++){
                         A[i] = "X";
                     }                  
                     for (HashMap.Entry<Integer,Persona> entry : persona.entrySet()){        
                         codper = entry.getValue().identificacion;
                         for(Reserva report : persona.get(codper).getReserva().values()){
                             avip = report.getAsiento();                            
                             for (HashMap.Entry<Integer,Avion> entryav : avi.entrySet()) {
                                if(entryav.getValue().llave ==  avip ){
                                    A[avip] = "O";                                
                                }
                              }
                            }  
                      }
               System.out.println("********RESERVAR***********"); 
               System.out.println("");               
               System.out.println("*********************************");
               System.out.println("*********Avion Numero 1 MIXTO **********");
               System.out.println("VIP = 50.000 - COMERCIAL = 20.000");
               System.out.println("");
               System.out.println("1 - 3" + " " + A[1] + " " + A[2] + " " + A[3] + " Clase VIP");
               System.out.println("4 - 6" + " " + A[4] + " " + A[5] + " " + A[6] + " Clase VIP");
               System.out.println("7 - 9" + " " + A[7] + " " + A[8] + " " + A[9] + " Clase COMERCIAL");
               System.out.println("10-12" + " " + A[10] + " " + A[11] + " " + A[12] + " Clase COMERCIAL");
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("*********Avion Numero 2 EJECUTIVO **********");
               System.out.println("EJECUTIVO = 30.000");
               System.out.println("");
               System.out.println("1 - 3" + " " + A[13] + " " + A[14] + " " + A[15]);
               System.out.println("4 - 6" + " " + A[16] + " " + A[17] + " " + A[18]);
               System.out.println("7 - 9" + " " + A[19] + " " + A[20] + " " + A[21]);
               System.out.println("10-12" + " " + A[22] + " " + A[23] + " " + A[24]);               
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("*********Avion Numero 3 NORMAL **********");
               System.out.println("NORMAL = 15.000");
               System.out.println("");
               System.out.println("1 - 3" + " " + A[25] + " " + A[26] + " " + A[27]);
               System.out.println("4 - 6" + " " + A[28] + " " + A[29] + " " + A[30]);
               System.out.println("7 - 9" + " " + A[31] + " " + A[32] + " " + A[33]);
               System.out.println("10-12" + " " + A[34] + " " + A[35] + " " + A[36]);
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("Digite codigo cliente");
           
         } 

   }
   