// Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

package atividade1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário:");
        double salario = scanner.nextDouble();
        // está declarado como double para permitir o armazenamento de valores decimais
        // nextDouble() é um método usado para ler um valor do tipo double do console.

        double novoSalario = salario * 1.25;

        System.out.println("Novo salário: " + novoSalario);
    }
}
