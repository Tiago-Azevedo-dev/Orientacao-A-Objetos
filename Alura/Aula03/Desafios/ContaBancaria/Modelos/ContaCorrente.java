package Alura.Aula03.Desafios.ContaBancaria.Modelos;
public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 100;
    public void cobrarTarifaMensal() {
        this.saldo -= tarifaMensal;
    }
}