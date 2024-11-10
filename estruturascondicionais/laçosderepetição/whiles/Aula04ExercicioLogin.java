package academy.devdojo.estruturascondicionais.laçosderepetição.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login = "test";
        String senha = "test111";
        boolean exibirTelaLogin = true;
        while (exibirTelaLogin){
            System.out.println("Digite seu login :");
            String loginUsuario = input.next();
            System.out.println("Digite a sua senha: ");
            String senhaUsuario = input.next();
            if (loginUsuario.equals(login) && senhaUsuario.equals(senha)) {
                System.out.println("ACESSO CONCEDIDO!");
                exibirTelaLogin = false;
                break;
            }
                System.out.println("ACESSO NEGADO!");
        }
        System.out.println("PROGRAMA TERMINADO!");
    }
}
