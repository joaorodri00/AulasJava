package Aula3.exercicios;
import java.util.Scanner;



// Verificação de Acesso à Sistema

public class Exercicio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        if (idade >= 18) {
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado (Permitido apenas Maiores de 18)");
        }
        System.out.println("Sua idade é: " + idade);

        scanner.close();
    }
}