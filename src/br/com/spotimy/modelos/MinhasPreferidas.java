package br.com.spotimy.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 4) {
            System.out.println("Adicionando aos favoritos: " + audio.getTitulo());
        }
        else {
            System.out.println("Possui baixa classificação: " + audio.getTitulo());
        }
    }
}
