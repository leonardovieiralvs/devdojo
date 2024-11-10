package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero a qual o seu banco corresponde: ");
        System.out.println("[1] CONTA POUPANÇA");
        System.out.println("[2] CONTA CORRENTE");
        System.out.println("[3] CONTA INVESTIMENTO");
        int banco = input.nextInt();
        switch (banco) {
            case 1:
                System.out.println("CONTA POUPANCA: JUROS 0.05%");
                break;
            case 2:
                System.out.println("CONTA CORRENTE: JUROS 0.02%");
                break;
            case 3:
                System.out.println("CONTA INVESTIMENTO: JUROS 0.1%");
                break;
            default:
                System.out.println("BANCO INVALIDO!");
                break;
        }
        System.out.println("FIM DO PROGRAMA!");
    }
}
