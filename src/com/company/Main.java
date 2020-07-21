package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[5];
        int cont = 0;
        int num1;
        System.out.println("Introduce 5 números positivos: ");


        do {
           System.out.println("Introduce un numero");
                num1 = leer.nextInt();
                leer.nextLine();
                if(num1>0){
num[cont]=num1;
cont++;
            }



        } while (cont < 5);
        System.out.println("numeros introducidos ");
        for (int i = 4; i >=0 ; i--) {
            System.out.println(num[i]+",");
        }
        System.out.printf("");
    }

}