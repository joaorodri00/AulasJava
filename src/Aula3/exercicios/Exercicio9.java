package Aula3.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite em que horario do dia você trabalha:  ");
        int horario = sc.nextInt();

        if (horario >= 5 && horario <= 12){
            System.out.println("Você trabalha as " + horario + "h. No turno da MANHÃ!");
        }else if (horario >= 13 && horario <= 18){
            System.out.println("Você trabalha as " + horario + "h. No turno da TARDE!");
        }else if (horario >= 19 && horario <= 22){
            System.out.println("Você trabalha as " + horario + "h. No turno da NOITE!");
        }else if (horario >= 23 || horario <= 5){
            System.out.println("Você trabalha as " + horario + "h. No turno da MADRUGADA!" );
        }
        sc.close();
    }
}
