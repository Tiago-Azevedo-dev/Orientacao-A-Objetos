package Alura.Aula03.Desafios.Carro;
import Alura.Aula03.Desafios.Carro.Modelos.Carro;
import Alura.Aula03.Desafios.Carro.Modelos.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setModelo("Chevrolet Camaro");
        c1.setValorPrimeiroAno(100);
        c1.setValorSegundoAno(120);
        c1.setValorTerceiroAno(140);
        c1.exibeFichaTecnica();    
        ModeloCarro mc1 = new ModeloCarro();
        mc1.setModelo("Toyota Supra");
        mc1.setValorPrimeiroAno(100);
        mc1.setValorSegundoAno(140);
        mc1.setValorTerceiroAno(180);
        mc1.setPotencia(340);
        mc1.setVelocidadeMaxima(300);
        mc1.exibeFichaTecnica();
    }
}
