/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nelem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AlejandroRB
 */
public class Main {
    
    public static void main(String args[]){
        //creamos la lista
        List<Integer> list=new ArrayList<>();
        int rand;
        //añadimos Nelementos aleatorios
        for (int i = 0; i < 10000; i++) {
            rand =(int) (Math.random()*10000);
            list.add(rand);
        }
        list.sort(Comparator.naturalOrder());
        
        //muesto la lista para pruebas
        for (int i = 0; i < 10000; i++) {
            System.out.println(list.get(i));
        }
        //numero que queremos buscar
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero a buscar: ");
        int nume=sc.nextInt();
        //busqueda lineal
        
        int count=0;
        while(list.get(count)<nume){
            count++;
        }
        if(nume==list.get(count)){
            System.out.println("Numero encontrado en la posición: "+count);
        }
        else{
            System.out.println("Numero no encontrado");
        }
    }
    
}
