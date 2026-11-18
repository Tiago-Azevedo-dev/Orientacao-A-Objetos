package br.com.alura.screenmatch.modelos;
public class Titulo{
    private String titulo;
    private int duracaoEmMinutos;
    private int anoDeLancamento;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    
    public String getTitulo() {
        return titulo;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + titulo);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Duracao em minutos: " + getDuracaoEmMinutos());
    }
    public void avalia(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. A avaliação deve estar entre 0 e 10.");
            return;
        }
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double getMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}