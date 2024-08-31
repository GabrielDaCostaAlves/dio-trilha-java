public interface ReprodutorMusical {

    static void tocar() {
        System.out.print("Tocando\n");
    }

    static void pausar() {
        System.out.print("Pausando\n");
    }

    static void pesquisarMusica(String musica) {
        System.out.printf("Selecionado musica %s\n", musica);
    }
}
