// Desenvolva um algoritmo que receba dois números inteiros positivos A e B. Exiba na tela todos os números inteiros compreendidos entre A e B, excluindo os próprios A e B. Suponha que o usuário respeite o enunciado e insira valores válidos para A e B.

package atividade3.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor qualquer:");
        int A = scanner.nextInt();

        System.out.println("Insira um outro valor qualquer:");
        int B = scanner.nextInt();

        System.out.print("A série numérica entre os dois valores é: ");
        for (int i = A + 1; i < B; System.out.printf("%d ", i++));
    }
}
