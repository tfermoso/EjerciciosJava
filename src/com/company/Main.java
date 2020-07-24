package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Punto p=new Punto(4,6);
        System.out.println(p.imprimir());
        p.cambiar();
        System.out.println(p.imprimir());
        Punto3D p3D=new Punto3D(3,5,6);
        System.out.println(p3D.imprimir());
        p3D.cambiar();
        System.out.println(p3D.imprimir());

    }


}




