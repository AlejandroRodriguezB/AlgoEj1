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
public class Rectangulo extends Figura{
    //atributos
    private double base;
    private double altura;

    /**
     * constructor
     * @param base tamaño de la base del rectangulo
     * @param altura tamaño de la altura de el rectangulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //herencias
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetre() {
        return 2 * (base + altura);
    }

    //to string
    @Override
    public String toString() {
        return "Rectangulo de area: " + area() + " y perimetro " + perimetre();
    }
}
