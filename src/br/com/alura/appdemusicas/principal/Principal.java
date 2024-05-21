package br.com.alura.appdemusicas.principal;

import br.com.alura.appdemusicas.modelos.Musica;
import br.com.alura.appdemusicas.modelos.Podcast;
import br.com.alura.appdemusicas.modelos.Audio;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Drama");
        minhaMusica.setCantor("Aespa");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0, i < 50; i++) {
            minhaMusica.curte();
        }

        minhaMusica.setTotalDeReproducoes(8);
        minhaMusica.setCurtidas(100);
        minhaMusica.setClassificacao(2);

        Audio meuPodcast = new Podcast();
        minhaMusica.setTitulo("Ei nerd");
        minhaMusica.setDuracaoEmSegundos(1000);
        minhaMusica.setTotalDeReproducoes(50);
        minhaMusica.setCurtidas(150);
        minhaMusica.setClassificacao(1);
    }
}