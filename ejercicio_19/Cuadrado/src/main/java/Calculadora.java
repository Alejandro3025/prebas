//CALCULADORA CON LAS FUNCIONES BASICAS UTILIZANDO GET Y SET

import java.util.Scanner;

public class Calculadora {
// VARIABLES PRIVADAS CON TIPO DE VARIABLES DOUBLE EL CUAL AYUDA PARA TENER MAYOR EXACTITUD
    private double num1;
    private double num2;

    public void setNumero1(double num1) {
        this.num1 = num1;
    }

    public void setNumero2(double num2) {
        this.num2 = num2;
    }

    public double getNumero1() {
        return num1;
    }

    public double getNumero2() {
        return num2;
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
    return Double.NaN; // esta funcion NAN se define para expresar un resultado imposible como lo es la division entre 0
   }
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        calculadora.setNumero1(numero1);

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        calculadora.setNumero2(numero2);

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = calculadora.sumar();
                break;
            case 2:
                resultado = calculadora.restar();
                break;
            case 3:
                resultado = calculadora.multiplicar();
                break;
            case 4:
                resultado = calculadora.dividir();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
