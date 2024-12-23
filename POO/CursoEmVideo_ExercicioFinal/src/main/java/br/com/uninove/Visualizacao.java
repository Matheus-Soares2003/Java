package br.com.uninove;

import br.com.uninove.pessoas.Gafanhoto;
import br.com.uninove.videos.Video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao() {}

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    };

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcent) {
        int nota = (int) (10 * porcent / 100); //nota baseada na porcentagem de tempo vista do video;
        this.filme.setAvaliacao(nota);
    }
}
