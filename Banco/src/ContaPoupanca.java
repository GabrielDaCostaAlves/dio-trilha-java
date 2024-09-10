public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int senha) {
        super(cliente,senha);
    }

    public void imprimirExtrato(){
        super.imprimirExtrato();
        System.out.println("Poupança ====");
        super.imprimirResumoConta();

    }

}
