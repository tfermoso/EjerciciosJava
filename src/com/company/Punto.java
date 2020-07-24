package com.company;

public class Punto {
    protected int X;
    protected int Y;

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public String imprimir(){
        return "X= "+this.X+" | Y= "+this.Y;
    }
    public void cambiar(){
        int aux=0;
        aux=this.X;
        this.X=this.Y;
        this.Y=aux;
    }
}
