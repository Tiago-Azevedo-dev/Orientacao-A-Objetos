package Alura.Aula03.Desafios.ContaBancaria.Modelos;
public class ContaBancaria {
    protected double saldo;
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }
}