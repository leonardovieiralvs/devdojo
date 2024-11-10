package academy.devdojo.estruturascondicionais.laçosderepetição.whiles;

import java.util.Scanner;

public class Aula03Imposto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("[1] CALCULAR IMPOSTO ");
            System.out.println("[2] DEPOSITAR SALARIO");
            System.out.println("[3] SAIR");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("CALCULAR IMPOSTO...");
            } else if (opcao == 2) {
                System.out.println("DEPOSITAR SALARIO...");
            } else {
                System.out.println("SAINDO...");
            }
        }
    }
}