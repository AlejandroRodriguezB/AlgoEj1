/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

import java.text.DecimalFormat;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Circulo extends Figura{
    //atributos
    private double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //herencias
    @Override
    public double perimetre() {
        return Math.PI * radio * 2;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    //to string
    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#.00"); //reduzco SOLO visualmente el numero de decimales a la hora de hacer toString para que se vea mas bonito
        return "Circulo de area " + formato.format(area()) + " y perimetro " + formato.format(perimetre());
    }
}
