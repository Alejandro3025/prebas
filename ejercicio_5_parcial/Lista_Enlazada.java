
package Main;

/**
 *
 * @author Alejandro Arias
 */
public class Lista_Enlazada {
    
     private Nodo cabeza;

  // Constructor
  Lista_Enlazada() {
    this.cabeza = null;
  }

  // Método para insertar al final
  public void insertar(int valor) {
    Nodo nuevo = new Nodo(valor);
    if(cabeza == null) {
      cabeza = nuevo;
      return;
    }
    Nodo actual = cabeza;
    while(actual.siguiente != null) {
      actual = actual.siguiente;
    }
    actual.siguiente = nuevo;
  }

  // Método para imprimir la lista
  public void imprimir() {
    Nodo actual = cabeza;
    while(actual != null) {
      System.out.print(actual.valor + " ");
      actual = actual.siguiente;
    }
    System.out.println();
  }

  // Método para eliminar duplicados
  public void removerDuplicados() {
    if(cabeza == null) return;

    Nodo actual = cabeza;
    while(actual != null) {
      Nodo siguiente = actual.siguiente;
      while(siguiente != null && siguiente.valor == actual.valor) {
        siguiente = siguiente.siguiente;
      }
      actual.siguiente = siguiente;
      actual = siguiente;
    }
  }

}

