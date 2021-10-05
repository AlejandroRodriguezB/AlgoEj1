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
public class Triangulo extends Figura {

    //atributos
    private double base;
    private double altura;

    /**
     * constructor
     * @param base tamaño de la base del triangulo
     * @param altura tamaño de la altura de triangulo
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    //herencias
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetre() {
        return base + base + base;
    }

    //to string
    @Override
    public String toString() {
        return "Triangulo de area: " + area() + " y perimetro " + perimetre();
    }
}
