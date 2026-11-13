package Aula6;

import java.util.Scanner;

public class Main2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("""
                Escreva seus dados pessoais:
                    Nome: """);
        String nome = sc.nextLine();
        System.out.printf("""
                    \tIdade: """);


        int idade = sc.nextInt();
        imprimirDadosPessoais(idade, nome);

    }
    public static void imprimirDadosPessoais(int idade, String nome){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
