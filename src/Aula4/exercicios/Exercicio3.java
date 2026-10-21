package Aula4.exercicios;

import java.util.Scanner;
public class Exercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite apenas números inteiros maiores ou iguais a zero.");
        } else {
            long fatorial = 1;
            int contador = numero;

            if (numero > 0) {
                do {
                    fatorial *= contador;
                    contador--;
                } while (contador > 0);
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}
