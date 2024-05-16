
package Controlador;

import Modelo.ListaCircular;
import java.util.Scanner;

/**
 *
 * @author Alejandro Arias
 */
public class TaquilleriaCine {
    
    ListaCircular cartelera;
    Scanner scanner;

    public TaquilleriaCine() {
        cartelera = new ListaCircular();
        scanner = new Scanner(System.in);
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarPelicula();
                    break;
                case 2:
                    eliminarPelicula();
                    break;
                case 3:
                    cartelera.mostrarCartelera();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void mostrarMenu() {
        System.out.println("\nTaquillería de Cine");
        System.out.println("1. Agregar película");
        System.out.println("2. Eliminar película");
        System.out.println("3. Mostrar cartelera");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void agregarPelicula() {
        System.out.print("Ingrese el título de la película: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el número de asientos disponibles: ");
        int asientos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        cartelera.agregar(titulo, asientos);
        System.out.println("Película agregada a la cartelera.");
    }

    private void eliminarPelicula() {
        System.out.print("Ingrese el título de la película a eliminar: ");
        String titulo = scanner.nextLine();

        cartelera.eliminar(titulo);
    }
}

