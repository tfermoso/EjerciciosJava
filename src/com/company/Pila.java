package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Pila {

    private LinkedList<String> datos;
    private String tipo;


    public Pila(String tipo) {
        this.tipo = tipo;
        if (tipo.equals("FIFO") || tipo.equals("LIFO")) {
            this.datos = new LinkedList<>();

        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public boolean push(String msg) {
        if (this.tipo.equals("FIFO")) {
            if (this.datos.size() < 10) ;
            this.datos.push(msg);
            return true;

        } else if (this.tipo.equals("LIFO")) {
            if (this.datos.size() < 10) ;
            this.datos.push(msg);
            return true;
        }
        return false;

    }

    public String pop() {
        if (this.tipo.equals("FIFO")) {
            return this.datos.removeLast();
        } else {
            return this.datos.pop();
        }

    }
}

    /*public int push() {

        int tope = 10;
        if (tope >= pila.length - 1) {
            System.out.println("la pila está llena");
        } else {
            tope += 1;
            System.out.println("ingrese el dato");
            pila.set(tope, Scanner.nextInt());
        }
        return tope;

    }

    public int pop() {
        int tope = 10;
        if (tope == -1) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Se elimino un elemento de la pila");
            pila[tope] = 0;
            tope = -1;
        }
        return tope;*/



