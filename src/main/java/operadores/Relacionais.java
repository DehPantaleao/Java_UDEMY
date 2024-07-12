package operadores;

/*
== : Igual a
!= : Diferente de
> : Maior que
< : Menor que
>= : Maior ou igual que
<= : Menor ou igual que

o resultado de uma expressão relacional é sempre um valor booleano
o = é um operador de atribuição já o == é um operador relacional
 */

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 7;
        int numero5 = 50;
        int numero6 = 71;

        System.out.println("Igual a: " + (numero1 == numero3));
        System.out.println("Diferente de: " + (numero1 != numero2));
        System.out.println("Maior que: " + (numero4 > numero5));
        System.out.println("Menor que: " + (numero2 < numero6));
        System.out.println("Maior ou igual que: " + (numero6 >= numero5));
        System.out.println("Menor ou igual que: " + (numero1 <= numero2));
    }
}
