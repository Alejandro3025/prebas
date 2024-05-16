/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alejandro Arias
 */
public class Nodo {
    
    String pelicula;
    int asientos;
    Nodo siguiente;

    public Nodo(String pelicula, int asientos) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.siguiente = null;
    }
}


