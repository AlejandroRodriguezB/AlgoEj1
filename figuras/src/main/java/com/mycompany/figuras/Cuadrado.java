/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Cuadrado extends Figura{
    //atributos
    private double lado;

    /**
     * constructor
     * @param lado longitud de los lados
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //herencias
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetre() {
        return 4 * lado;
    }
    //to string

    @Override
    public String toString() {
        return "Cuadrado de area: " + area() + " y perimetro " + perimetre();
    }
}
