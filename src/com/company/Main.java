package com.company;

public class Main {
    public static void main(String[] args) {

        CuentaMovimientos cuenta = new CuentaMovimientos(100);
        cuenta.ingresarM(-300);
        cuenta.ingresarM(400);
        cuenta.ingresarM(-500);
        cuenta.ingresarM(300);
        cuenta.retirarM(500);
        mostrarResultadoUltimaOp(cuenta);
        cuenta.retirarM(500000);
        mostrarResultadoUltimaOp(cuenta);
        cuenta.bloquear();
        cuenta.ingresarM(300);

        String[][] movimientos = cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: " + movimientos[i][0] + ",Cantidad: " + movimientos[i][1] + " Resultado: " + movimientos[i][2] + ",msg " + movimientos[i][3]);
        }
    }

    public static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta) {
        if (cuenta.resultadoUltimaOperacion()) {
            System.out.println("Operacion realizada con exito");
        } else {
            System.out.println("Error al realizar la operación");
        }
    }
}


