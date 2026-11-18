package Aula4.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;

        do {
            System.out.print("Digite uma nota: ");
            nota = sc.nextDouble();
        } while (nota >= 0 && nota <= 10);
        System.out.print("Nota Invalida! O programa foi encerrado!");
    }
}
