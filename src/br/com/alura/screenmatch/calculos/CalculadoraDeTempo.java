package br.com.alura.screenmatch.calculos;

import br.com.alura.screeenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void adicionaFilme(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void adicionaFilme(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void adicionaTitulo(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo.getClass());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
