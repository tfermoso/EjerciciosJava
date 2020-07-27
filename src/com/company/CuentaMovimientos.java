package com.company;

public class CuentaMovimientos extends Cuenta {
    private String[][] movimientos;
    private int contador;
    private boolean bloqueado;

    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos = new String[5][4];
        this.contador = 0;
        bloqueado=false;
    }

    public void ingresarI(double cantidad) {
        if (cantidad>0 ) {
            this.ingresar(cantidad);
            //this.saldo += cantidad;
            registrarMovimiento("Ingresar", cantidad, true, "");
        }else{
            registrarMovimiento("Ingresar", cantidad, false, "Cantidad negativa");
        }

    }

    public void retirarR(double cantidad) {
        if (saldo>=cantidad&bloqueado==false){
           //if(saldo>=0)

            this.retirar(cantidad);
            //this.saldo += cantidad;
            registrarMovimiento("Retirar", cantidad, true,"");
        }else if (bloqueado==true){
            registrarMovimiento("Retirar", cantidad, false,"cuenta bloqueada");
        }else{
            registrarMovimiento("Retirar", cantidad, false,"saldo insuficiente");
        }

    }

    private void registrarMovimiento(String tipo, double cantidad, boolean op, String msg) {
        if (contador < 5) {
            movimientos[contador][0] = tipo;
            movimientos[contador][1] = String.valueOf(cantidad);
            movimientos[contador][2] = String.valueOf(op);
            movimientos[contador][3] = msg;
            contador++;

        }else {
            for (int i = 1; i < movimientos.length; i++) {
                movimientos [i-1][0]=movimientos[i][0];
                movimientos [i-1][1]=movimientos[i][1];
                movimientos [i-1][2]=movimientos[i][2];
                movimientos [i-1][3]=movimientos[i][3];
            }
            contador=4;
            registrarMovimiento(tipo, cantidad, op, msg);

        }

    }
    public String[][] consultarMovimientos(){
        return movimientos;
    }
    public boolean resultadoUltimaOperacion(){
        return Boolean.valueOf(movimientos[contador-1][2]);
    }
    public void bloquear(){
        this.bloqueado=true;
    }
    public void desbloquear(){
        this.bloqueado=false;
    }
    public double consultarSaldo(){
        return saldo;
    }

}
