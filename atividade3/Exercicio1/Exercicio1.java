// Desenvolva um algoritmo que some todos os números inteiros compreendidos entre 1 e 10 (inclusive).
package atividade3.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        int somatorio = 0;

        for (int i = 1; i <= 10; somatorio += i, i++);

        System.out.println("Resultado do somatório de 1 até 10: " + somatorio);
    }
}