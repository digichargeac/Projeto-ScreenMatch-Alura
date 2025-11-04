public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Pode ser uma boa opção.");
        }
        else {
            System.out.println("Talvez não seja uma boa escolha.");
        }
    }
}