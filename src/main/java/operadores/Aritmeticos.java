package operadores;

public class Aritmeticos {

    /*
    + : Adição
    - : Subtração
    * : Multiplicação
    / : Divisão
    % : Módulo
    ++ : Incremento
    -- : Decremento
     */

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 2;
        double numero3 = 3.0;
        int numero4 = 7;
        int numero5 = 50;
        int numero6 = 71;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;

        System.out.println("Soma: " + (numero1 + numero2));  //"o mais é usado para concatenar"
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + numero3 * numero4);
        System.out.println("Divisão: " + numero5 / numero4); //divisão de inteiros
        System.out.println("Módulo: " + numero6 % numero4); //resto da divisão
    }
}
