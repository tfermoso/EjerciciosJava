package com.company;


import java.util.Scanner;

public class ICapa1 {

    public static void main(String[] args) {
        //write your code here
        Empleado empleado = new Empleado();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println("-----Elije una opcion:------  \n" +
                    "**** 1. Añadir nota \n " +
                    "**** 2. Mostrar media \n" +
                    "**** 3. Total aprobados \n" +
                    "**** 4. Mostrar notas introducidas\n" +
                    "***  5. Salir \n");
            int opcionElegida = leer.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Añade una nota ");
                    int nota = leer.nextInt();
                    leer.nextLine();
                    empleado.añadirNota(nota);
                    break;
                case 2:

                    System.out.println("La media es: " + empleado.mostrarMedia());
                    break;
                case 3:
                    System.out.println("Total aprobados: " + empleado.totalAprobados());
                    break;
                case 4:
                    int[] arrayNotas = empleado.mostrarNotas();
                    System.out.println("Listado de notas ");
                    for (int i = 0; i < arrayNotas.length; i++) {
                        System.out.print(arrayNotas[i] + ",");
                    }
                    System.out.println("");
                    break;
                case 5:
                    salir = true;
                    break;

            }

        } while (salir == false);


    }


}


       /* Class Pila
        Property Datos 1 To 10 String
        Guardados Integer
        Pila()
        Guardados=0
        End Class
        Sub Guardar(Texto String)
        If(Guardados<10) Then
        Guardados=Guardados+1
        Datos[Guardados]=Texto
        End If
        End Sub
        Function Recuperar()
        Result String
        Result= Datos[Guardados]
        Guardados=Guardados-1 //simula su eliminación
        Return Result
        End Function
        End Class */





