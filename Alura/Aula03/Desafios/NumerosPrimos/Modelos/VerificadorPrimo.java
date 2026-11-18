package Alura.Aula03.Desafios.NumerosPrimos.Modelos;

public class VerificadorPrimo extends NumerosPrimos {
    public String verificarSeEhPrimo(int n) {
        if (verificarPrimalidade(n)) {
            return n + " é primo";
        }
        return n + " não é primo";
    }
}