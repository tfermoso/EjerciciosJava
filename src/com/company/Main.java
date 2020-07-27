package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaMovimientos cuenta = new CuentaMovimientos(1500);
            int opcion;
        boolean salir = false;


            do {


                System.out.println("Menu:");
                System.out.println("************************ \n" +
                        "***1. Ingresar dinero \n" +
                        "***2. Retirar dinero \n" +
                        "***3. Ultimos movimientos \n" +
                        "***4. Consultar saldo \n" +
                        "***5. Bloquear cuenta \n" +
                        "***6. Desbloquear cuenta \n" +
                        "***7. Salir \n"
                );

                try {

                    opcion = leer.nextInt();
                    leer.nextLine();
                } catch (Exception e) {
                    leer.nextLine();
                    System.out.println("Tiene que ser un número\n");
                    opcion = 25;

                }
                switch (opcion) {
                    case 1:
                        ingresarDinero(cuenta,leer);

                        break;
                    case 2:
                        retirarDinero(cuenta, leer);

                        break;
                    case 3:
                        String[][] movimientos = cuenta.consultarMovimientos();
                        for (int i = 0; i <movimientos.length; i++) {
                            System.out.println("Tipo: "+ movimientos[i][0]+", cantidad "+ movimientos[i][1]+", op "+ movimientos[i][2]+", msg "+ movimientos[i][3]);

                        }
                        break;
                    case 4:
                        System.out.println(" Su saldo actual es: ");
                        System.out.println(cuenta.consultarSaldo()+" €");


                        break;
                    case 5:
                       cuenta.bloquear();

                        System.out.println("Cuenta bloqueada");
                        break;
                    case 6:
                        cuenta.desbloquear();
                        System.out.println("Cuenta desbloqueada");


                        break;
                    case 7:
                        salir = true;
                        System.out.println("Hasta pronto....");
                        break;
                    default:
                        System.out.println("La opción seleccionada no es valida");
                }

        }while (salir == false) ;
        }

    private static void retirarDinero(CuentaMovimientos cuenta, Scanner leer) {
        System.out.println("Introduzca la cantidad a retirar:");
        double retirada=leer.nextDouble();
        leer.nextLine();
        cuenta.retirarM(retirada);
        mostrarrUltimaOperacion(cuenta);

    }

    private static void ingresarDinero(CuentaMovimientos cuenta, Scanner leer) {
        System.out.println(" Introduzca la cantidad a ingresar: ");
        double ingreso= leer.nextDouble();
        cuenta.ingresarM(ingreso);
        leer.nextLine();
        mostrarrUltimaOperacion(cuenta);
    }

    private static void mostrarrUltimaOperacion (CuentaMovimientos cuenta){

            if (cuenta.rUltimaOperacion()) {
                System.out.println("Operacion realizada con éxito");
            } else {
                System.out.println("Error al realizar la operación");
            }


        }


    }






