/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import java.util.Scanner;

/**
 *
 * @author Alejandro Arias
 */
public class Run {

    public static void main(String[] args) {
       

     Scanner sc = new Scanner(System.in);
    Lista_Enlazada lista = new Lista_Enlazada();

    System.out.print("Ingrese cantidad de elementos: ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
      System.out.print("Ingrese valor: ");
      int valor = sc.nextInt();
      lista.insertar(valor); 
    }

    System.out.print("Lista original: ");
    lista.imprimir();

    lista.removerDuplicados(); 

    System.out.print("Lista sin duplicados: ");
    lista.imprimir();

    sc.close();

  }

}

   
