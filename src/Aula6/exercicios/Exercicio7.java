package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite um numero: ");
        int num3 = sc.nextInt();

        System.out.println("O numero maior = " + maiorNumero(num1, num2, num3));
    }
    static int maiorNumero(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        }else if (num2 > num1 && num2 > num3) {
            return num2;
        }else {
            return num3;
        }
    }
}
