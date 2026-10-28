package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da sua venda: R$");
        double valorVenda = scanner.nextDouble();

        if (valorVenda < 1000.00) {
            double comissao = valorVenda + (valorVenda * 0.05);
            System.out.println("O valor total da venda (com comissão de 5%): R$" + comissao);
        } else if (valorVenda > 1000 && valorVenda < 5000) {
            double comissao = valorVenda + (valorVenda * 0.10);
            System.out.println("O valor total da venda (com comissão): R$" + comissao);
        }else if (valorVenda > 5000) {
            double comissao = valorVenda + (valorVenda * 0.15);
            System.out.println("O valor total da venda (com comissão): R$" + comissao);
        }else {
            System.out.println("O valor total da venda: R$");
        }
        scanner.close();
    }
}
