package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Realizar un algoritmo para un programa que se encargue de leer 10 textos y,
        // posteriormente, nos muestre los textos ordenados de menor a mayor número de caracteres.
        // En caso de que dos textos tengan el mismo número de caracteres, se pondrá primero el que tenga
        // mayor número de vocales. Para este algoritmo podemos utilizar las funciones Longitud y ObtenerLetra.
        Scanner leer=new Scanner(System.in);
        String[] textos=new String [10];
        for (int i = 0; i <10 ; i++) {
            System.out.println("Mete texto");
            textos[i]=leer.nextLine();
        }
        int minimo;
        String aux;
        for (int i = 0; i <textos.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j <textos.length ; j++) {
                if (textos[j].length()<textos[minimo].length()){
                    minimo=j;
                }else if(contarVocales(textos[j])<contarVocales(textos[minimo])){
                    minimo=j;
                }
            }
        aux=textos[i];
            textos[i]=textos[minimo];
            textos[minimo]=aux;
        }
        for (int i = 0; i <textos.length ; i++) {
            System.out.println(textos[i]);
        }
    }
    public static int contarVocales(String txt){
        int contar=0;
        String vocales="aáAÁeéEÉiíIÍoóOÓuúüUÚÜ";
        for (int i = 0; i <txt.length() ; i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (txt.charAt(i)==vocales.charAt(j)){
                    contar++;
                }
            }
        }return contar;
    }
}