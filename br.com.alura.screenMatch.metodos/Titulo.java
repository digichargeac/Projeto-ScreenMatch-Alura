public class Titulo {
    private String titulo;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int duracaoEmMinutos;
    private int totalDeAvaliacoes;
    private double mediaAvaliacoes;

    

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void exibeFichaTecnica() {
        System.out.printf("Título: %s \n", titulo);
        System.out.printf("Ano de Lançamento: %d \n", anoLancamento);
        System.out.println("Incluído no Plano: " + incluidoNoPlano + "\n");
        System.out.printf("A média das avaliações é: %.2f \n", mediaAvaliacoes);
        System.out.printf("Duração (minutos): %d minutos \n",duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaAvaliacao / totalDeAvaliacoes;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }


    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }


    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }


    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public double getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }
}
