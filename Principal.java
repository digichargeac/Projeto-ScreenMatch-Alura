import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.Screenmatch.modelos.Filme;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setTitulo("O poderoso chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme();

        outroFilme.setTitulo("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        Serie Lost = new Serie();

        Lost.setTitulo("Lost");
        Lost.setAnoLancamento(2000);
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

    }
}