public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;
    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }
    public void setSaldo(double valor) {
        this.saldo = valor;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
}