import java.util.ArrayList;
import java.util.List;

public class Iphone<playlist> implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementando os métodos das interfaces

    private boolean reproduzindo = false;
    private List<String> playlist = new ArrayList<>();
    private boolean chamadaAtiva = false;
    private String currentURL;

    public Iphone(String phoneNumber) {
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        if (!reproduzindo) {
            System.out.println("Iniciando reprodução de música...");
            reproduzindo = true;
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pausar() {
        if (reproduzindo) {
            System.out.println("Pausando a reprodução de música...");
            reproduzindo = false;
        } else {
            System.out.println("A reprodução de música já está pausada.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        playlist.add(musica);
        System.out.println("Música adicionada à playlist: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (!chamadaAtiva) {
            System.out.println("Ligando para o número: " + numero);
            chamadaAtiva = true;
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Atendendo chamada.");
            chamadaAtiva = false;
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        currentURL = url;
        System.out.println("Exibindo página da Internet: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (currentURL != null) {
            System.out.println("Atualizando a página atual: " + currentURL);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }
}
