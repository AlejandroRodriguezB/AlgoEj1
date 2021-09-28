/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pila;

/**
 *
 * @author alumno
 */
public class Stack {

    class Node {
        int data;
        Node sig;
    }

    private Node raiz;

    public Stack() {
        raiz = null;
    }

    public void push(int x) {
        Node a;
        a = new Node();
        a.data = x;
        if (raiz == null) {
            a.sig = null;
            raiz = a;
        } else {
            a.sig = raiz;
            raiz = a;
        }
    }

    public int pop() {
        if (raiz != null) {
            int data = raiz.data;
            raiz = raiz.sig;
            return data;
        } else {
            
            return Integer.MAX_VALUE;
        }
    }

    public void print() {
        Node reco = raiz;
        System.out.println("Lista la pila");
        while (reco != null) {
            System.out.print(reco.data + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
}
