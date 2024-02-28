/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pelicula;
import view.VistaCine;

/**
 *
 *Nombres :Jorge Alexander Castillo Niño
 * 
 * 
 */
public class ControladorCine {
    
    //Declaracion de variables
    
    private VistaCine vista;
    private Pelicula pelicula;

    public ControladorCine(VistaCine vista, Pelicula pelicula) {
        
        //Inciializar variables
        this.vista = vista;
        this.pelicula = pelicula;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenuUsuario();
            switch (opcion) {
                case 1:
                    // Lógica para mostrar la lista de películas
                    vista.mostrarMensaje("Mostrando lista de películas...");
                    break;
                case 2:
                    // Lógica para seleccionar película
                    String titulo = vista.solicitarTituloPelicula();
                    String genero = vista.solicitarGeneroPelicula();
                    pelicula.setTitulo(titulo);
                    pelicula.setGenero(genero);
                    vista.mostrarMensaje("Película seleccionada: " + pelicula.getTitulo() + " - Género: " + pelicula.getGenero());
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }

    public void iniciarModoAdministrador() {
        int opcion;
        do {
            opcion = vista.mostrarMenuAdministrador();
            switch (opcion) {
                case 1:
                    // Lógica para agregar película
                    String titulo = vista.solicitarTituloPelicula();
                    String genero = vista.solicitarGeneroPelicula();
                    pelicula.setTitulo(titulo);
                    pelicula.setGenero(genero);
                    vista.mostrarMensaje("Película agregada: " + pelicula.getTitulo() + " - Género: " + pelicula.getGenero());
                    break;
                case 2:
                    // Lógica para eliminar película
                    vista.mostrarMensaje("Funcionalidad no implementada");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }
}
