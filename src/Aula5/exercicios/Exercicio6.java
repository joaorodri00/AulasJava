package Aula5.exercicios;


import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        int [][] matriz = new int [2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os valores da matriz: ");
        int contador = 0;

        int soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                contador++;
                System.out.print("Valor " + (contador)+": ");
                matriz[l][c] = sc.nextInt();
                soma += matriz[l][c];
            }
        }
        System.out.println("A soma da matriz é de: " + soma);

    }
}
