package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       CuentasClientes cuentas= new CuentasClientes();




            int opcion;
        boolean salir = false;
String menuP="Operaciones disponibles\n"+
        "***1. Añadir cuenta \n"+
        "***2. Seleccionar cuenta \n"+
        "***9. Salir \n"
        ;



               String menu= "Menu:\n"+
               "************************ \n" +
                                "***1. Añadir cuenta \n"+
                                "***2. Seleccionar cuenta \n"+
                        "***3. Ingresar dinero \n" +
                        "***4. Retirar dinero \n" +
                        "***5. Ultimos movimientos \n" +
                        "***6. Consultar saldo \n" +
                        "***7. Bloquear cuenta \n" +
                        "***8. Desbloquear cuenta \n" +
                        "***9. Salir \n"
                ;
        do{
            if(cuentas.cuentaSeleccionada()){
                System.out.println(menu);
            }else{
                System.out.println(menuP);
            }


                    opcion = leer.nextInt();
                    leer.nextLine();


                switch (opcion) {
                    case 1:
                        añadirCuenta( cuentas , leer);
                        break;
                    case 2:
                        seleccionCuenta(cuentas, leer);
                        break;

                    case 3:
                        ingresarDinero(cuentas,leer);

                        break;
                    case 4:
                        retirarDinero(cuentas, leer);

                        break;
                    case 5:
                        String[][] movimientos = cuentas.ultimosMovimientos();
                        for (int i = 0; i <movimientos.length; i++) {
                            System.out.println("Tipo: "+ movimientos[i][0]+", cantidad "+ movimientos[i][1]+", op "+ movimientos[i][2]+", msg "+ movimientos[i][3]);

                        }
                        break;
                    case 6:
                        System.out.println(" Su saldo actual es: ");
                        System.out.println(cuentas.consultarSaldo()+" €");


                        break;
                    case 7:
                       cuentas.bloquear();

                        System.out.println("Cuenta bloqueada");
                        break;
                    case 8:
                        cuentas.desbloquear();
                        System.out.println("Cuenta desbloqueada");


                        break;
                    case 9:
                        salir = true;
                        System.out.println("Hasta pronto....");
                        break;
                    default:
                        System.out.println("La opción seleccionada no es valida");
                }

        } while (!salir) ;
        }

    private static void seleccionCuenta(CuentasClientes cuentas, Scanner leer) {
        System.out.println("Introduce el nombre del titular: ");
        String titular=leer.nextLine();
        cuentas.selectCuenta(titular);
    }

    private static void añadirCuenta(CuentasClientes cuentas, Scanner leer) {
        System.out.println("Introduce el nombre del titutal: ");
        String nombre= leer.nextLine();
        cuentas.crearCuenta(nombre,0);
    }


    private static void retirarDinero( CuentasClientes cuentas, Scanner leer) {
        System.out.println("Introduzca la cantidad a retirar:");
        double retirada=leer.nextDouble();
        leer.nextLine();
        cuentas.retirar(retirada);
        mostrarrUltimaOperacion(cuentas);

    }

    private static void ingresarDinero(CuentasClientes cuentas, Scanner leer) {
        System.out.println(" Introduzca la cantidad a ingresar: ");
        double ingreso= leer.nextDouble();
        cuentas.ingresar(ingreso);
        leer.nextLine();
        mostrarrUltimaOperacion(cuentas);
    }

    private static void mostrarrUltimaOperacion (CuentasClientes cuenta){

            if (cuenta.rUltimaOperacion()) {
                System.out.println("Operacion realizada con éxito");
            } else {
                System.out.println("Error al realizar la operación");
            }


        }


    }






