package Aula4.exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int vezes = 10;
        int t1 = 0;
        int t2 = 1;
        int contador = 1;

        System.out.println("Os primeiros " + vezes + " números da Sequência de Fibonacci são:");

        while (contador <= vezes) {
            System.out.print(t1 + " ");

            int proximo = t1 + t2;
            t1 = t2;
            t2 = proximo;

            contador++;
        }
    }
}
