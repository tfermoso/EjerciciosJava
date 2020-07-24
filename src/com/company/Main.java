package com.company;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        Scanner leer = new Scanner(System.in);

        int opcion;
        String menu="Menú\n "+
                    "1. Añadir nota \n "+
                    "2. Mostrar media \n" +
                    "3. Total aprobados\n" +
                    "4. Mostrar notas introducidas\n" +
                    "5. Salir";

        do{
            System.out.println(menu);
             opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce la nota");
                        int nota=leer.nextInt();
                        leer.nextLine();
                        empleado.añadirNota(nota);
                        break;
                    case 2:
                        mostrarMedia(empleado);
                        break;
                    case 3:
                        totalAprobados();
                        break;
                    case 4:
                        mostrarNotasIntroducidas(empleado);
                        int[] arrayNotas=empleado.mostrarNotas();
                        System.out.println("Listado de notas:");
                        for (int i = 0; i < arrayNotas.length; i++) {
                        }
                        System.out.println("");
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("opción no válida");

            }
        } while (opcion!=5);

    }

    private static void mostrarNotasIntroducidas(Empleado empleado) {
    }

    private static void totalAprobados() {
    }

    private static void mostrarMedia(Empleado empleado) {
        System.out.println(empleado.mostrarMedia());
    }

   
}



