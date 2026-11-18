public class Musica {
    String titulo, artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes = 0;
    void exibirFichatecnica() {
        System.out.println("Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano: " + anoLancamento);
    }
    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }
    double getMedia() {
        return avaliacao / numAvaliacoes;
    }
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.artista = "Travis Scott";
        m1.titulo = "SICKO MODE";
        m1.anoLancamento = 2021;
        m1.avalia(9);
        m1.avalia(7.5);
        m1.avalia(10);
        double mediaAvaliacoes = m1.getMedia();
        m1.exibirFichatecnica();
        System.out.println("Avaliacao: " + mediaAvaliacoes);
    }
}