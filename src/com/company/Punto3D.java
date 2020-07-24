package com.company;

public class Punto3D extends Punto  {
    protected double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Punto3D(double y, double x, double z) {
        super(y, x);
        this.z = z;
    }
    public void cambiar(double z) {
        this.cambiar();
        this.z=z;
    }
}




