package Aula2.exercicios;
import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Idade: " + idade + " | Peso: " + peso + "kg | Altura: " + altura);
    }
}
