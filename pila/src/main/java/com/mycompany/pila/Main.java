/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pila;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Main {
    
    public static void main(String[] args) {
        Stack pila1=new Stack();
        Random rand = new Random();
        pila1.push(rand.nextInt());
        pila1.push(rand.nextInt());
        pila1.push(rand.nextInt());
        pila1.print();
        System.out.println("Extraemos de la pila:"+pila1.pop());
        pila1.print();  
    }
    
}
