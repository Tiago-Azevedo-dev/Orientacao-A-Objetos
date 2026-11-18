package Alura.Aula03.Desafios.NumerosPrimos.Modelos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int n) {
        int candidato = n + 1;
        while (!verificarPrimalidade(candidato)) {
            candidato++;
        }
        return candidato;
    }
}