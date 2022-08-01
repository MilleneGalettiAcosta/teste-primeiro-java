package com.dio.exVariavel;

public class Variaveis {
    public static void main(String[] args) {
        int i;
//        int i; { não é permitido nomes iguais}
        int I;
//        int 1a; { não é permitido iniciar com numeral }
//        int _1a; {  não é uma boa prática }
//        int $aq; { não é uma boa prática }
//        int espaco nao; { não pode ter espaços na variáveis}


        i = 30;

        final int j = 10;
//        Final é uma constante, não pode alterar valor
//        j = 15; { constante é imutavel }

        final int RESULTADO_FINAL = 30;
    }
}
