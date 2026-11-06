package Aula5.exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] letras = {"a", "b", "c", "d", "e", "f"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letraDigitada = sc.nextLine();

        int posicao = -1;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(letraDigitada)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("A letra está na posição " + posicao);
        } else {
            System.out.println("A letra não está na lista.");
        }sc.close();
    }
}
