public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected int senha;

    public Conta(Cliente cliente,int senha){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
        this.senha = senha;
    }


    @Override
    public void sacar(double valor) {
        double saque = saldo - valor;
        if ( saque<0){
            System.out.println("Não há valor suficiente na conta.");
        }else {
            saldo -= valor;
        }


    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void imprimirExtrato(){
        System.out.print("==== Extrato da conta ");


    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirResumoConta() {
        System.out.printf("Titular: %s \n", this.cliente.getNome() );
        System.out.printf("Agencia: %d \n", this.agencia );
        System.out.printf("Conta: %d \n", this.numero);
        System.out.printf("Saldo: %.2f \n", this.saldo );
    }
}
