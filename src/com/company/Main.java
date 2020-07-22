package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //practica 10
        String[] textos=new String[10];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el texto: ");
            textos[i] = leer.nextLine();

        }
        int minimo;
        String aux;
        for (int i = 0; i < textos.length - 1; i++) {
            minimo = i;
            for (int j = i + 1; j < textos.length; j++) {
                if (textos[j].length() < textos[minimo].length()) {
                    minimo = j;
                }else if (textos[j].length()==textos[minimo].length()){
                    if(numeroVocales(textos[j])>numeroVocales(textos[minimo])){
                        minimo=j;
                    }

                }
            }
            aux = textos[i];
            textos[i] = textos[minimo];
            textos[minimo] = aux;

        }
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);

        }
    }

    public static int numeroVocales(String palabra) {
        int vocales = 0;
        for (int x = 0; x < palabra.length(); x++) {
            char letraActual = palabra.charAt(x);
            if (esVocal(letraActual)) vocales++;
        }
        return vocales;
    }
    private static boolean esVocal(char letra) {
        return "aeiouáéíóú".contains(String.valueOf(letra).toLowerCase());
    }

}