package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (vericarPar(numero)){
            System.out.println("O numero digitado é PAR");
        }else {
            System.out.println("O numero digitado é IMPAR");
        }
    }
    static boolean vericarPar(int numero){
        return numero % 2 == 0;

    }
}
