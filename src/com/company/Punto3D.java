package com.company;

public class Punto3D extends Punto {
    private double z;


    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z=z;


    }

    public void setZ(double z) {
        this.z = z;
    }


    public String imprimir(){
        return "punto{" +
                "x=" + x +
                "y=" + y +
                "z=" +z +'}';


    }

    public void cambiar(double z){
        this.cambiar();
        this.z=z;
    }
}
