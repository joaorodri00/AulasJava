package Aula5.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        String [] nomes = {"João", "Pedro", "Negro"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome desejado: ");
        String nome = sc.nextLine();
        String mensagem = "";

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nome)) {
                mensagem = nomes[i] + " está na lista.";
                break;
            }
            mensagem = "O nome não está na lista.";
        }
        System.out.println(mensagem);
    }
}