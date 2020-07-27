package com.company;

import java.sql.Struct;

public class CuentaMovimientos extends Cuenta {
    private String[][] movimientos;
    private int contador;
    private boolean bloqueoCta;

    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos = new String[5][4];
        this.contador = 0;
        bloqueoCta = true;
    }

    public void ingresarM(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            registrarMovimientos("Ingresar", cantidad, true, "");
        } else {
            registrarMovimientos("Ingresar", cantidad, false, "Ingreso no valido, operacion no aceptada");
        }
    }


    public void retirarM(double cantidad) {
        if (saldo >= cantidad & bloqueoCta == false) {
            this.saldo = cantidad;
            registrarMovimientos("Retirar", cantidad, true, "");
        } else if (bloqueoCta = true) {
            registrarMovimientos("Retirar", cantidad, false, "Cta. bloqueada");
        } else {
            registrarMovimientos("Retirar", cantidad, false, "Saldo Cta. insuficiente");
        }
    }


    private void registrarMovimientos(String tipo, double cantidad, boolean op, String msg) {
        if (contador < 5) {
            movimientos[contador][0] = tipo;
            movimientos[contador][1] = String.valueOf(cantidad);
            movimientos[contador][2] = String.valueOf(op);
            movimientos[contador][3] = msg;
            contador++;
        } else {
            for (int i = 1; i < movimientos.length; i++) {
                movimientos[i - 1][0] = movimientos[i][0];
                movimientos[i - 1][1] = movimientos[i][1];
                movimientos[i - 1][2] = movimientos[i][2];
                movimientos[i - 1][3] = movimientos[i][3];
            }
            contador = 4;
            registrarMovimientos(tipo, cantidad, op, msg);
        }
    }

    public String[][] consultarMovimientos() {
        return movimientos;
    }

    public void extraer(double cantidad) {
        saldo = saldo - cantidad;
    }

    public boolean resultadoUltimaOperacion() {
        return Boolean.valueOf(movimientos[contador - 1][2]);
    }

    public void bloquear() {
        this.bloqueoCta = true;
    }

    public void desbloquear() {
        this.bloqueoCta = false;
    }
}
  /*public void bloqueoCtaMsg (double cantidad){
        if (saldo<cantidad){
            registrarMovimientos("Retirar",cantidad, false, "Cta. bloqueada");
        }*/