package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner dias = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int week = dias.nextInt();
        if (week == 1) {
            System.out.println("Segunda-Feira");
        } else if (week == 2) {
            System.out.println("Terça-Feira");
        } else if (week == 3) {
            System.out.println("Quarta-Feira");
        } else if (week == 4) {
            System.out.println("Quinta-Feira");
        } else if (week == 5) {
            System.out.println("Sexta-Feira");
        } else if (week == 6) {
            System.out.println("Sabado");
        } else {
            System.out.println("Domingo");
        }
    }
}   