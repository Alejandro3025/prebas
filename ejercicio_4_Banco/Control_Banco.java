/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.Controller;

import com.mycompany.banco.Banco;
import com.mycompany.banco.Model.Modelo_Banco;
import com.mycompany.banco.Vista.Vista_Banco;

/**
 *
 * @author Alejandro Arias
 */
public class Control_Banco {
    private Vista_Banco vista;
    private Modelo_Banco Banco;
    
    public void iniciar () {
     int opcion = vista.mostrarmenuYObtenerOpcion();
        switch (opcion) {
            case 1:
                this.vista.obtenerDatosBanco();
                vista.mostrarmensaje("Nombre de cuenta añadido");
                break;
            case 2:
                vista.mostrarbanco(Banco);
                break;
            default:
                throw new AssertionError();
        }
    
}
    
}


