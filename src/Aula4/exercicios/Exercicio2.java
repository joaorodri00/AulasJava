package Aula4.exercicios;

public class Exercicio2 {
    static void main(String[] args) {
        int soma = 0;
        int numero = 1;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                soma += numero;
                System.out.println("Somando " + numero + " | Soma atual: " + soma);
            }
            numero++;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
