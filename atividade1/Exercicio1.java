// Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

package atividade1;

import java.util.Scanner;
//  classe Scanner do pacote java.util é usada para receber entrada do usuário.

public class Exercicio1 {
    public static void main(String[] args) {
        // declara o método principal da classe

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequência:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        int resultado = numero1 + numero2 + numero3 + numero4;

        System.out.println("Resultado da soma: " + resultado);
    }
}