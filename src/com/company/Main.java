package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaMovimientos cuenta = new CuentaMovimientos(0);
        String menu = ("Elige una opcion de Gestion de Ctas.: \n" +
                "***** 1. Ingreso de fondos \n" +
                "***** 2. Retirada de fondos \n" +
                "***** 3. Consulta de saldo \n" +
                "***** 4. Ultimos movimientos \n" +
                "***** 5. Bloquear Cuenta \n" +
                "***** 6. Desbloquear Cuenta \n" +
                "***** 7. Salir \n");
        int opcion;
        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            double cantidad;
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad a ingresar");
                    cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuenta.ingresarM(cantidad);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar");
                    cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuenta.retirarM(cantidad);
                    mostrarResultadoUltimaOp(cuenta);
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    System.out.println(cuenta.consultarSaldo() + " €");
                    break;
                case 4:
                    String[][] movimientos = cuenta.consultarMovimientos();
                    for (int i = 0; i < movimientos.length; i++) {
                        System.out.println("Tipo: " + movimientos[i][0] + "cantidad: " + movimientos[i][1] + "resultado: " + movimientos[i][2] + "mensaje: " + movimientos[i][3]);

                    }
                    cuenta.resultadoUltimaOperacion();
                    break;
                case 5:
                    cuenta.bloquear();
                    break;
                case 6:
                    cuenta.desbloquear();
                    break;
                case 7:
                    System.out.println("Hasta pronto..");
                    break;
                default:
                    System.out.println("***** Opcion No Valida*****");
                    break;
            }
        } while (opcion != 7);

    }

    private static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta) {
        if (cuenta.resultadoUltimaOperacion()) {
            System.out.println("Operación realizada con éxito");
        } else {
            System.out.println("Error al realizar la operación");
        }
    }


      /*  boolean salir=false;

            System.out.println
            int opcionElegida = leer.nextInt();


        }while (salir==false);
        System.out.println();








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


    public static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta) {
        if (cuenta.resultadoUltimaOperacion()) {
            System.out.println("Operacion realizada con exito");
        } else {
            System.out.println("Error al realizar la operación");
        }
    }*/

}



