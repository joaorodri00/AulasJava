package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor total da sua compra: R$");
            double valorCompra = scanner.nextDouble();

        if (valorCompra > 100.00) {
            double valorDesconto = valorCompra - (valorCompra * 0.10);
            System.out.println("O valor total da compra (com desconto): R$" + valorDesconto);
        }else {
            System.out.println("O valor total da compra: R$" + valorCompra);
        }
        scanner.close();
    }
}
