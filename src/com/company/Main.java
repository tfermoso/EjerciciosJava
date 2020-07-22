package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {



       /* String[] textos = new String[10];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce texto: ");
            textos[i] = leer.nextLine();

        }
        int minimo;
        String aux;
        for (int i = 0; i < textos.length - 1; i++) {
            minimo = i;
            for (int j = i + 1; j < textos.length; j++) {
                if (textos[j].length() < textos[minimo].length()) {
                    minimo = j;
                } else if (textos[j].length() == textos[minimo].length()) {
                    if (numeroVocales(textos[j]) > numeroVocales(textos[minimo])) {
                        minimo = j;
                    }

                }
                aux = textos[i];
                textos[i] = textos[minimo];
                textos[minimo] = aux;
            }
        }
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);

        }
    }*/
      /* public static int numeroVocales(String palabra){
            int vocales = 0;
            for (int x = 0; x < palabra.length(); x++) {
                char letraActual = palabra.charAt(x);
                if (esVocal(letraActual)) vocales++;
            }
            return vocales;
        }*/

   /*private static boolean esVocal(char letra) {
        return "aeiouáéíóúäëïöü".contains(String.valueOf(letra).toLowerCase());
    }*/

    /*public static void Arrays() {
        Scanner leer = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;

        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = leer.nextInt();
        }
    }*/


       /* //practica 9 algoritmo 2
        // Leemos los 24 números
        int[] numeros=new int[24];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            System.out.println("Introduce número: ");
            numeros[i]=leer.nextInt();
            leer.nextLine();
        }
        numeros=leerNumeros(numeros);

        //Ordenamos el array de números
        int[] arrayOrdenado;
        arrayOrdenado=ordenarArray(numeros);

        //Llenar la matriz
        int[][] matrizNumeros=new int[4][6];
        matrizNumeros=llenarMatriz(matrizNumeros,arrayOrdenado);

        //mostrar la matriz
        mostrarMatriz(matrizNumeros);
    }

    private static int[][] llenarMatriz(int[][] matrizNumeros, int[] arrayOrdenado) {
            int indice=0;
            for (int i = 0; i < matrizNumeros.length; i++) {
                for (int j = 0; j < matrizNumeros[0].length; j++) {
                    matrizNumeros[i][j]=arrayOrdenado[indice];
                    indice++;
                }
            }
            return matrizNumeros;
        }


    private static int[] ordenarArray(int[] numeros) {
        int minimo;
        int aux;
        for (int i = 0; i < numeros.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[j]<numeros[minimo]) {
                    minimo = j;
                }
            }
            aux=numeros[i];
            numeros[i]=numeros[minimo];
            numeros[minimo]=aux;
        }
        return numeros;
    }

    //Llenar la matriz
    int indice=0;
    int[][] matrizNumeros=new int[4][6];
        for (int i = 0; i < matrizNumeros.length; i++) {
        for (int j = 0; j < matrizNumeros[0].length; j++) {
            matrizNumeros[i][j]=numeros[indice];
            indice++;
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        //mostrar la matriz
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                System.out.print(matrizNumeros[i][j] + "|");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.print(matriz[i][j] + "|");
                    }
                    System.out.println("");
                }
            }
        }
    }
    private static int[] leerNumeros(int[] numeros) {
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número: ");
            numeros[i]=leer.nextInt();
            leer.nextLine();
        }
        return numeros;*/
       //
         Scanner leer=new Scanner(System.in);
         System.out.println("Introduce un número:" );
         int a=leer.nextInt();
         leer.nextLine();
         System.out.println("Introduce un número: ");
         int b=leer.nextInt();
         int suma=calcularSumaNumeros(a,b);
         System.out.println(suma);


    }
   private static int calcularSumaNumeros(int a, int b){
        int inicio,fin,suma=0;
        if (a>b){
            inicio=b;
            fin=a;
        }else{
            inicio=a;
            fin=b;
        }
       for (int i = inicio+1; i < fin; i++) {
           suma+=i;

       }
      return suma;
   }
   private static int factorial(int n){
        if (n<=1) return 1;
        return n*factorial(n-1);
   }

}
