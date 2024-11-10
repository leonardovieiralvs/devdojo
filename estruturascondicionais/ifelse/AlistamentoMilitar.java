package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu sexo [M/F]: ");
        String sexo = input.next();
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("ALISTAMENTO OBRIGATORIO!");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("ALISTAMENTO NAO PERMITIDO!");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("VOCE DESEJA SERVIR O SERVICO MILITAR? ");
            String resp = input.next();
        } else {
            System.out.println("ALISTAMENTO NÃO PERMITIDOAAAA!");
        }
    }
}
