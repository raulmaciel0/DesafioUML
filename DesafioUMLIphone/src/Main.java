import entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        // Metodos do Aparelho Telefonico
        iphone.ligar("(12)99164-2137");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // Metodos do Reprodutor Musical

        iphone.selecionarMusica();
        iphone.tocar("Green River - Creedence Clearwater Revival");
        iphone.menosVolume();
        iphone.maisVolume();
        iphone.pausar();
        iphone.parar();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // Metodos do Aparelho Telefonico

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

}