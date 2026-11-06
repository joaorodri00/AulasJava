package Aula5.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        boolean[] vetor = new boolean[8];
        Scanner sc = new Scanner(System.in);

        int contadorTrue = 0;

        System.out.println("Digite 8 valores booleans (true ou false): ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextBoolean();
            if (vetor[i]) {
                contadorTrue++;
            }
        }
        System.out.println("Quantidade de vetores True: " + contadorTrue);
    }
}
