package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("O dobro de " + num1 + " = " + calcularDobroDoNumero(num1));
    }
    public static int calcularDobroDoNumero(int num1){
        return num1 * 2;
    }
}
