package Modelo;

/**
 *
 * @author Alejandro Arias
 */
public class Nodo {

    String remitente;
    String asunto;
    String contenido;
    Nodo siguiente;

   public Nodo(String remitente, String asunto, String contenido) {
        this.remitente = remitente;
        this.asunto = asunto;
        this.contenido = contenido;
        siguiente = null;
    }
}

