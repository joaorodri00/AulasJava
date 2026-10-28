package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7){
            System.out.println("Parabens você foi APROVADO!! SUA NOTA FOI: " + nota);
        } else if (nota > 4 && nota < 7) {
            System.out.println("Você está de RECUPERAÇÃO!! SUA NOTA FOI: " + nota);
        }else {
            System.out.println("Infelizmente você foi REPROVADO!! SUA NOTA FOI: " + nota);
        }
        scanner.close();
    }
}
