package org.example;

public class Visualizador {
    private Imagem imagem;

    public Visualizador(Imagem imagem) {
        this.imagem = imagem;
    }

    public void exibirImagem() {
        imagem.exibir();
    }
}
