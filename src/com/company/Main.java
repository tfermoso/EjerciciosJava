package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String [][]ciudades= new String[10][2] ;
        for (int i = 0; i < 10 ; i++) {
            System.out.println(" Nombre de ciudad:");
            String ciudad=leer.nextLine();
            System.out.println(" Temperatura: ");
            String temperatura=leer.nextLine();
            ciudades[i][0]=ciudad;
            ciudades[i][1]=temperatura;

        }
        double media=0.0;
        for (int i = 0; i <ciudades.length ; i++) {
            media+=convertirEntero(ciudades[i][1]);
        }
       media=media/10;
        System.out.println("La temperatura media es : "+ media);
        for (int i = 0; i <ciudades.length ; i++) {
            if(convertirEntero(ciudades[i][1])<media){
                System.out.println("Ciudad: " + ciudades[i][0]+", tempreatura: " + ciudades[i][1]);

            }

        }
    }
    public static int convertirEntero(String valor){
        return Integer.parseInt(valor);
    }
}