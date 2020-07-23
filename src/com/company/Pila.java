package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Pila<pila> {


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

        if (this.datos.size() < 10) {
            return true;
        }
        return false;
    }


    public String pop() {
        if (this.tipo.equals("FIFO")) {
            return (this.datos.removeLast());

        } else {
            return (this.datos.pop());
        }

    }
}
