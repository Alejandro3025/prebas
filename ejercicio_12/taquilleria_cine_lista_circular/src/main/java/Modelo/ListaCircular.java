
package Modelo;

/**
 *
 * @author Alejandro Arias
 */
public class ListaCircular {
   
    Nodo cabeza;
    int tamano;

    public ListaCircular() {
        cabeza = null;
        tamano = 0;
    }

    public void agregar(String pelicula, int asientos) {
        Nodo nuevoNodo = new Nodo(pelicula, asientos);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
        tamano++;
    }

    public void eliminar(String pelicula) {
        if (cabeza == null) {
            System.out.println("La cartelera está vacía.");
            return;
        }

        if (cabeza.pelicula.equals(pelicula)) {
            if (cabeza.siguiente == cabeza) {
                cabeza = null;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != cabeza) {
                    actual = actual.siguiente;
                }
                cabeza = cabeza.siguiente;
                actual.siguiente = cabeza;
            }
            tamano--;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != cabeza) {
            if (actual.siguiente.pelicula.equals(pelicula)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamano--;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("La película no se encuentra en la cartelera.");
    }

    public void mostrarCartelera() {
        if (cabeza == null) {
            System.out.println("La cartelera está vacía.");
            return;
        }

        System.out.println("Cartelera:");
        Nodo actual = cabeza;
        do {
            System.out.println("- " + actual.pelicula + " (" + actual.asientos + " asientos disponibles)");
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
 

