package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Punto 2 coordenadas : Intercambiar e imprimir. Punto3D añadir Z ,socrescribir imprimir ,
        // socrecargar intercambiar para cambiar z
        System.out.println("Creando punto");
        Punto punto=new Punto(2,5);
        System.out.println(punto.imprimir());
        System.out.println("Intercambiando coordenadas");
        punto.cambiar();
        System.out.println(punto.imprimir());
        System.out.println("Creando punto en 3D");
       Punto3D punto3d=new Punto3D(5,2,7);
        System.out.println(punto3d.imprimir());
        System.out.println("Intercambiando coordenadas. Inserte nueva coordenada Z: ");
        Scanner leer=new Scanner(System.in);
        int z=leer.nextInt();
        punto3d.cambiar(z);
        System.out.println(punto3d.imprimir());

    }
}