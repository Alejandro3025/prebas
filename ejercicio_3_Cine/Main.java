/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ControladorCine;
import model.Pelicula;
import view.VistaCine;

/**
 *
 *Nombres :Jorge Alexander Castillo Niño
 */

//Metodo Main
public class Main {
    
    
    public static void main(String[] args) {
        VistaCine vista = new VistaCine();
        Pelicula pelicula = new Pelicula();
        ControladorCine controlador = new ControladorCine(vista, pelicula);

        vista.mostrarMensaje("=== Bienvenido al cine ===");
        vista.mostrarMensaje("Seleccione su modo:");
        vista.mostrarMensaje("1. Modo Usuario");
        vista.mostrarMensaje("2. Modo Administrador");
        int modo = vista.mostrarMenuUsuario();
        if (modo == 1) {
            controlador.iniciar();
        } else if (modo == 2) {
            controlador.iniciarModoAdministrador();
        } else {
            vista.mostrarMensaje("Modo inválido");
        }

        vista.cerrarScanner();
    }
}
