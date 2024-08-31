public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    public static void main(String[] args) {


        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        ReprodutorMusical.pesquisarMusica("Raul Seixas");

        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.atualizarPagina();
        NavegadorInternet.exibirPagina("WWW.GOOGLE.COM.BR");

        AparelhoTelefonico.atender();
        AparelhoTelefonico.ligar("00000000000");
        AparelhoTelefonico.iniciarCorreioVoz();

    }
}
