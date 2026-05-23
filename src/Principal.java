import br.com.spotimy.modelos.MinhasPreferidas;
import br.com.spotimy.modelos.Musica;
import br.com.spotimy.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica musica1 = new Musica();

        musica1.setArtista("Michael Jackson");
        musica1.setTitulo("Beat It");
        musica1.setAlbum("Thriller");
        musica1.setDuracaoEmSegundos(258);
        musica1.setGenero("Pop");

        for (int i = 0; i < 5000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 2000; i++) {
            musica1.curtir();
        }

        IO.println();
        IO.println(musica1);
        IO.println("Nota: " + musica1.getClassificacao());

        IO.println();

        PodCast podCast1 = new PodCast();

        podCast1.setApresentador("Igor e Mítico");
        podCast1.setDescricao("Podcast de humor e entretenimento");
        podCast1.setTitulo("PodPah");
        podCast1.setDuracaoEmSegundos(3600);

        for (int i = 0; i < 1000; i++) {
            podCast1.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            podCast1.curtir();
        }

        IO.println(podCast1);
        IO.println("Nota: " + podCast1.getClassificacao());
        IO.println();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podCast1);
        IO.println();
    }
}
