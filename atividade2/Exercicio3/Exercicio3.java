// Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.
package atividade2.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        String mensagem = (numero % 2 == 0) ? " é par." : " é ímpar.";

        System.out.println(numero + mensagem);
    }
}
