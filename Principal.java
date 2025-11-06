import java.util.ArrayList;

import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.Screenmatch.modelos.Filme;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);

        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        Serie Lost = new Serie("Lost", 2000);

        Lost.setTemporadas(6);
        Lost.setEpisodiosPorTemporada(17);
        Lost.setMinutosPorEpisodio(45);
            
      

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("A soma das avaliações é: " + meuFilme.getSomaAvaliacao());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações é: " + meuFilme.mediaAvaliacoes());
  

        Lost.exibeFichaTecnica();

        System.out.println("Tempo para maratonar Lost: " + Lost.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       
        

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(Lost);
        System.out.println("Tempo total de visualização: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNome("Pilot");
        episodio.setNumero(1);
        episodio.setSerie(Lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("O primeiro filme da minha lista é: " + listaDeFilmes.get(0).getTitulo());
        System.out.println(listaDeFilmes);

        

    }
}