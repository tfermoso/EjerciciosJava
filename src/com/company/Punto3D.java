package com.company;

public class Punto3D extends Punto {
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public String imprimir() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public void cambiar(double z) {
        this.cambiar();
        this.z = z;
    }
}
