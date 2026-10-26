package Aula2.exercicios;

public class Exercicio10 {
    static void main(String[] args) {

        short valorShort = 100;
        int valorInt = valorShort;
        byte valorByte = (byte) valorInt;

        System.out.println("Valor da variável short: " + valorShort);
        System.out.println("Valor da variável int (implícito): " + valorInt);
        System.out.println("Valor da variável byte (explícito): " + valorByte);
    }
}
