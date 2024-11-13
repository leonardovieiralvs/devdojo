package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int [2][3];
        arrayMult1[0][0] = 10;
        arrayMult1[0][1] = 31;
        arrayMult1[0][2] = 11;
        arrayMult1[1][0] = 43;
        arrayMult1[1][1] = 44;
        arrayMult1[1][2] = 55;
        System.out.println(arrayMult1[0][0]);
        System.out.println(arrayMult1[0][1]);
        System.out.println(arrayMult1[0][2]);
        System.out.println(arrayMult1[1][0]);
        System.out.println(arrayMult1[1][1]);
        System.out.println(arrayMult1[1][2]);
    }
}
