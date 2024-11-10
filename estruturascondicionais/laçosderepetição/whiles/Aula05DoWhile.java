package academy.devdojo.estruturascondicionais.laçosderepetição.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um numero de 1 a 10: ");
            int num1 = input.nextInt();
            System.out.println("PLATER 2: Digite um numero de 1 a 10: ");
            int num2 = input.nextInt();
            System.out.println("Acertou "+ (num1 == num2));
            System.out.println("--------------------------------------");
            System.out.println("Dseja continuar? ");
            System.out.println("[1] SIM");
            System.out.println("[2] NAO");
            desejaContinuar = input.nextInt();
        } while (desejaContinuar == 1);
    }
}
