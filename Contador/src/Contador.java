import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O primeiro parâmetro deve ser maior que o primeiro!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {


        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        int i;
        for (i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número %d%n", i + 1);
        }
    }

    static class ParametrosInvalidosException extends Exception {

    }
}
