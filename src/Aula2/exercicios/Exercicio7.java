package Aula2.exercicios;

public class Exercicio7 {
    static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = false;

        boolean resultadoAND = cond1 && cond3;
        boolean resultadoOR = cond1 || cond2;
        boolean resultadoMisto = (cond1 && cond2) || cond3;

        System.out.println("Resultado AND (cond1 && cond3) " + resultadoAND);
        System.out.println("Resultado OR (cond1 || cond2) " + resultadoOR);
        System.out.println("Resultado Misto ((cond1 && cond2) || cond3) " + resultadoMisto);
    }
}
