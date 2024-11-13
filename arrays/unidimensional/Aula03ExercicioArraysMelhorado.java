package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {
    public static void main(String[] args) {
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];
        String resultadoVetores = "";
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor do vetor 1, indice " + i + ": ");
            vetor1[i] = input.nextInt();
            System.out.print("Digite o valor do vetor2, indice " + i + ": ");
            vetor2[i] = input.nextInt();
            vetor3[i] = vetor1[i] * vetor2[i];
            resultadoVetores = resultadoVetores + vetor3[i]+ " ";
        }
        System.out.println(resultadoVetores);
    }
}
