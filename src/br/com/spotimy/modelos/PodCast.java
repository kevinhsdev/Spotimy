package br.com.spotimy.modelos;

public class PodCast extends Audio{
    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao(){
        if (getTotalCurtidas() > 700) {
            return 5;
        } else {
            return 3;
        }
    }

}
