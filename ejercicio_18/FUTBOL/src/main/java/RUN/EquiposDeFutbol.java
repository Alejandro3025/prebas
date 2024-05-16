/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RUN;

import CONTROLLER.Set;

/**
 *
 * @author Alejandro Arias
 */
public class EquiposDeFutbol {
    

    public static void main(String[] args) {
      
        // Crear objetos Set para los equipos
        Set brasil = new Set("Brasil", 2, 1, "Río de Janeiro", 5);
        Set argentina = new Set("Argentina", 1, 1, "Buenos Aires", 4);
        Set colombia = new Set("Colombia", 3, 2, "Bogotá", 6);
        brasil ("alejandro");
        
        // Imprimir los datos de los equipos utilizando el método toString()
        System.out.println(brasil.toString());
        System.out.println(argentina.toString());
        System.out.println(colombia.toString());
}

    private static void brasil(String alejandro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


