package com.dio.metodos;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("área do quadrado" + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("área do retângulo" + lado1 * lado2);
    }

    public static void  area(double baseMenor, double baseMaior, double altura) {
        System.out.println("Área do triangulo" + ((baseMenor + baseMaior) * altura) / 2);
    }
}
