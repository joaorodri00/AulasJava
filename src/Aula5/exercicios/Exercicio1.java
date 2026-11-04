package Aula5.exercicios;

public class Exercicio1 {
    static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int soma = 0;
        for(int numero : numeros){
            soma += numero;
            System.out.println(soma);
        }
        System.out.println("A soma total dos vetores foi: " + soma);
    }
}