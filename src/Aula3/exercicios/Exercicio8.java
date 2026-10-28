package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi sua avaliação de desempenho (1 a 5): ");
        int avaliacao = sc.nextInt();

        if (avaliacao == 1) {
            System.out.println("Nota 1, Precisa melhorar!!");
        }else if (avaliacao == 2) {
            System.out.println("Nota 2, Abaixo da média!!");
        }else if (avaliacao == 3) {
            System.out.println("Nota 3, Esta na média!!");
        }else if (avaliacao == 4) {
            System.out.println("Nota 4, Acima da média!!");
        }else if (avaliacao == 5) {
            System.out.println("Nota 5, Exelente");
        }
        sc.close();
    }
}
