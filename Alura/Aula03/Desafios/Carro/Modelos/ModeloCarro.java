package Alura.Aula03.Desafios.Carro.Modelos;

public class ModeloCarro extends Carro {
    private int potencia;
    private int velocidadeMaxima;

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Potencia: " + potencia + " hp");
        System.out.println("Velocidade maxima: " + velocidadeMaxima + " km/h");
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public int getPotencia() {
        return potencia;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}