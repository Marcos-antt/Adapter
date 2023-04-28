package org.example;

public class ImagemExistenteAdapter implements Imagem{
    private ImagemExistente imagemExistente;

    public ImagemExistenteAdapter(ImagemExistente imagemExistente) {
        this.imagemExistente = imagemExistente;
    }

    @Override
    public void exibir() {
        imagemExistente.mostrar();
    }
}