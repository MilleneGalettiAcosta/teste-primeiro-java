package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        int somar = somar(a, b);
        int substrair = substrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("soma" + somar);
        System.out.println("soma" + substrair);
        System.out.println("soma" + dividir);
        System.out.println("soma" + multiplicar);
    }

    public static int somar(int a , int b) {
        return a + b;
    }

    public static int substrair(int a , int b) {
        return a - b;
    }

    public static int dividir(int a , int b) {
        return a / b;
    }

    public static int multiplicar(int a , int b) {
        return a * b;
    }
}
