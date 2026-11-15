package Aula4.exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int n = 10; // Quantidade de números da sequência a exibir
        int t1 = 0;
        int t2 = 1;
        int contador = 1;

        System.out.println("Os primeiros " + n + " números da Sequência de Fibonacci são[cite: 4]:");

        // Laço 'while' para gerar e exibir a sequência[cite: 4]
        while (contador <= n) {
            System.out.print(t1 + " ");

            // Atualiza os valores para o próximo termo
            int proximo = t1 + t2;
            t1 = t2;
            t2 = proximo;

            contador++;
        }
    }
}
