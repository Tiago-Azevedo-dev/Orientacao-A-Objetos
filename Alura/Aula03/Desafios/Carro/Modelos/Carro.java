package Alura.Aula03.Desafios.Carro.Modelos;
public class Carro {
    private String modelo;
    private double valorPrimeiroAno, valorSegundoAno, valorTerceiroAno;
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setValorPrimeiroAno(double valorPrimeiroAno) {
        this.valorPrimeiroAno = valorPrimeiroAno;
    }
    public double getValorPrimeiroAno() {
        return valorPrimeiroAno;
    }
    public void setValorSegundoAno(double valorSegundoAno) {
        this.valorSegundoAno = valorSegundoAno;
    }
    public double getValorSegundoAno() {
        return valorSegundoAno;
    }
    public void setValorTerceiroAno(double valorTerceiroAno) {
        this.valorTerceiroAno = valorTerceiroAno;
    }
    public double getValorTerceiroAno() {
        return valorTerceiroAno;
    }
    public double getMaiorValor() {
        if (getValorPrimeiroAno() > getValorSegundoAno() && getValorPrimeiroAno() > getValorTerceiroAno()) {
            return getValorPrimeiroAno();
        }
        else if (getValorSegundoAno() > getValorPrimeiroAno() && getValorSegundoAno() > getValorTerceiroAno()) {
            return getValorSegundoAno();
        }
        else {
            return getValorTerceiroAno();
        }
    }
    public double getMenorValor() {
        if (getValorPrimeiroAno() < getValorSegundoAno() && getValorPrimeiroAno() < getValorTerceiroAno()) {
            return getValorPrimeiroAno();
        }
        else if (getValorSegundoAno() < getValorPrimeiroAno() && getValorSegundoAno() < getValorTerceiroAno()) {
            return getValorSegundoAno();
        }
        else {
            return getValorTerceiroAno();
        }
    }
    public void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Maior preco nos ultimos 3 anos: " + getMaiorValor());
        System.out.println("Menor preco nos ultimos 3 anos: " + getMenorValor());
    }    

}