package br.com.uninove.videos;

public class Video implements AcoesVideo{

    private String titulo;
    private int mediaAvaliacao = 1;
    private int views = 0;
    private int curtidas = 0;
    private boolean reproduzindo = false;

    public Video() {}

    public Video(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(int avaliacao) {
        this.mediaAvaliacao = (int) ((this.mediaAvaliacao + avaliacao) / this.views);
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
}
