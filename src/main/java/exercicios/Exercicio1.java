package exercicios;

/*
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 *
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 *
 * Fórmula: MA = (n1 + n2 + n3) / 3
 *
 * Dica: Para testar, informe os números decimais com vírgula ao invés de ponto:
 * Ex: 7,0 7,0 7,0
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = leia.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média aritmética é: " + media);

    }
}
