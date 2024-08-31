public interface NavegadorInternet {

    static void exibirPagina(String url) {
        System.out.printf("Exibindo pagina: '%s'\n",url);
    }
    static void adicionarNovaAba() {
        System.out.print("Adicionado nova aba\n");
    }
    static void atualizarPagina() {
        System.out.print("Atualizando pagina do navegador\n");
    }

}
