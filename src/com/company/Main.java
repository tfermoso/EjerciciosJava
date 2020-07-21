package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static String aux;

    public static void main(String[] args) {
        String[]textos=new String[10];
        Scanner leer= new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Introduce texto: ");
            textos[i]=leer.nextLine();
        }
        int minimo;
        for (int i = 0; i <textos.length ; i++) {
            minimo=i;
            for (int j = 0; j <textos.length ; j++) {
                if (textos[i].length()<textos[minimo].length()){
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

    }



