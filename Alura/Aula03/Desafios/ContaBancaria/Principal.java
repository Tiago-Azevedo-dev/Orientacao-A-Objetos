package Alura.Aula03.Desafios.ContaBancaria;
import Alura.Aula03.Desafios.ContaBancaria.Modelos.ContaBancaria;
import Alura.Aula03.Desafios.ContaBancaria.Modelos.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
    ContaBancaria cb1 = new ContaBancaria();
    ContaCorrente cc1 = new ContaCorrente();
    cb1.setSaldo(500);
    cb1.sacar(100);
    cc1.setSaldo(500);
    cb1.consultarSaldo();
    cc1.sacar(100);
    cc1.cobrarTarifaMensal();
    cc1.consultarSaldo();
    }
}
