package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula03ExercicioArraysMultidimensionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultadoDiagonalPrincipal = 1;
        int[][] matriz = new int [3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o numero a matriz ["+i+"]" + " e do indice ["+j+"]: ");
                matriz[i][j] = input.nextInt();
                if (i == j) {
                    resultadoDiagonalPrincipal = matriz[0][0] * matriz[1][1] * matriz[2][2];
//                  resultadoDiagonalPrincipal = resultadoDiagonalPrincipal * matriz[i][j]; ( DAR VALOR 1 A VARIAVEL)
                }
            }
        }
        System.out.println(resultadoDiagonalPrincipal);
    }
}
