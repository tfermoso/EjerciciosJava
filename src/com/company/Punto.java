package com.company;

public class Punto {
    protected double x;
    protected double y;
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String imprimir() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void cambiar(){
       double aux;
        aux=x;
        x=y;
        y=aux;


    }

}


