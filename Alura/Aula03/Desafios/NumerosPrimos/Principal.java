package Alura.Aula03.Desafios.NumerosPrimos;

import Alura.Aula03.Desafios.NumerosPrimos.Modelos.GeradorPrimo;
import Alura.Aula03.Desafios.NumerosPrimos.Modelos.VerificadorPrimo;

public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo v1 = new VerificadorPrimo();
        System.out.println(v1.verificarSeEhPrimo(7));
        // opção 2: um laço, sem import
    for (int p : v1.listarPrimos(20)) {
        System.out.print(p + " ");
    }
        System.out.println();
        GeradorPrimo g1 = new GeradorPrimo();
        System.out.println(g1.gerarProximoPrimo(7));
    }
}