package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[20];
        int cont = 0;
        int num1;
        int total = 0;



            for (int i = 0; i < 20; i++) {

                if (total > 100) {
                    num[i] = 0;
                } else {
                    System.out.println("Introduce un numero");
                    num1 = leer.nextInt();
                    leer.nextLine();
                    total += num1;
                    num[i] = num1;

                }
            }
        for (int i = 0; i <20 ; i++) {
            System.out.println(num[i]+",");

        }
        System.out.println("");
        }
    }
