package Aula4.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        boolean primo = numero > 1;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        sc.close();
    }
}
