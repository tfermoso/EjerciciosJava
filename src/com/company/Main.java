package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentasClientes cuentas = new CuentasClientes();
        String menuP = "***** 7. Crear Cuenta \n" +
                "***** 8. Seleccionar Cuenta \n" +
                "***** 9. Salir \n";
        String menu = ("Elige una opcion de Gestion de Ctas.: \n" +
                "***** 1. Ingreso de fondos \n" +
                "***** 2. Retirada de fondos \n" +
                "***** 3. Consulta de saldo \n" +
                "***** 4. Ultimos movimientos \n" +
                "***** 5. Bloquear Cuenta \n" +
                "***** 6. Desbloquear Cuenta \n" +
                "***** 7. Crear Cuenta \n" +
                "***** 8. Seleccionar Cuenta \n" +
                "***** 9. Salir \n");
        int opcion;
        do {
            if (cuentas.cuentaSeleccionada()) {
                System.out.println(menu);
            } else {
                System.out.println(menuP);
            }
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            double cantidad;
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad a ingresar");
                    cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuentas.ingresar(cantidad);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar");
                    cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuentas.retirar(cantidad);
                    mostrarResultadoUltimaOp(cuentas);
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    System.out.println(cuentas.consultarSaldos() + " €");
                    break;
                case 4:
                    String[][] movimientos = cuentas.ultimosMovimientos();
                    for (int i = 0; i < movimientos.length; i++) {
                        System.out.println("Tipo: " + movimientos[i][0] + "cantidad: " + movimientos[i][1] + "resultado: " + movimientos[i][2] + "mensaje: " + movimientos[i][3]);
                    }
                    // cuentas.resultadoUltimaOperacion();
                    break;
                case 5:
                    cuentas.bloquear();
                    break;
                case 6:
                    cuentas.desbloquear();
                    break;
                case 7:
                    System.out.println("Nombre titular de la cta.");
                    String nombre = leer.nextLine();
                    cuentas.crearCuenta(nombre, 0);
                    break;
                case 8:
                    System.out.println("Titular: ");
                    String titular = leer.nextLine();
                    cuentas.seleccionarCuenta(titular);
                    break;
                case 9:
                    System.out.println("Hasta pronto..");
                    break;
                default:
                    System.out.println("***** Opcion No Valida*****");
                    break;

            }
        } while (opcion != 9);


    }


    /*
        private static void crearCuenta() {
            Scanner sc = new Scanner(System.in);
            String nombre, numero;
            System.out.print("Nombre titular : ");
            nombre = sc.nextLine();
            System.out.print("Número de cuenta : ");
            numero = sc.nextLine();
        }
    */
    private static void mostrarResultadoUltimaOp(CuentasClientes cuenta) {
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



