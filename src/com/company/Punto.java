package com.company;

public class Punto {
    protected int X;
    protected int Y;

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public String imprimir(){
        return "X= "+X+" | Y= "+Y;
    }
    public void cambiar(){
        int aux=0;
        aux=X;
        X=Y;
        Y=aux;
    }
}
