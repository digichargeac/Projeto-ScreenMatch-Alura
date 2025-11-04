public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracaoEmMinutos();
    
    // }

    // public void inclui(Serie s) {
    //     this.tempoTotal += s.getDuracaoEmMinutos();
    
    // }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    
    }

    
}
