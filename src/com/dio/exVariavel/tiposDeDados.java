package com.dio.exVariavel;

public class tiposDeDados {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 30;

        short s1 = 20000;
//        short s2 = 40000; { tamanho ultrapassa }

//        int i1 = -10000000000; { minimo é muito alto }
        int i2 = 232378;

//        long l1 = 3333838320000000; { precisa da letra L}
        long l2 = 4000000000000000000L;

//        float f1 = 4.5; { identifica como double sem o f}
        float f2 = 10.76f;

        double d1 = 85.69;
        double d2 = 13.45d;

        char c1 = 'a';

        String st1 = "Palavra";
        String st2 = "Pode ser texto";

        boolean boo1 = true;
        boolean bool2 = false;
    }
}
