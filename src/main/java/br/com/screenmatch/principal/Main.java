package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.model.Episodios;
import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Filme filme = new Filme("As Branquelas", 2004);

        filme.setDuracaoEmMinutos(110);

        filme.exibeFichaTecnica();
        filme.avalia(10);
        filme.avalia(9.5);
        filme.avalia(9.8);

        System.out.println(filme.getTotalDeAvaliacoes());

        System.out.println(filme.obterMedia());

        Serie serie = new Serie("The Walking Dead", 2012);
        serie.exibeFichaTecnica();
        serie.setTemporadas(11);
        serie.setEpisodiosPorTemporadas(16);
        serie.setMinutosPorEpisodios(56);
        System.out.println("Duração para maratonar TWD: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodios ep = new Episodios();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalVisualizacoes(5000);
        filtro.filtra(ep);

        Filme filme2 = new Filme("Minha irmã e Eu", 2024);

        filme2.setDuracaoEmMinutos(110);

        Filme filme3 = new Filme("Velozes e Furiosos", 2018);

        filme3.setDuracaoEmMinutos(110);

        ArrayList<Filme> listaFilme = new ArrayList<>();
        listaFilme.add(filme);
        listaFilme.add(filme2);
        listaFilme.add(filme3);

        System.out.println("Tamanho da lista " + listaFilme.size());
        System.out.println("Primeiro filme: " + listaFilme.get(0).getNome());
        System.out.println(listaFilme);
    }
}
