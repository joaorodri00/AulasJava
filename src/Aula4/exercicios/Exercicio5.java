package Aula4.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas = 0;

        for (int cont = 1; cont <= 5; cont++){
            System.out.print("Digite a " + cont + "ª nota: ");
            notas += sc.nextDouble();
        }
        double media = notas / 5;
        System.out.println("A média da suas notas foi: " + media);

        sc.close();
    }
}
