package com.company;

public class CuentaMovimientos extends Cuenta {
    private String[][] movimientos;
    private int contador;
    private boolean bloqueado;


    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos = new String[5][4];
        this.contador = 0;
        this.bloqueado = false;


    }

    public void ingresarM(double cantidad) {
        if (cantidad <=0) {

            registrarMov("Ingresar", cantidad, false, "No se puede ingresar cantidades negativas");
        } else {
            this.ingresar(cantidad);
            registrarMov("Ingresar", cantidad, true, "La cantidad se ha ingresado correctamente");
        }
    }

    public void retirarM(double cantidad) {


        if (saldo >= cantidad & bloqueado == false) {
            this.retirar(cantidad);
            registrarMov("Retirar", cantidad, true, "Operacion realizada");
        } else if (bloqueado == true) {
            registrarMov("Retirar", cantidad, false, "cuenta Bloqueada");
        } else {
            registrarMov("Retirar", cantidad, false, "Saldo insuficiente");

        }

    }



    private void registrarMov(String tipo, Double cantidad, boolean op, String msg) {
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
            registrarMov(tipo, cantidad, op, msg);

        }

    }

    public String[][] consultar() {
        return movimientos;
    }

    public boolean resultadoUltimaOperacio() {

        return Boolean.parseBoolean(movimientos[contador - 1][2]);
    }

    public void bloquear(){
        this.bloqueado=true;
    }

    public void desbloquear(){this.bloqueado=false;}

    public double consultaSaldo(){
        return saldo;
    }
}
