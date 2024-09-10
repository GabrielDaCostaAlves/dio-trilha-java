import java.util.Scanner;

public class Main {
    static Banco banco = new Banco();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        System.out.println("Iniciando sistema do banco...");

        int opcao = -1;
        boolean b = true;

        while (b) {
            try {

                inicioFalar();
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 0:
                        System.out.println("Encerrando sistema do banco.\nObrigado por utilizar!");
                        b = false;
                        opcao = -1;
                        break;
                    case 1:
                        telaCriacao();
                        opcao = -1;
                        break;
                    case 2:
                        telaLogin();
                        opcao = -1;
                        break;
                    case 3:
                        inicioFalar();
                        opcao = -1;
                        break;

                    default:
                        System.out.println("Opção inválida! Para Falar menu novamente digite 3.");
                        opcao = -1;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número válido.");
            }
        }
    }

    private static void telaCriacao() {

        System.out.println("Qual tipo de conta? \n1 - Corrente\n2 - Poupança");
        String tipo = scanner.nextLine();

        if (Util.ehUmOuDois(tipo)) {
            System.out.println("Digite seu nome: ");
            String nomec = scanner.nextLine();

            if (!nomec.isEmpty() && Util.eNomeValido(nomec)) {
                Cliente cliente = new Cliente(nomec);
                System.out.println("Digite uma senha, somente numeros, entre 6 e 8 caracteres: ");
                int senha = Util.verificaSenha();
                if (senha != 0 && senha != 0) {
                    System.out.println("Repita a senha:");
                    int senha2 = Util.verificaSenha();
                    System.out.println(tipo);
                    if (senha == senha2) {
                        if (tipo.equals("1")) {
                            Conta cc = new ContaCorrente(cliente, senha);
                            Banco.criarConta(cc);
                        } else if (tipo.equals("2")) {
                            Conta cp = new ContaPoupanca(cliente, senha);
                            Banco.criarConta(cp);
                        }
                    } else {
                        System.out.println("Senhas nao conferem.");
                    }
                } else {
                    System.out.println("A senha nao segue o padrao solicitado.");
                }
            } else {
                System.out.println("Digite um nome valido, sem caracteres especiais ou numeros.");
            }
        } else {
            System.out.println("Digite uma escolha valida.");
        }

    }

    private static void telaLogin() {
        System.out.println("Digite o nome do titular da conta:");
        String nome = scanner.nextLine();
        if (!nome.isEmpty() && Util.eNomeValido(nome)) {
            try {
                System.out.println("Digite o numero da conta:");
                int conta = Util.converterParaInt();
                System.out.println("Digite a senha da conta:");
                int senha = Util.converterParaInt();
                banco.utilizarConta(nome, conta, senha);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite somente numeros.");
            }
        } else {
            System.out.println("Digite um nome valido, sem caracteres especiais ou numeros.");
        }


    }

    private static void inicioFalar() {

        String textoS = "Olá seja bem vindo!\n" +
                "1 - Criar uma conta. \n" +
                "2 - Acessar conta. \n" +
                "3 - Falar menu novamente.\n" +
                "0 - Para sair do sistema do banco.\n";
        System.out.print(textoS);
    }


}