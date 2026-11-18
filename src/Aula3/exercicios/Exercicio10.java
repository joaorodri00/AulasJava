package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor em R$ que queira converter: ");
        double real = sc.nextDouble();

        System.out.printf("""
                Digite a conversão desejada: 
                    1)DÓLAR
                    2)EURO
                    3)LIBRA
                """);


        int op = sc.nextInt();

        switch (op) {
            case 1:
                double dolar = 5.8;
                double conversaoDolar = real / dolar;
                System.out.print("A conversão do seu dinheiro para o Dolar foi US$" + conversaoDolar);
                break;

            case 2:
                double euro = 6.3;
                double conversaoEuro = real / euro;
                System.out.print("A conversão do seu dinheiro para o Euro foi EUR$" + conversaoEuro);
                break;

            case 3:
                double libra = 6.6;
                double conversaoLibra = real / libra;
                System.out.print("A conversão do seu dinheiro para o Euro foi EUR$" + conversaoLibra);
                break;
        }
    }
}
