import br.com.alura.screeenmatch.models.Filme;
import br.com.alura.screeenmatch.models.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(2);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Média de avaliações: %.2f%n", meuFilme.getMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Tempo para maratonar LOST: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.adicionaTitulo(meuFilme);
        calculadora.adicionaTitulo(outroFilme);
        calculadora.adicionaTitulo(lost);

        System.out.println(calculadora.getTempoTotal());
    }
}
