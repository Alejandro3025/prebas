/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Controlador.Controller;
import vista.Vista;
import java.util.Scanner;

/**
 *
 * @author Alejandro Arias
 */


public class Main {
    public static void main(String[] args) {
        String expression = "3 4 -";
        Controller controller = new Controller();
        int result = controller.evaluateExpression(expression);
        Vista vista = new Vista();
        vista.displayResult(result);
    }
}
