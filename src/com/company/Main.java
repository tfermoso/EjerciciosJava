package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] loteria=new int[6];
        int contador=0;
        do {
            //Genero número aleatorio
            Random rand = new Random();
            Integer numero = rand.nextInt(50);

            //Compruebo si ya lo tengo
            if(! comprobarArray(numero,loteria)){
                loteria[contador] = numero;
                contador++;
            }
        }while(contador<6);

        for (int i = 0; i < loteria.length; i++) {
            System.out.print(loteria[i]+",");
        }
        System.out.println("");
    }

    private static boolean comprobarArray(Integer numero, int[] loteria) {
        for (int i = 0; i < loteria.length; i++) {
            if(loteria[i]==numero) return true;
        }
        return false;
    }

}
