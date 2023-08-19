public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;

    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Implementação dos métodos das interfaces
    public void tocar() {
        // Lógica para tocar música
    }

    public void pausar() {
        // Lógica para pausar música
    }

    public void selecionarMusica() {
        // Lógica para selecionar música
    }

    public void ligar() {
        // Lógica para ligar o telefone
    }

    public void atender() {
        // Lógica para atender chamadas
    }

    public void iniciarCorreioVoz() {
        // Lógica para iniciar correio de voz
    }

    public void exibirPagina() {
        // Lógica para exibir página da internet
    }

    public void adicionarNovaAba() {
        // Lógica para adicionar nova aba
    }

    public void atualizarPagina() {
        // Lógica para atualizar página
    }
}
