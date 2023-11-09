// Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.Dica: use import java.lang.Math; com a função pow

package atividade1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double numero2 = scanner.nextDouble();

        double resultado = Math.pow(numero1, numero2);

        System.out.println("Resultado: " + resultado);
    }

}
