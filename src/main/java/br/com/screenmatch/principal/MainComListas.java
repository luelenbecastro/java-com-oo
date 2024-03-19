package br.com.screenmatch.principal;

import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;
import br.com.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {

    public static void main(String[] args) {

    Filme filme = new Filme("As Branquelas", 2004);
    filme.avalia(10);
    Filme filme2 = new Filme("Minha irmã e Eu", 2024);
    filme2.avalia(10);
    Filme filme3 = new Filme("Velozes e Furiosos", 2018);
    filme3.avalia(5);
    Serie serie = new Serie("The Walking Dead", 2012);

    ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

        for(Titulo item: lista) {
            System.out.println(item);
            if(item instanceof Filme) {
                Filme filmee = (Filme) item;
                System.out.println("Classificação: " + filmee.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Joelma");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Lista de Titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano: " + lista );
    }
}
