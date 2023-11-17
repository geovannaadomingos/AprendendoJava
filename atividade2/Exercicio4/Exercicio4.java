// Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais. Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo. Caso contrário, mostre a soma entre os dois.

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
            System.out.println("Multiplicação: " + (numero1 * numero2));
        } else if (numero1 > numero2) {
            System.out.println("Subtração: " + (numero1 - numero2));
        } else {
            System.out.println("Soma: " + (numero1 + numero2));
        }
    }
}
