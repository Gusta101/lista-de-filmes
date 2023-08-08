import br.com.alura.screeenmatch.modelos.Episodio;
import br.com.alura.screeenmatch.modelos.Filme;
import br.com.alura.screeenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

//        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(2);
        meuFilme.avalia(10);
//        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
//        System.out.printf("Média de avaliações: %.2f%n", meuFilme.getMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

//        System.out.println("Tempo para maratonar LOST: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.adicionaTitulo(meuFilme);
        calculadora.adicionaTitulo(outroFilme);
        calculadora.adicionaTitulo(lost);

//        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSerie(lost);
        episodio.setNumero(1);
        episodio.setTotalVizualizacoes(150);

        filtro.filtra(episodio);
    }
}
