//  Desenvolva um algoritmo que receba um número number e informe se number é um número primo, ou não. A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

package atividade3.Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número qualquer:");
        int number = scanner.nextInt();

        boolean primo = (number > 1);

        for (int i = 2; i <= Math.sqrt(number) && primo; i++) {
            if (number % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(number + " é primo.");
        } else {
            System.out.println(number + " não é primo.");
        }
    }
}