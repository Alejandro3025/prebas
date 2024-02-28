/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package listas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Arias
 */
public class Run {

  public static void main(String[] args) {
    
    ListaTareas lista = new ListaTareas();
    Scanner sc = new Scanner(System.in);

    int opcion = 0;

    while(opcion != 6) {

      System.out.println("\nGESTIÓN DE TAREAS");
      System.out.println("1. Agregar Tarea");
      System.out.println("2. Completar Tarea");
      System.out.println("3. Listar Tareas");
      System.out.println("4. Eliminar Tarea");
      System.out.println("5. Contar Tareas Pendientes");
      System.out.println("6. Salir");

      System.out.print("Ingresa una opción: ");
      opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                {
                    System.out.print("Ingresa nombre de la tarea: ");
                    String tarea = sc.next();
                    lista.agregarTarea(tarea);
                    break;
                }
            case 2:
                {
                    System.out.print("Ingresa nombre de la tarea a completar: ");
                    String tarea = sc.next();
                    lista.completarTarea(tarea);
                    break;
                }
            case 3:
                lista.listarTareas();
                break;
            case 4:
                {
                    System.out.print("Ingresa nombre de la tarea a eliminar: ");
                    String tarea = sc.next();
                    lista.eliminarTarea(tarea);
                    break;
                }
            case 5:
                System.out.println("Tareas pendientes: " + lista.contarTareasPendientes());
                break;
            default:
                break;
        }

    }

    System.out.println("Programa finalizado");
    sc.close();

  }

}