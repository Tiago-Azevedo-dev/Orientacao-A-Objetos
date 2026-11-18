package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;
    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
    public int getTempoTotal() {
        return tempoTotal;
    }
    //public void favoritar(Filme f) {
    //    tempoTotal += f.getDuracaoEmMinutos();
    //}
    //public void favoritar(Serie s) {
    //    tempoTotal += s.getDuracaoEmMinutos();
    //}

    public void favoritar(Titulo titulo) {
        System.out.println("Adicionando duracao em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
