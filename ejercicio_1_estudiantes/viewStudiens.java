
package view;

import java.util.Scanner;
import model.studiens;

/**
 *
 *@author Alejandro Arias
 */
public class viewStudiens {
    //Declaración de variables
    private Scanner scanner;
    //Metodo Constructor
    public viewStudiens() {
        //Inicializar Variables
        scanner = new Scanner(System.in);
    }
    //Metodos Propios
    public int mostrarMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Opcion para agregar estudiantes");
        System.out.println("2. Opcion para cambiar de estudiante");
        System.out.println("3. Opcion para quitar estudiantes");
        System.out.println("4. Opcion para ver los estudiantes registrados estudiantes");
        System.out.println("5. Salir del programa");
         System.out.println("------------------------------------------------------------");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public studiens obtenerDatosEstudiante() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Por favor dijite el nombre del estudiante: ");
        String nombrEstudiante = scanner.nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa la identificacion del estudiante: ");
        String id = scanner.nextLine();
        System.out.println("------------------------------------------------------------");
        return new studiens(nombrEstudiante, id);
    }

    public String obtenerIdEstudiante() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa el ID del estudiante que quieres cambiar o eliminar: ");
        System.out.println("------------------------------------------------------------");
        return scanner.nextLine();
        
    }

    public void mostrarEstudiantes(studiens[] estudiantes) {
        for (studiens estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", id: " + estudiante.getId());
            }
        }
    }
}
