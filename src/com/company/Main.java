package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] textos=new String[10];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce texto: ");
            textos[i]=leer.nextLine();

        }
        int minimo;
        String aux;
        for (int i = 0; i < textos.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j < textos.length; j++) {
                if (textos[j].length()<textos[minimo].length()){
                    minimo=j;
                }

            }
            aux=textos[i];
            textos[i]=textos[minimo];
            textos[minimo]=aux;
        }
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);

        }

    }
}




