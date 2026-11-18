package Aula2.exercicios;

public class
Exercicio9 {
    static void main(String[] args) {
        float valorFloat = 8.90f;

        long valorLong = (long) valorFloat;

        double valorDouble = valorLong;

        System.out.println("Valor da variável float: " + valorFloat);
        System.out.println("Valor da variável long (explícito): " + valorLong);
        System.out.println("Valor da variável double (implícito): " + valorDouble);
    }
}
