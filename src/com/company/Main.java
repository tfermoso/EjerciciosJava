package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int cont=0;
        int[] loteria = new int[6];
        do {
            //Generar nº aleatorio
            Random rd = new Random();
        int numeroAleatorio = rd.nextInt(50);
            //comprobar si ya existe
            if (!comprobarArray(numeroAleatorio,loteria)){
               loteria[cont] =numeroAleatorio;
               cont++;

            }
        }while (cont<6);

        for (int i = 0; i <loteria.length ; i++) {
            System.out.print(loteria[i]+",");

        }
        System.out.println(" ");
    }

    private static boolean comprobarArray(int numeroAleatorio, int[] loteria) {
        for (int i = 0; i <loteria.length ; i++) {
            if(loteria[i]==numeroAleatorio) return true;


        }
        return false;
    }

}