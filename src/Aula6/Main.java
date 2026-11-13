package Aula6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int lado = sc.nextInt();

        int areasDoQuadrado = calcularAreaDoQuadrado(lado);
        System.out.println("Area do quadrado = " + areasDoQuadrado);
    }

    public static int calcularAreaDoQuadrado(int lado){
        return lado * lado;
    }
}

