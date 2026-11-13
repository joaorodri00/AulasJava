package Aula6.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Cº: ");
        double celsius = sc.nextDouble();
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println("A temperatura em Fahrenheit = " + fahrenheit);
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
