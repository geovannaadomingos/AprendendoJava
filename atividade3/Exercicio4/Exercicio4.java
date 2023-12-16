// Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos A e B, no qual A deve ser menor que B (supõe-se que o usuário irá respeitar esse enunciado). O algoritmo deve mostrar, na tela, todos os números ímpares compreendidos entre A e B (inclusive).

package atividade3.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor qualquer:");
        int A = scanner.nextInt();

        System.out.println("Insira um outro valor qualquer:");
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.println("No intervalo entre os valores inseridos, esse valor é impar: " + i);
            }
        }
    }
}