// Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.Dica: use import java.lang.Math; com a função pow

package atividade1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da base:");
        double base = scanner.nextDouble();

        System.out.println("Insira o número do expoente:");
        double expoente = scanner.nextDouble();

        if (base > 0 && expoente > 0) {
            // Verifica se ambos os números são maiores que zero

            double resultado = Math.pow(base, expoente);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Por favor, insira números maiores que zero.");
        }
    }
}