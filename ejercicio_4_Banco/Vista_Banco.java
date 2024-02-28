
package com.mycompany.banco.Vista;

import com.mycompany.banco.Model.Modelo_Banco;
import java.util.Scanner;
      
/**
 *
 * @author Alejandro Arias
 */
public class Vista_Banco {
    private Scanner leer;
    
    public Vista_Banco() {
    
        this.leer=new Scanner (System.in);
}
    public int mostrarMenuYObteneropcion(){
        System.out.println("----------SELECCIONE UN NUMERO SEGUN CORRESPONDA----------");
        System.out.println("1. Nombre de cuenta");
        System.out.println("2. Nombre del banco");
        System.out.println("3.depositar");
        System.out.println("4. Retirar");
        System.out.println("----------------------------------------------------------");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
        
    }
    public Modelo_Banco obtenerDatosBanco (){
        System.out.println("Ingrese el nombre de su cuenta");
        String nombre_Cuenta = leer.nextLine();
        System.out.println("Ingrese el nombre de su banco");
        String nombre_Banco = leer.nextLine();
        System.out.println("Ingrese el valor a Depositar");
        String cantidad_depositar = leer.nextLine();
        System.out.println("Ingrese el valor a retirar");
        String cantidad_retirar = leer.nextLine();
        
        return new Modelo_Banco (nombre_Banco,nombre_Cuenta,cantidad_depositar,cantidad_retirar);
    }
    public void mostrarbanco (Modelo_Banco Modelo_Banco){
        if(Modelo_Banco == null){
            System.out.println("No hay ninguna cuenta guardada");
        
        }else{
            System.out.println("INFORMACION DE LA CUENTA");
            System.out.println("Nombre de la cuenta" + Modelo_Banco.getNombre_Cuenta());
            System.out.println("Nombre del banco" + Modelo_Banco.getNombre_Banco());
            System.out.println("Valor depositado" + Modelo_Banco.getCantidad_depositar());
            System.out.println("Valor retirado" + Modelo_Banco.getCantidad_retirar());
        }
            
    }
    public void mostrarmensaje (String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarmenuYObtenerOpcion() {
     
}

}