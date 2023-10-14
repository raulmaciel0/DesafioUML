package entities;
import interfaces.NavegadorDeInternet;
import interfaces.AparelhoTelefonico;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    @Override
    public void ligar(String numeroDoContato) {
        System.out.println("Ligando para: " + numeroDoContato);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina..");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina..");
    }

    public void tocar(String nomeDaMusica) {
        System.out.println("Tocando: " + nomeDaMusica);

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void parar() {
        System.out.println("Parando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }

    @Override
    public void maisVolume() {
        System.out.println("Volume Up");
    }

    @Override
    public void menosVolume() {
        System.out.println("Volume Down");
    }
}

