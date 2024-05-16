
package model;

/**
 *
 * @author Alejandro Arias
 */
public class studiens {
    //Declaración de variables
    private String nombre;
    private String id;
    //Metodo Constructor
    public studiens(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters y setters
    
    //Metodo para obtener nombre del estudiante
    public String getNombre() {
        return nombre;
    }
    //Metodo para registrar nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo para obtener la id del estudiante
    public String getId() {
        return id;
    }
    //Metodo para registrar la id del estudiante
    public void setId(String id) {
        this.id = id;
    }
}

