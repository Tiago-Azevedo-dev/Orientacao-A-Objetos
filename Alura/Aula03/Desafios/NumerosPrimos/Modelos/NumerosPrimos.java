package Alura.Aula03.Desafios.NumerosPrimos.Modelos;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int[] listarPrimos(int limite) {
        int quantidade = 0;
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) quantidade++;
        }
        int[] primos = new int[quantidade];
        int pos = 0;
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                primos[pos] = i;
                pos++;
            }
        }
        return primos;
    }
}