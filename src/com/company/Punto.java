package com.company;

public class Punto {
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Punto(double y, double x) {
        this.y = y;
        this.x = x;
    }

    protected double y;
    protected double x;

    public String imprimir(){

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
