package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Digite a operação desejada: 
                1)SOMA
                2)SUBTRAÇÃO
                3)DIVISÃO
                4)MULTIPLICAÇÃO
                """);

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.print("Digite o primeiro valor: ");
                int psoma = scanner.nextInt();
                System.out.print("Digite o segundo valor: ");
                int ssoma = scanner.nextInt();

                int resultado1 = psoma + ssoma;
                System.out.println("O resultado foi: " + resultado1);
                break;

            case 2:
                System.out.print("Digite o primeiro valor: ");
                int psubtracao = scanner.nextInt();
                System.out.print("Digite o segundo valor: ");
                int ssubtracao = scanner.nextInt();

                int resultado2 = psubtracao - ssubtracao;
                System.out.println("O resultado foi: " + resultado2);
                break;

            case 3:
                System.out.print("Digite o primeiro valor: ");
                int pdivisao = scanner.nextInt();
                System.out.print("Digite o segundo valor: ");
                int ssdivisao = scanner.nextInt();

                int resultado3 = pdivisao / ssdivisao;
                System.out.println("O resultado foi: " + resultado3);
                break;

            case 4:
                System.out.print("Digite o primeiro valor: ");
                int pmultiplicacao = scanner.nextInt();
                System.out.print("Digite o segundo valor: ");
                int ssmultiplicacao = scanner.nextInt();

                int resultado4 = pmultiplicacao * ssmultiplicacao;
                System.out.println("O resultado foi: " + resultado4);
                break;

            default:
                System.out.println("Erro! Opção Invalida");
        }
    }
}
