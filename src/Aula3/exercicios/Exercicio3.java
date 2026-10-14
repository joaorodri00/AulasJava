package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Digite a categoria desejada: 
                1)ELETRÔNICOS
                2)ALIMENTICIOS
                3)VESTUARIO
                """);
        int cod = scanner.nextInt();

        switch (cod) {
            case 1:
                System.out.println("Este produto pertence a categoria: ELETRôNICOS");
                break;
            case 2:
                System.out.println("Este produto pertence a categoria: ALIMENTICIOS");
                break;
            case 3:
                System.out.println("Este produto pertence a categoria: VESTUARIO");
                break;
        }


    }
}
