public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente,int senha) {
        super(cliente,senha);
    }

    public void imprimirExtrato(){
        super.imprimirExtrato();
        System.out.println("Corrente ====");
        super.imprimirResumoConta();
    }

}
