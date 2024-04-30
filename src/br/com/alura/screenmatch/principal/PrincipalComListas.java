package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("American Pie", 2005);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var meuFilme2 = new Filme("Velozes e Furiosos", 2008);
        meuFilme2.avalia(10);
        Serie prison = new Serie("Prison Break", 2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme2);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(prison);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                //Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordendando por ano: ");
        System.out.println(lista);



    }
}
