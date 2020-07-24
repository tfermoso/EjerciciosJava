package com.company;

import java.util.ArrayList;
import java.util.List;

public class Punto  {
    protected double x=0;
    protected double y=0;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;

    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }





    public void cambiar(){
        double aux;
        aux=x;
        x=y;
        y=aux;


    }

    public String imprimir(){
        return "punto{" +
                "x=" + x +
                "y=" +y +'}';


    }

}

