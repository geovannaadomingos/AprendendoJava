package atividade2.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira um outro número:");
        double numero2 = scanner.nextDouble();

        if (numero1 == numero2) {
            double multiplicacao = numero1 * numero2;
            String resultado = (multiplicacao % 1 == 0) ? String.valueOf((int) multiplicacao)
                    : String.valueOf(multiplicacao);
            System.out.println("Multiplicação: " + resultado);
        } else if (numero1 > numero2) {
            double subtracao = numero1 - numero2;
            String resultado = (subtracao % 1 == 0) ? String.valueOf((int) subtracao) : String.valueOf(subtracao);
            System.out.println("Subtração: " + resultado);
        } else {
            double soma = numero1 + numero2;
            String resultado = (soma % 1 == 0) ? String.valueOf((int) soma) : String.valueOf(soma);
            System.out.println("Soma: " + resultado);
        }
    }
}
