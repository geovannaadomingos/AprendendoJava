//  Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre: 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá processar dois números inteiros por vez.

package atividade2.Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int escolha = scanner.nextInt();

        System.out.println("Insira um numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira outro numero:");
        int numero2 = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
