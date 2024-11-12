package academy.devdojo.estruturascondicionais.laçosderepetição.fors;

import java.util.Scanner;

public class Aula02Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual taboada você deseja saber? [1 a 10] ");
        int taboada = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(taboada + "x" + i + "=" + (taboada*i));
        }
    }
}