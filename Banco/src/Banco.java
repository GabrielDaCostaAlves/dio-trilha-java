import java.util.*;


public class Banco {
    static Scanner scan = new Scanner(System.in);
    private static final String  NOME_DO_BANCO = "Teste Banco";
    private String nome;
    private static List<Conta> contas;

    public Banco() {
        this.nome = NOME_DO_BANCO;
        if (contas == null) {
            contas = new ArrayList<>();
        }
    }

    public String getNome() {
        return nome;
    }

    public void utilizarConta(String nome, int conta, int senha) {

        Conta nConta = localizarConta(conta);



        if (contas != null && nConta != null && nConta.cliente.getNome().equals(nome) ) {
            if (nConta.senha ==senha) {

                System.out.printf("A conta foi localizada: %d\n", nConta.numero);

                int opcao = -1;
                String textoUtilizando = "==== Menu da conta ====\n" +
                        "1 - Extrato simples. \n" +
                        "2 - Saque.\n" +
                        "3 - Transferencia.\n" +
                        "4 - Deposito.\n" +
                        "0 - Menu anterior.\n";

                boolean retorno = true;
                while (retorno) {
                    System.out.println(textoUtilizando);
                    opcao = Integer.parseInt(scan.nextLine());
                    switch (opcao) {
                        case 0:
                            System.out.println("Retornando.");
                            retorno = false;
                            break;
                        case 1:
                            telaExtrato(nConta);
                            break;
                        case 2:
                            telaSaque(nConta);
                            break;
                        case 3:
                            telaTransferir(nConta);
                            break;
                        case 4:
                            telaDeposito(nConta);
                            System.out.println("Deposito.");
                            break;


                    }
                }

            }else {
                System.out.println("Senha errada.");
            }
        } else {
            System.out.println("A conta não existe.");
        }
    }

    private void telaDeposito(Conta nConta) {

        System.out.println("Saque:\n" +
                "Qual o valor que voce quer depositar?");

        double valorDeposito = Util.converterParaDouble();
        if (valorDeposito != 0) {
            nConta.depositar(valorDeposito);
        } else {
            System.out.println("Digite um valor valido.");
        }
    }


    private void telaExtrato(Conta nConta) {
        System.out.println("Extrato simples:\n");
        nConta.imprimirExtrato();
    }

    private void telaSaque(Conta nConta) {
        System.out.println("Saque:\n" +
                "Qual o valor que voce quer sacar?");

        double valorSaque = Util.converterParaDouble();
        if (valorSaque != 0) {
            nConta.sacar(valorSaque);
        } else {
            System.out.println("Digite um valor valido.");
        }
    }

    private void telaTransferir(Conta nConta) {
        System.out.println("Transferencia:\n");
        System.out.println("Qual o valor que deseja transferir?");

        double valorTransferencia = Util.converterParaDouble();
        System.out.println("Para qual conta transferir?");

        int numeroConta = Util.converterParaInt();
        Conta contaTransferencia = localizarConta(numeroConta);
        if (contaTransferencia != null && valorTransferencia <= 0) {
            nConta.transferir(valorTransferencia, contaTransferencia);
        } else {
            System.out.printf("Conta %d informada não existe. Ou valor incorreto.\n", numeroConta);
        }
    }

    public static void criarConta(Conta c) {
        if (contas == null) {
            contas = new ArrayList<>();
        }
        contas.add(c);
        System.out.println("Conta criada com sucesso!");
        System.out.printf("Numero da conta: %d \n", c.numero);


    }

    public Conta localizarConta(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}
