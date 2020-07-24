package com.company;

public class CuentaMovimientos extends Cuenta {
    private String[][] movimientos;
    private int contador;

    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos = new String[5][2];
        this.contador = 0;

    }

    public void ingresarM(double cantidad) {
        this.saldo += cantidad;
        registrarMovimientos("Ingresar", cantidad);

    }

    public void retirarM(double cantidad) {
        this.saldo = cantidad;
        registrarMovimientos("Retirar", cantidad);
    }

    private void registrarMovimientos(String tipo, double cantidad) {
        if (contador < 5) {
            movimientos[contador][0] = tipo;
            movimientos[contador][1] = String.valueOf(cantidad);
            contador++;
        } else {
            for (int i = 1; i < movimientos.length; i++) {
                movimientos[i - 1][0] = movimientos[i][0];
                movimientos[i - 1][1] = movimientos[i][1];
            }
            contador = 4;
            registrarMovimientos(tipo, cantidad);
        }
    }

    public String[][] consultarMovimientos() {
        return movimientos;
    }
}
 /*double totalCuenta;

        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);

        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €");

        double ingreso = -350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " €");
        Cuenta1.depositar(ingreso);

        System.out.println("-------------------------------------------------");

        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €");*/