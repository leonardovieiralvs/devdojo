package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double soma = 0;
        double media = 0;
        double[] notas = new double[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            notas[i] = input.nextDouble();
            soma = soma + notas[i];
            media = soma / notas.length;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("A media das notas é de: "+ media);
    }
}
