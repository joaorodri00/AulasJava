package Aula5.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {

        double [] vetor = new double [4];
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite 4 notas (1 a 10): ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
            soma  += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("A media foi de: " + media);
    }
}
