/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.model;

/**
 *
 * @author Alejandro Arias
 */
public class Controller {
 
private model model;

   public Controller() {
        this.model = new model();
    }

   public int evaluateExpression(String expression) {
        return model.evaluateRPN(expression);
    }
}
