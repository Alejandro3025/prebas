/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.Model;

/**
 *
 * @author Alejandro Arias
 */
public class Modelo_Banco {
    
    private String nombre_Cuenta;
    private String nombre_Banco;
    private int cantidad_depositar;
    private int cantidad_retirar;
    
     public Modelo_Banco(String nombre,String nombre_Banco,int cantidad_depositar){
         
         this.nombre_Cuenta=nombre;
          this.nombre_Banco=nombre_Banco;
          this.cantidad_depositar=cantidad_depositar;
          this.cantidad_retirar=cantidad_retirar;
          } 

    public Modelo_Banco(String nombre_Banco, String nombre_Cuenta, String cantidad_depositar, String cantidad_retirar) {
        
    }

    public String getNombre_Cuenta() {
        return nombre_Cuenta;
    }

    public void setNombre_Cuenta(String nombre_Cuenta) {
        this.nombre_Cuenta = nombre_Cuenta;
    }

    public int getCantidad_retirar() {
        return cantidad_retirar;
    }

    public void setCantidad_retirar(int cantidad_retirar) {
        this.cantidad_retirar = cantidad_retirar;
    }

    public String getNombre() {
        return nombre_Cuenta;
    }

    public String getNombre_Banco() {
        return nombre_Banco;
    }

    public int getCantidad_depositar() {
        return cantidad_depositar;
    }

    public void setNombre(String nombre) {
        this.nombre_Cuenta = nombre;
    }

    public void setNombre_Banco(String nombre_Banco) {
        this.nombre_Banco = nombre_Banco;
    }

    public void setCantidad_depositar(int cantidad_depositar) {
        this.cantidad_depositar = cantidad_depositar;
    }
     
     
}

