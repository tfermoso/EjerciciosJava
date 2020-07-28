package com.company;

import com.sun.javafx.scene.control.skin.CellSkinBase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       //
        boolean salir=false;
        boolean salirTodo=false;
        boolean cuentaSelec=false;
        ListaCuentas listaCuentas = new ListaCuentas();
        Scanner leer = new Scanner(System.in);
        do {
            do {
                System.out.println("Menu: \n" +
                        "1-Seleccionar cuenta \n" +
                        "2-Crear cuenta \n" +
                        "3-Salir");
                int opcionCuenta = leer.nextInt();
                leer.nextLine();
                switch (opcionCuenta) {
                    case 1:
                        System.out.println("Introduzca nombre titular");
                        String titular = leer.nextLine();
                        if (listaCuentas.seleccionarCuenta(titular)) {
                            System.out.println("Cuenta seleccionada");
                            cuentaSelec=true;
                        } else {
                            System.out.println("No se ha encontrado cuenta");
                        }
                        break;

                    case 2:
                        System.out.println("Introduzca nombre titular");
                        String titular1 = leer.nextLine();
                        System.out.println("Introduzca saldo inicial");
                        int saldo = leer.nextInt();
                        listaCuentas.crearCuenta(titular1, saldo);
                        listaCuentas.seleccionarCuenta(titular1);
                        System.out.println("Cuenta creada");
                        cuentaSelec=true;
                        break;
                    case 3:
                        salirTodo = true;
                        cuentaSelec=true;
                        break;
                }
            }while (!cuentaSelec);
            do {
                salir=false;
                System.out.println("Menu: \n" +
                        "1-Ingresar saldo\n" +
                        "2-Retirar saldo \n" +
                        "3-Bloquear/Desbloquear cuenta \n" +
                        "4-Comprobar saldo\n" +
                        "5-Ultimos 5 movimiento \n" +
                        "6-Salir de la cuenta \n");

                int opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuanto se ingresa?");
                        int ingreso = leer.nextInt();
                        listaCuentas.ingresar(ingreso);
                        System.out.println(comprobacion(listaCuentas));
                        break;
                    case 2:
                        System.out.println("¿Cuanto se retira?");
                        int retiro = leer.nextInt();
                        listaCuentas.retirar(retiro);
                        System.out.println(comprobacion(listaCuentas));
                        break;
                    case 3:
                        if (listaCuentas.isBloqueo()) {
                            listaCuentas.setBloqueo();
                            System.out.println("Cuenta desbloqueada");
                        } else {
                            listaCuentas.setBloqueo();
                            System.out.println("Cuenta bloqueda");
                        }

                        break;
                    case 4:
                        System.out.println("Saldo: " + listaCuentas.consultarSaldo());
                        break;
                    case 5:
                        String[][] movimientos = listaCuentas.ultimosMovimientos();
                        for (int i = 0; i < movimientos.length; i++) {
                            System.out.println("Tipo: " + movimientos[i][0] + ", cantidad: " + movimientos[i][1] + ", Succesful: " + movimientos[i][2]);
                        }
                        break;
                    case 6:
                        salir=true;
                        cuentaSelec=false;
                        listaCuentas.deseleccionarCuenta();
                        break;
                }
            } while (!salir);
        }while (!salirTodo);
    }
   public static String comprobacion(ListaCuentas cuenta) {
        return cuenta.resultadoUltima();
    }

}