/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

import java.util.Arrays;

/**
 *
 * @author AlejandroRodriguezB
 */
public class ListaFiguras {
    
    //atributos
    private Figura[] array;
    private int contador = 0;

    /**
     *  constructor
     * @param MAX maximo de figuras
     */
    public ListaFiguras(int MAX) {
        array = new Figura[MAX];
    }

    //metodos

    /**
     * agrega una figura a la array
     * @param n una de las figuras posibles
     */
    public void agrega(Figura n) {
        array[contador] = n;
        contador++;
    }

    /**
     * ordena la array
     */
    public void ordena() {
        Arrays.sort(this.getArray()); //este metodo no funcionaria si Figura no implementase Comparable
    }

    /**
     *  getter de la lista
     * @return 
     */
    public Figura[] getArray() {
        return array;
    }

    /**
     * metodo de suma de todas las areas
     * @param MAX numero de figuras
     * @return suma total de las areas
     */
    public double sumArea(int MAX) {
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            i = i + array[a].area();
        }
        return i;
    }

    /**
     * metodo de suma de todos los perimetros
     * @param MAX
     * @return
     */
    public double sumPerime(int MAX) { //
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            i = i + array[a].perimetre();
        }
        return i;
    }

    /**
     * metodo de suma de las areas del tipo de figura que le pasemos
     * @param MAX numero de figuras
     * @param fig tipo de figura
     * @return suma de todas las areas de dicha figura
     */
    public double sumAreaFig(int MAX, Figura fig) { 
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass())) { //si las clases son iguales suma la area
                i = i + array[a].area();
            }
        }
        return i;
    }

    /**
     * metodo de suma de los perimetros del tipo de figura que le pasemos
     * @param MAX numero de figuras
     * @param fig tipo de figura
     * @return suma de todas los perimetros de dicha figura
     */
    public double sumPerimeFig(int MAX, Figura fig) {
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass())) { //si las clases son iguales suma el perimetro
                i = i + array[a].perimetre();
            }
        }
        return i;
    }

    /**
     *  metodo para el minimo de todas las areas
     * @param MAX numero de figuras
     * @return area minima
     */
    public double areaMin(int MAX) {
        double i = array[0].area();
        for (int a = 0; a < MAX; a++) {
            if (i > array[a].area()) {  //si existe un valor menor lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    /**
     * metodo para el maximo de todas las areas
     * @param MAX numero de figuras
     * @return area maxima
     */
    public double areaMax(int MAX) {
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (i < array[a].area()) { //si existe un valor mayor lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    /**
     * metodo para el minimo de las areas del tipo figura que le pasemos
     * @param MAX numero de figuras
     * @param fig tipo de figura
     * @return area minima por tipo de figura
     */
    public double areaMinFig(int MAX, Figura fig) {
        double i = Double.MAX_VALUE; //le doy el maximo valor para que cualquier figura lo sobrepase(estaría mal si no hubiese figuras del tipo que le pasemos pero con 10k figuras no puede pasar)
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass()) && i > array[a].area()) {  //si existe un valor menor y tienen la misma clase lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    /**
     *  metodo para el maximo de las areas del tipo figura que le pasemos
     * @param MAX numero de figuras
     * @param fig tipo de figura
     * @return area maxima por tipo de figura
     */
    public double areaMaxFig(int MAX, Figura fig) { 
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass()) && i < array[a].area()) { //si existe un valor mayor y tienen la misma clase lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    //to string de la lista
    @Override
    public String toString() {
        String blank = "";
        for (int i = 0; i < array.length; i++) {
            blank += array[i] + "\n";
        }
        return blank;
    }
}
