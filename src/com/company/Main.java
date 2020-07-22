package com.company;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;

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
        String aux;
        for (int i = 0; i <textos.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j <textos.length ; j++) {
                if (textos[j].length()<textos[minimo].length()){
                    minimo=j;
                }else if(textos[j].length()== textos[minimo].length()){
                    if (numerovocales (textos[j])> numerovocales(textos[minimo])){
                        minimo=j;

                    }
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
    public static int numerovocales(String palabra){
        int vocales = 0;
        for(int x=0; x<palabra.length();x++) {
            char letraActual = palabra.charAt(x);
            if (esVocal(letraActual)) vocales++;

            }
        return vocales;
        }
        private  static boolean esVocal(char letra){
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }


    }



