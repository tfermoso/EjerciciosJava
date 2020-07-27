package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaMovimientos cuenta = new CuentaMovimientos(0);
        int opcion = 0;


        String menu = "------menu----------\n" +
                "   1. Ingresar dinero\n" +
                "   2. Retirar dinero\n" +
                "   3. Consultar Saldo\n" +
                "   4. Bloquear Cuenta\n" +
                "   5. Desbloquear Cuenta\n" +
                "   6. Consultar Ultimos movimientos\n" +
                "   7.Salir";

        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    ingresarDinero(cuenta, leer);

                    break;
                case 2:
                    System.out.println("Introduce la cantidad a retirar:  ");
                    double cantidad = leer.nextDouble();
                    leer.nextLine();
                    cuenta.retirarM(cantidad);
                    break;
                case 3:

                    System.out.println("Su saldo es:");
                    System.out.println(cuenta.consultaSaldo());
                    break;
                case 4:
                    cuenta.bloquear();
                    System.out.println("La cuenta se ha bloqueado correctamente");
                    break;
                case 5:
                    cuenta.desbloquear();
                    System.out.println("La cuenta se ha bloqueado correctamente");
                    break;
                case 6:
                    String[][] movimientos = cuenta.consultar();
                    for (int i = 0; i < movimientos.length; i++) {

                        System.out.println("  |  Tipo:" + movimientos[i][0] + "  " + movimientos[i][1] + "  |  Resultado: " + movimientos[i][2] + "  | bloqueado: " + movimientos[i][3]);
                    }
                    break;


                case 7:
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

    private static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta){
        if(cuenta. resultadoUltimaOperacio()){
            System.out.println("Operación realizada con éxito");
        }else{
            System.out.println("Error al realizar la operación");
        }
    }
}

}


