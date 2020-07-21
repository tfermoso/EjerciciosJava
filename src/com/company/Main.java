package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Realizar un algoritmo para un programa que lea el nombre y temperatura de
        // una ciudad y los guarde en un array, hasta un total de 10 ciudades.
        // A continuación, nos mostrará el nombre y temperatura de todas las ciudades
        // cuya temperatura sea inferior a la media. Podemos usar una función ConvertirEntero,
        // que nos convierte una cadena formada por caracteres numéricos a entero.

        String[][] temperaturas=new String[10][2];
        Scanner leer= new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Nombre de la ciudad: ");
            String ciudad=leer.nextLine();
            System.out.println("Temperatura: ");
            String temp=leer.nextLine();
            temperaturas[i][0]=ciudad;
            temperaturas[i][1]=temp;
        }
        double media=0.0;
        for (int i = 0; i <temperaturas.length ; i++) {
            media+=convertirInt(temperaturas[i][1]);
        }
        media= media/10;
        System.out.println("La media de temperatura es "+media);
        System.out.println("Las ciudades que menor temperatura a la media son : ");
        for (int i = 0; i <temperaturas.length ; i++) {
            if (media>convertirInt(temperaturas[i][1])){
                System.out.println(temperaturas[i][0] + " con temperatura "+temperaturas[i][1]);
            }
        }

    }

    public static int convertirInt(String valor){
        return Integer.parseInt(valor);
    }
}