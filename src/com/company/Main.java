package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] loteria = new int[6];
        int contador = 0;
        do {
            //Generar numero aleatorio
            Random rand = new Random();
            int numero = rand.nextInt(50);

            //Comprueba si ya lo tengo
            if (!comprobarArray(numero, loteria)) {
                loteria[contador] = numero;
                contador++;
            }

        } while (contador < 6);
        for (int i = 0; i < loteria.length; i++) {
            System.out.println(loteria[i] + " ");
        }
        System.out.println(" ");
    }

    private static boolean comprobarArray(int numero, int[] loteria) {
        for (int i = 0; i < loteria.length; i++) {
            if (loteria[i] == numero) return true;

        }
        return false;
    }
}
