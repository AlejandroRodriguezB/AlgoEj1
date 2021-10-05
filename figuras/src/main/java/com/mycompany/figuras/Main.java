/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

import java.util.Random;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Main {
    public static void main(String[] args) {
        final int MAX = 10000; // numero de figuras que se crearan (en teoria tendrian que ser 10k figuras pero lo he bajado para que vaya mas rapido )
        final int xyMax = 100; //le doy un maximo a los radios/base/altura... para que los resultados no sean muy dispares
        final int numFiguras = 4; //numero de figuras que tengo implementadas

        int rand = 0; //numero random para saber que tipo de figura toca crear 
        double xRand = 0;  //numero random de base/radio/lado
        double yRand = 0;  //numero random de altura
        ListaFiguras array = new ListaFiguras(MAX); //Creo una lista de figuras

        for (int i = 0; i < MAX; i++) {
            Random r = new Random();
            rand = r.nextInt(numFiguras); //genero figuras aleatorias
            xRand = r.nextInt(xyMax) + 1; //hago que la altura almenos tenga valor 1
            yRand = r.nextInt(xyMax) + 1;
            switch (rand) { //dependiendo de que numero aleatorio salga sara un tipo de figura
                case 0:
                    Triangulo figura = new Triangulo(xRand, yRand);
                    array.agrega(figura);
                    break;
                case 1:
                    Rectangulo figura2 = new Rectangulo(xRand, yRand);
                    array.agrega(figura2);
                    break;
                case 2:
                    Circulo figura3 = new Circulo(xRand);
                    array.agrega(figura3);
                    break;
                default:
                    Cuadrado figura4 = new Cuadrado(xRand);
                    array.agrega(figura4);
            }

        }
        array.ordena(); //ordena la lista y hago todo lo que pide el enunciado
        System.out.println("La lista de figuras ordenado por area: \n" + array);
        System.out.println("La suma de areas de todas las figuras es: " + array.sumArea(MAX) + " y de perimetros: " + array.sumPerime(MAX));
        System.out.println("");
        System.out.println("La suma de areas de triangulos es: " + array.sumAreaFig(MAX, new Triangulo(0,0)) + " y de perimetros: " + array.sumPerimeFig(MAX, new Triangulo(0,0)));// da igual el valor del triagulo que le pasemos solo nos interesa la clase
        System.out.println("La suma de areas de rectangulos es: " + array.sumAreaFig(MAX, new Rectangulo(0,0)) + " y de perimetros: " + array.sumPerimeFig(MAX, new Rectangulo(0,0)));
        System.out.println("La suma de areas de circulos es: " + array.sumAreaFig(MAX, new Circulo(0)) + " y de perimetros: " + array.sumPerimeFig(MAX, new Circulo(0)));
        System.out.println("La suma de areas de cuadrados es: " + array.sumAreaFig(MAX, new Cuadrado(0)) + " y  de perimetros: " + array.sumPerimeFig(MAX, new Cuadrado(0)));
        System.out.println("");  
        System.out.println("La area mas pequeÃ±a es: " + array.areaMin(MAX) + " y la mas grande es: " + array.areaMax(MAX));
        System.out.println("");
        System.out.println("De los triangulos la area mas pequeÃ±a es: " + array.areaMinFig(MAX, new Triangulo(0,0)) + " y la mas grande es: " + array.areaMaxFig(MAX, new Triangulo(0,0)));
        System.out.println("De los rectangulos la area mas pequeÃ±a es: " + array.areaMinFig(MAX, new Rectangulo(0,0)) + " y la mas grande es: " + array.areaMaxFig(MAX, new Rectangulo(0,0)));
        System.out.println("De los circulos la area mas pequeÃ±a es: " + array.areaMinFig(MAX, new Circulo(0)) + " y la mas grande es: " + array.areaMaxFig(MAX, new Circulo(0)));
        System.out.println("De los cuadrados la area mas pequeÃ±a es: " + array.areaMinFig(MAX, new Cuadrado(0)) + " y la mas grande es: " + array.areaMaxFig(MAX, new Cuadrado(0)));
    }
}
