package Desafio;

import java.util.Scanner;

public class Desafio_Final {

    static String[][] usuarios = new String[100][2];
    static int quantUsuarios = 0;
    static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        int op = 0;

        while (op != 5) {
            System.out.print("""
                    
                    Digite a categoria desejada:
                    1) Cadastrar Usuário
                    2) Consultar Usuários
                    3) Atualizar Usuário
                    4) Deletar Usuário
                    5) Sair
                    Opção:""");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    consultarUsuarios();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("\nEncerrando o sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
    }

    // 1 cadastrar usuario
    public static void cadastrarUsuario() {
        System.out.println("\n--- Cadastro de Usuário ---");

        if (quantUsuarios >= usuarios.length) {
            System.out.println("Erro: Limite máximo de usuários atingido!");
            return;
        }

        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o E-mail: ");
        String email = sc.nextLine();

        usuarios[quantUsuarios][0] = nome;
        usuarios[quantUsuarios][1] = email;
        quantUsuarios++;

        System.out.println("Usuário cadastrado com sucesso!");
    }

    // 2 consultar usuario
    public static void consultarUsuarios() {
        System.out.println("\n--- Lista de Usuários Cadastrados ---");

        if (quantUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado no momento.");
            return;
        }

        System.out.println("NOME | E-MAIL");
        System.out.println("------------------------------------");

        for (int i = 0; i < quantUsuarios; i++) {
            System.out.println(usuarios[i][0] + " | " + usuarios[i][1]);
        }
    }

    // 3 atualizar usuario
    public static void atualizarUsuario() {
        System.out.println("\n--- Atualizar Usuário ---");

        consultarUsuarios();
        if (quantUsuarios == 0) return;

        System.out.print("\nDigite o Nome do usuário que deseja atualizar: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < quantUsuarios; i++) {
            if (usuarios[i][0].equalsIgnoreCase(nomeBusca)) {
                System.out.print("Digite o novo Nome (atual: " + usuarios[i][0] + "): ");
                usuarios[i][0] = sc.nextLine();

                System.out.print("Digite o novo E-mail (atual: " + usuarios[i][1] + "): ");
                usuarios[i][1] = sc.nextLine();

                System.out.println("Usuário atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuário \"" + nomeBusca + "\" não encontrado.");
        }
    }

    // 4 deletar usuario
    public static void deletarUsuario() {
        System.out.println("\n--- Deletar Usuário ---");

        consultarUsuarios();
        if (quantUsuarios == 0) return;

        System.out.print("\nDigite o Nome do usuário que deseja deletar: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < quantUsuarios; i++) {
            if (usuarios[i][0].equalsIgnoreCase(nomeBusca)) {
                usuarios[i] = usuarios[quantUsuarios - 1];
                usuarios[quantUsuarios - 1] = new String[2];
                quantUsuarios--;

                System.out.println("Usuário deletado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuário \"" + nomeBusca + "\" não encontrado.");
        }
    }
}