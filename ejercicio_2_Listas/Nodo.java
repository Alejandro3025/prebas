/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Alejandro Arias
 */
public class Nodo {
 String tarea;
  boolean completado;
  Nodo siguiente;

  public Nodo(String tarea) {
    this.tarea = tarea;
    this.completado = false;
    this.siguiente = null;
  }

}

