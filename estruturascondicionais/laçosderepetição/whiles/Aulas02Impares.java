package academy.devdojo.estruturascondicionais.laçosderepetição.whiles;

import java.util.Scanner;

public class Aulas02Impares {
    public static void main(String[] args) {
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        while (contador < num) {
            contador++;
            if (contador % 2 != 0) {
                System.out.println(contador * num);
            }
        }
    }
}