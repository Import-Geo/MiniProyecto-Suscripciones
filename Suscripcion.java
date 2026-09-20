/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproyecto;

/**
 *
 * @author cgamb
 */
public class Suscripcion {
    
    private String servicio;
    private String tipoPlan;
    private String metodoPago;
    private String moneda;
    private Double costoMensual;
    
    public Suscripcion (String servicio, String tipoPlan,
                        String metodoPago, String moneda, 
                         Double costoMensual){
        this.servicio = servicio;
        this.tipoPlan = tipoPlan;
        this.metodoPago = metodoPago;
        this.moneda = moneda;
        //this.costoMensual = costoMensual;
        
        setCostoMensual(costoMensual);
    }
    
    public String getServicio(){
        return this.servicio;
    }
    public void setServicio(String servicio){
        this.servicio = servicio;
    }
    
    public String getTipoPlan(){
        return this.tipoPlan;
    }
    public void setTipoPlan(String tipoPlan){
        this.tipoPlan = tipoPlan;
    }
    
    public String getMetodoPago(){
        return this.metodoPago;
    }
    public void setMetodoPago(String metodoPago){
        this.metodoPago = metodoPago;
    }
    
    public String getMoneda(){
        return this.moneda;
    }
    public void setMoneda(String moneda){
        this.moneda = moneda;
    }
    
    public Double getCostoMensual(){
        return this.costoMensual;
    }
    
    //oara validar
    public void setCostoMensual(Double costoMensual){
        if (costoMensual >= 0){
            this.costoMensual = costoMensual;
        } else{
            // por si ingresa negativo y lo pasa a 0.0  
            this.costoMensual = 0.0;
            }
    }
    @Override
    public String toString(){
        return "Servicio: "+ servicio +
               " | Plan: " + tipoPlan +
               " | Pago: " + metodoPago +
               " | Costo: " + costoMensual + " " + moneda;
    }   
}
