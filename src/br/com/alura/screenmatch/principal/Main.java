package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("American Pie", 2005);
        //meuFilme.setNome("American Pie");
        //meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

        Serie prison = new Serie("Prison Break", 2005);
        //prison.setNome("Prison Break");
        prison.setAnoDeLancamento(2005);
        prison.exibeFichaTecnica();
        prison.setTemporadas(5);
        prison.setEpisodiosPorTemporada(20);
        prison.setMinutosPorEpisodios(45);
        System.out.println("Duração da série completa: " + prison.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Total de avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(prison);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(prison);
        episodios.setTotalVisualicacoes(0);
        filtro.filtra(episodios);

        var meuFilme2 = new Filme("Velozes e Furiosos", 2005);
        //meuFilme2.setNome("Velozes e Furiosos");
        //meuFilme2.setAnoDeLancamento(2005);
        meuFilme2.setDuracaoEmMinutos(180);
        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(10);
        System.out.println("Total de avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("ToString do Filme " + listaDeFilmes.get(0).toString());
    }
}