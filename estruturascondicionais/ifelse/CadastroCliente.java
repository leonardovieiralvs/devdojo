package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("C A D A S T R O");
        System.out.print("Digite o seu nome do usuario para cadastro: ");
        String nomeUsuario = input.next();
        if (nomeUsuario.equalsIgnoreCase("") || nomeUsuario.equalsIgnoreCase("admin") || nomeUsuario.equals("administrador")) {
            System.out.println ("Usuario Invalido!");
        } else {
            System.out.println(nomeUsuario + " Cadastrado com Sucesso!");
        }
    }

}
