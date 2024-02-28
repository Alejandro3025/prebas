/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Alejandro Arias
 */
public class ListaTareas {
    private Nodo cabeza;

  public void agregarTarea(String tarea) {
    Nodo nuevo = new Nodo(tarea);
    if(cabeza == null) {
      cabeza = nuevo;
    } else {
      Nodo actual = cabeza;
      while(actual.siguiente != null) {
        actual = actual.siguiente;
      }
      actual.siguiente = nuevo; 
    }
  }
  
  public void completarTarea(String tarea) {
    Nodo actual = cabeza;
    while(actual != null) {
      if(actual.tarea.equalsIgnoreCase(tarea)) {
        actual.completado = true;
        break;
      }
      actual = actual.siguiente;
    }
  }
  
  public void listarTareas() {
    Nodo actual = cabeza;
    while(actual != null) {
      System.out.print(actual.tarea);
      if(actual.completado) {
        System.out.print(" (Completada)");
      } else {
        System.out.print(" (Pendiente)");  
      }
      System.out.println();
      actual = actual.siguiente;
    }
  }
  
  public void eliminarTarea(String tarea) {
    Nodo actual = cabeza;
    Nodo anterior = null;
    while(actual != null) {
      if(actual.tarea.equalsIgnoreCase(tarea)) {
        if(actual == cabeza) {
          cabeza = cabeza.siguiente;
        } else {
          anterior.siguiente = actual.siguiente;
        }
        break;
      }
      anterior = actual;
      actual = actual.siguiente;
    }
  }

  public int contarTareasPendientes() {
    int contador = 0;
    Nodo actual = cabeza;
    while(actual != null) {
      if(!actual.completado) {
        contador++;
      }
      actual = actual.siguiente;
    }
    return contador;
  }

}
