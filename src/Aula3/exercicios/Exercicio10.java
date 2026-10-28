package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor em R$ que queira converter: ");
        double valor = sc.nextDouble();

        System.out.print("""
                Digite a conversão desejada: 
                1)DÓLAR
                2)EURO
                3)LIBRA
                """);

        int op = sc.nextInt();

        switch (op) {
            case 1:

        }
    }
}
