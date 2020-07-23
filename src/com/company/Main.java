package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Añadir nota Mostrar media Total aprobados Mostrar notas introducidas Salir
        boolean salir=false;
        Scanner leer=new Scanner(System.in);
        Notas notas=new Notas();
        do {
            System.out.println("Menu : \n" +
                    "1-Añadir nota \n" +
                    "2-Mostrar media \n" +
                    "3-Total aprobados \n" +
                    "4-Mostrar notas \n" +
                    "5-Salir");
            int opcion=leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca nueva nota");
                    double nota=leer.nextDouble();
                    if(notas.añadirNota(nota)){
                        System.out.println("Nota añadida correctamente");
                    }else {
                        System.out.println("Lista de notas llena");
                    }
                    break;
                case 2:
                    System.out.println("Media : "+notas.mostrarMedia());
                    break;
                case 3:
                    System.out.println("Total aprobados: "+notas.mostrarAprobados());
                    break;
                case 4:
                    System.out.println("Notas : \n"+notas.mostrarNotas());
                    break;
                case 5:
                    salir=true;
                    break;
            }
        }while (!salir);
    }
}