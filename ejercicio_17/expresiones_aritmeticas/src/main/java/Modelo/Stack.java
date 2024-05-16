/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alejandro Arias
 */
public class Stack {
    
   private Node[] stack;
    private int top;

    Stack() {
        this.stack = new Node[100];
        this.top = -1;
    }

    void push(Node node) {
        stack[++top] = node;
    }

    Node pop() {
        if (top == -1)
            return null;
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}


