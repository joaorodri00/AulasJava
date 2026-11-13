package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        System.out.print("Digite mais outro numero: ");
        int num3 = sc.nextInt();

        System.out.println("A média das suas notas = " + calcularMedia(num1, num2, num3));
    }
    static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}