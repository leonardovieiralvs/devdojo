package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        double[] vetor1 = new double[9];
        double[] vetor2 = new double[9];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor do vetor 1, indice " + i + ": ");
            vetor1[i] = input.nextDouble();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o valor do vetor2, indice " + i + ": ");
            vetor2[i] = input.nextDouble();
        }
        for (int c = 0; c < 9; c++) {
            System.out.println(vetor1[c] * vetor2[c]);
        }
    }
}
