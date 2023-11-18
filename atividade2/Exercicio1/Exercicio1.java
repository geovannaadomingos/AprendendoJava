// Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".
package atividade2.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira um outro número:");
        double numero2 = scanner.nextDouble();

        String mensagem = "";

        if (numero1 > numero2) {
            mensagem = "O maior dos números é: ";
            if (numero1 % 1 == 0) {
                mensagem += (int) numero1; // Se for inteiro, converte para int
            } else {
                mensagem += numero1;
            }
        } else if (numero1 < numero2) {
            mensagem = "O maior dos números é: ";
            if (numero2 % 1 == 0) {
                mensagem += (int) numero2; // Se for inteiro, converte para int
            } else {
                mensagem += numero2;
            }
        } else {
            mensagem = "Os dois números são iguais";
        }

        System.out.println(mensagem);
    }
}