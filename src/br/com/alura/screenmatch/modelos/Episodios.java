package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificacao;

public class Episodios implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualicacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualicacoes() {
        return totalVisualicacoes;
    }

    public void setTotalVisualicacoes(int totalVisualicacoes) {
        this.totalVisualicacoes = totalVisualicacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualicacoes > 4){
            return 4;
        } else{
            return 2;
        }
    }
}
