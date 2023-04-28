package org.example;

public class VisualizadorTest {
    public void testVisualizador() {
        ImagemExistente imagemExistente = new ImagemExistente();
        Imagem imagem = new ImagemExistenteAdapter(imagemExistente);
        Visualizador visualizador = new Visualizador(imagem);

        visualizador.exibirImagem();
        assertEquals(1, 1)

    }
}
