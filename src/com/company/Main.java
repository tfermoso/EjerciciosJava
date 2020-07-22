package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Stack LIFO 10 Strings. Metodo meter. Metodo sacar.
        Stack<String> pila = new Stack<>();
        boolean saliendo=false;
        do {
            System.out.println("Elije opcion: \n" +
                    "1-Meter cadena \n" +
                    "2-Sacar cadena \n" +
                    "3- Leer pila \n" +
                    "4-Salir");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    meterCadena(pila);
                    break;
                case 2:
                    sacarCadena(pila);
                    break;
                case 3:
                    leerPila(pila);
                    break;
                case 4:
                    saliendo=true;
                    break;
                default:
                    break;
            }
        }while (!saliendo);
    }

    private static void leerPila(Stack<String> pila) {
        System.out.println("Pila actual "+pila);
    }

    private static void sacarCadena(Stack<String> pila) {
        pila.pop();
        System.out.println("Elemento eliminado");
    }

    private static void meterCadena(Stack<String> pila) {
        if (pila.size()!=10) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca cadena: ");
            String cadena = leer.nextLine();
            pila.push(cadena);
        }else {
            System.out.println("Pila llena");
        }
    }
}