package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado notas = new Empleado();
        int opcion;
        String menu = "------menu----------\n" +
                "   1. Añadir Nota\n" +
                "   2. Mostrar Media\n" +
                "   3. Total Aprovados\n" +
                "   4. Mostrar notas introducidas\n" +
                "   5.salir";


        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Añade una Nota:  ");
                    int nota = leer.nextInt();
                    leer.nextLine();
                    notas.añadirNotas(nota);
                    break;
                case 2:
                    System.out.println("La media es="+notas.mostrarMedia());
                    break;
                case 3:
                    System.out.println("El numero total de empleados"+ notas.totalAprovados());
                    break;
                case 4:
                    int[]arraynotas=notas.mostrarNotas();
                    System.out.println("Listado de Notas");
                    for (int i = 0; i <arraynotas.length ; i++) {
                        System.out.print(arraynotas[i]+",");

                    }
                    System.out.println("");
                    break;
                case 5:
                    break;


            }


        } while (opcion != 5);
    }
}