package Tipos;

public class Tipos {
    public static void main(String[] args) {
        /* Tipos primitivos */
        // Inteiros: byte(8 bits), short(16 bits), int(32 bits), long(64 bits)
        byte a = 127;
        a = -128;
        short b = 32767;
        b = -32768;
        int c = 2147483647;
        c = -2147483648;
        long d = 9223372036854775807L;
        d = -9223372036854775808L;
        // Ponto flutuante: float(32 bits/7 casas decimais), float(64 bits/15 casas decimais)
        float m = 1.0f;
        double n = 1.0;
        // Caracter: char(16 bits)
        char x = 'p';
        // Lógico: boolean(true/false)
        boolean y = true || false;
        // String (NÃO É UM TIPO PRIMITIVO!!!)
        String z = "Loren ipsun";

        /* SAÍDA */
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
        System.out.printf("c = %d\n", c);
        System.out.printf("d = %d\n", d);
        System.out.printf("m = %7f\n", m);
        System.out.printf("n = %16f\n", n);
        System.out.printf("x = %c\n", x);
        System.out.printf("y = %b\n", y);
        System.out.printf("z = %s\n", z);
    }
}
