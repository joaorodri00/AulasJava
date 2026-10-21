package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora normal (R$): ");
        double valorHoraNormal = scanner.nextDouble();

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHoraNormal * 1.5;
            double totalHorasExtras = horasExtras * valorHoraExtra;

            System.out.printf("Valor pagado com sucesso: R$%.2f\n", totalHorasExtras);
        } else {
            System.out.println("\nO funcionário não realizou horas extras.");
        }
    }
}