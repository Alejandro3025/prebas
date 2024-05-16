
package controller;

import model.studiens;
import view.viewStudiens;

/**
 *
 * @author Alejandro Arias
 */
public class ControllerStudens {
    private studiens[] estudiantes;
    private viewStudiens vista;
    private int numEstudiantes;

    public ControllerStudens(int numEstudiantes, viewStudiens vista) {



        this.numEstudiantes = numEstudiantes;
        this.estudiantes = new studiens[numEstudiantes];
        this.vista = vista;
    }

    public void ejecutar() {
        boolean running = true;
        while (running) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    actualizarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    vista.mostrarEstudiantes(estudiantes);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    private void agregarEstudiante() {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = vista.obtenerDatosEstudiante();
                break;
            }
        }
    }


    private void actualizarEstudiante() {
        String id = vista.obtenerIdEstudiante();
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId().equals(id)) {
                estudiantes[i] = vista.obtenerDatosEstudiante();
                break;
            }
        }
    }

    private void eliminarEstudiante() {
        String id = vista.obtenerIdEstudiante();
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId().equals(id)) {
                estudiantes[i] = null;
                break;
            }
        }
    }
    
    
}
