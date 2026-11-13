package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("O resultado da soma foi = "+ somar(num1, num2));
    }
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
}
