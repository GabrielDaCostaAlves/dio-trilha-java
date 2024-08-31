public interface AparelhoTelefonico {

    static void ligar(String numero) {
        System.out.printf("Ligando para o número: '%s'\n",numero);
    }
    static void atender() {
        System.out.print("Atendendo ligação\n");
    }
    static void iniciarCorreioVoz() {
        System.out.print("Iniciando correio de voz\n");
    }


}
