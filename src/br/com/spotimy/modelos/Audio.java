package br.com.spotimy.modelos;

public class Audio {
    private String titulo;
    private double duracaoEmSegundos;
    private int reproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(double duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        totalCurtidas++;
    }

    public void reproduzir(){
        reproducoes++;
    }

    public String toString(){
        return titulo +
                " - " +
                duracaoEmSegundos +
                "s - " +
                reproducoes +
                " reproduções - " +
                totalCurtidas +
                " curtidas";
    }

}
