package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CuentaCliente cuentaCliente = new CuentaCliente();

        int opcion = 0;
        String menuP = "Operaciones disponibles\n" +
                "   1. Crear cuenta\n" +
                "   2. Seleccionar cuenta\n" +
                "   3. Salir";

        String menu = "------menu----------\n" +
                "   1. Crear cuenta\n" +
                "   2. Seleccionar cuenta\n" +
                "   3. Ingresar dinero\n" +
                "   4. Retirar dinero\n" +
                "   5. Consultar Saldo\n" +
                "   6. Bloquear Cuenta\n" +
                "   7. Desbloquear Cuenta\n" +
                "   8. Consultar Ultimos movimientos\n" +
                "   9.Salir";

        do {
            if(cuentaCliente.cuentaselecionada()) {
                System.out.println(menu);
            }else {
                System.out.println(menuP);
            }

            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el titular de la cuenta");
                    String nombre = leer.nextLine();
                    System.out.println("Saldo de la cuenta: ");
                    Double saldo = leer.nextDouble();
                    leer.nextLine();
                    cuentaCliente.crearCuenta(nombre, 0);

                    break;
                case 2:
                    System.out.println("introduce el nombre del titular: ");
                    String titular = leer.nextLine();
                    cuentaCliente.seleccionarCuenta(titular);

                    break;
                case 3:
                    System.out.println("Introduce la cantidad a retirar:  ");
                    double cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuentaCliente.ingresar(cantidad);

                    break;
                case 4:
                    System.out.println("Introduce la cantidad a retirar:  ");
                    cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuentaCliente.retirar(cantidad);

                    break;
                case 5:
                    cuentaCliente.consultaSaldo();
                    break;
                case 6:
                    cuentaCliente.bloquear();
                    System.out.println("La cuenta se ha bloqueado correctamente");
                    break;
                case 7:
                    cuentaCliente.desbloquear();
                    System.out.println("La cuenta se ha bloqueado correctamente");
                    break;
                case 8:
                    String[][] movimientos = cuentaCliente.consultar();
                    for (int i = 0; i < movimientos.length; i++) {

                        System.out.println("  |  Tipo:" + movimientos[i][0] + "  " + movimientos[i][1] + "  |  Resultado: " + movimientos[i][2] + "  | bloqueado: " + movimientos[i][3]);
                    }
                    break;


                case 9:
                    System.out.println("salir");
                    break;
                default:

                    System.out.println("Introduce un valor correcto");
                    break;
            }

        }
        while (opcion != 7);

    }

    private static void ingresarDinero(CuentaMovimientos cuenta, Scanner leer) {
        System.out.println("Introduce la cantidad a ingresar:  ");
        double cantidad = leer.nextDouble();
        leer.nextLine();
        cuenta.ingresarM(cantidad);
    }

    private static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta) {
        if (cuenta.resultadoUltimaOperacio()) {
            System.out.println("Operación realizada con éxito");
        } else {
            System.out.println("Error al realizar la operación");
        }
    }
}




