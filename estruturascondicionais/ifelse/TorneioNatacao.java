package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        if (idade < 10) {
            System.out.println("o competidor "+ nome + " participara da categoria infantil!");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("o competidor "+ nome + " participara da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("o competidor "+ nome + " participara da categoria pré adulto");
        } else {
            System.out.println("o competidor "+ nome + " participara da categoria adulto");
        }
    }
}
