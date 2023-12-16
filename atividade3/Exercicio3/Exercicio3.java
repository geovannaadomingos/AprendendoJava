//  Desenvolva um algoritmo que peça para o usuário inserir vários números inteiros. O algoritmo deverá contabilizar a quantidade de números positivos informados. Caso o usuário digite 0, o algoritmo deve mostrar quantidade contabilizada e encerrar.
package atividade3.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePositivos = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Insira um número qualquer ou digite 0 para encerrar:");
            int numero = scanner.nextInt();

            if (numero == 0) {
                continuar = false;
            } else if (numero > 0) {
                quantidadePositivos++;
            }
        }

        System.out.println("Quantidade de positivos: " + quantidadePositivos);
    }
}