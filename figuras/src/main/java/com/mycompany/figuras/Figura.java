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
public abstract class Figura implements Comparable<Figura> {
    @Override   //permite comparar las figuras
    public int compareTo(Figura t) {
        return (int) (this.area() - t.area());
    }

    /**
     * metodo de area abstracto para su implenentación en sus hijos
     * @return tamaño del area de la figura
     */
    public abstract double area();

    /**
     *  metodo de perimetro abstracto para su implenentación en sus hijos
     * @return tamaño del perimetro de la figura
     */
    public abstract double perimetre();
}
