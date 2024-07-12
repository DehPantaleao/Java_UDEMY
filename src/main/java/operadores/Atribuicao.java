package operadores;

/*
= : Atribuição
+= : Atribuição de adição
-= : Atribuição de subtração
*= : Atribuição de multiplicação
/= : Atribuição de divisão
%= : Atribuição de módulo

o resultado de uma expressão de atribuição é o valor atribuído

 */

public class Atribuicao {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 7;
        int numero5 = 50;
        int numero6 = 71;

        numero1 = numero2;
        System.out.println("Atribuição: " + numero1);

        numero1 += numero2;
        System.out.println("Atribuição de adição: " + numero1);

        numero1 -= numero2;
        System.out.println("Atribuição de subtração: " + numero1);

        numero1 *= numero2;
        System.out.println("Atribuição de multiplicação: " + numero1);

        numero1 /= numero2;
        System.out.println("Atribuição de divisão: " + numero1);

        numero1 %= numero2;
        System.out.println("Atribuição de módulo: " + numero1);

    }
}
