package com.company;

import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                //    Tenemos un array de enteros de tamaño 20. Realizar un algoritmo que vaya leyendo números y los guarde
                //    en el array, pero si la suma de los números leídos alcanza o supera 100, se dejarán de leer números
                //    y rellenará con 0 las posiciones que queden libres.
                Scanner leer= new Scanner(System.in);
                int[] numeros = new int [20];
                boolean acabado=false;
                int contador=0;
                int numero;
                do {
                    System.out.println("Introduzca numero");
                    numero = leer.nextInt();
                    leer.nextLine();
                    numeros[contador]=numero;
                    contador++;
                    int suma=0;
                    for (int i = 0; i <numeros.length ; i++) {
                        suma+=numeros[i];
                        if (suma>=100){
                            acabado=true;
                        }else if(contador==19){
                            acabado=true;
                        }
                    }
                }while (!acabado);
                for (int i = 0; i <numeros.length ; i++) {
                    if (numeros[i]!=0){
                        System.out.println(numeros[i]);
                    }
                }
            }
        }

