public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("123-456-7890");

        // Teste os métodos da interface ReprodutorMusical
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        // Teste os métodos da interface AparelhoTelefonico
        iphone.ligar("987-654-3210");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Teste os métodos da interface NavegadorInternet
        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba("https://www.example2.com");
        iphone.atualizarPagina();
    }
}
