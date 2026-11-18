package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme StarWars = new Filme();
        StarWars.setTitulo("Star Wars: Uma nova esperança");
        StarWars.setAnoDeLancamento(1984);
        StarWars.setIncluidoNoPlano(true);
        StarWars.setDuracaoEmMinutos(120);
        StarWars.setDiretor("George Lucas");
        StarWars.avalia(7);
        StarWars.avalia(10);
        StarWars.avalia(9);
        StarWars.exibeFichaTecnica();
        double media = StarWars.getMedia();
        System.out.println("Avaliacao: " + media);

        Serie CloneWars = new Serie();
        CloneWars.setTitulo("Star Wars: Clone Wars");
        CloneWars.setAnoDeLancamento(2014);
        CloneWars.setEpisodiosPorTemporada(26);
        CloneWars.setTemporadas(10);
        CloneWars.setIncluidoNoPlano(true);
        CloneWars.setMinutosPorEpisodio(23);
        CloneWars.avalia(10);
        CloneWars.avalia(7);
        CloneWars.avalia(8);
        CloneWars.exibeFichaTecnica();
        System.out.println("Avaliação: " + CloneWars.getMedia());
        System.out.println("Duração para maratonar Star Wars: Clone Wars: " + CloneWars.getDuracaoEmMinutos() + " minutos");
        Filme HarryPotter = new Filme();
        HarryPotter.setTitulo("Harry Potter e a Pedra Filosofal");
        HarryPotter.setAnoDeLancamento(2007);
        HarryPotter.setDuracaoEmMinutos(100);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.favoritar(StarWars);
        calculadora.favoritar(HarryPotter);
        calculadora.favoritar(CloneWars);
        System.out.println(calculadora.getTempoTotal());
        
    }
}