import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");

        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");

        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");

        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor do seu saldo!");

        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência " +
                "é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);


    }
}