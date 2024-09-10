import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public abstract class Util {
    static Scanner scan = new Scanner(System.in);
    public static boolean eNomeValido(String nome) {
        return nome.matches("[a-zA-ZÀ-ÿ\\s]+");
    }

    public static double converterParaDouble( ){

        String valor = scan.nextLine();
        if (!valor.matches("[0-9]+([,.][0-9]+)?")) {
            System.out.println("Entrada inválida: deve conter apenas números e separador decimal (ponto ou vírgula).");
            return 0;
        } else {

            valor = valor.replace(',', '.');

            try {

                double numero = Double.parseDouble(valor);


                DecimalFormat formatador = new DecimalFormat("#0.00");
                formatador.setParseBigDecimal(true);
                String valorFormatado = formatador.format(numero);


                return formatador.parse(valorFormatado).doubleValue();
            } catch (NumberFormatException | ParseException e) {

                System.out.println("Entrada inválida: não é um valor válido.");
                return 0;
            }
        }
    }
    public static boolean ehUmOuDois(String tipo) {
        return tipo != null && tipo.length() == 1 && (tipo.equals("1") || tipo.equals("2"));
    }

    public static int converterParaInt() {
        String valor = scan.nextLine();

        if (!valor.matches("\\d+")) {
            System.out.println("Entrada inválida: deve conter apenas números.");
            return 0;
        }else {

        try {

            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {

            System.out.println("Erro ao converter o valor: " + e.getMessage());
            return 0;
        }}
    }

    public static int verificaSenha() {
        String valor = scan.nextLine();

        // Verifica se o valor tem entre 6 e 8 caracteres numéricos
        if (!valor.matches("\\d{6,8}")) {
            System.out.println("Entrada inválida: deve conter entre 6 e 8 caracteres numéricos.");
            return 0;
        }

        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o valor: " + e.getMessage());
            return 0;
        }
    }
}
