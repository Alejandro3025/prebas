/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

/**
 *
 * @author Alejandro Arias
 */
public class Set {
    
    

    private String equipo;
    private int marcadorVisitante;
    private int marcadorLocal;
    private String ciudad;
    private int partidosJugados;

    public Set(String equipo, int marcadorVisitante, int marcadorLocal, String ciudad, int partidosJugados) {
        this.equipo = equipo;
        this.marcadorVisitante = marcadorVisitante;
        this.marcadorLocal = marcadorLocal;
        this.ciudad = ciudad;
        this.partidosJugados = partidosJugados;
    }

    // Otros métodos y getters/setters

    @Override
    public String toString() {
        return "Equipo: " + equipo + ", MarcadorVisitante: " + marcadorVisitante
                + ", MarcadorLocal: " + marcadorLocal + ", Ciudad: " + ciudad
                + ", PartidosJugados: " + partidosJugados;

    }
    }


