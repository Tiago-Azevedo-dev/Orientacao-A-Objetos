import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraProgressoes {
    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final double EPSILON = 1e-9;

    public static double termoGeralPA(double a1, double r, int n) {
        return a1 + (n - 1) * r;
    }

    public static double termoGeralPG(double a1, double q, int n) {
        return a1 * Math.pow(q, n - 1);
    }

    public static double somaPA(double a1, double r, int n) {
        double an = termoGeralPA(a1, r, n);
        return n * (a1 + an) / 2.0;
    }

    public static double somaPG(double a1, double q, int n) {
        if (Double.compare(q, 1.0) == 0) {
            return n * a1;
        }
        return a1 * (Math.pow(q, n) - 1.0) / (q - 1.0);
    }

    public static List<Double> gerarTermosPA(double a1, double r, int n) {
        List<Double> termos = new ArrayList<>();
        for (int indice = 1; indice <= n; indice++) {
            termos.add(termoGeralPA(a1, r, indice));
        }
        return termos;
    }

    public static List<Double> gerarTermosPG(double a1, double q, int n) {
        List<Double> termos = new ArrayList<>();
        for (int indice = 1; indice <= n; indice++) {
            termos.add(termoGeralPG(a1, q, indice));
        }
        return termos;
    }

    public static double somaPorLaco(List<Double> termos) {
        double acumulador = 0.0;
        for (double termo : termos) {
            acumulador += termo;
        }
        return acumulador;
    }

    public static boolean quaseIguais(double valor1, double valor2) {
        double escala = Math.max(1.0,
                Math.max(Math.abs(valor1), Math.abs(valor2)));
        return Math.abs(valor1 - valor2) <= EPSILON * escala;
    }

    public static String formatarNumero(double valor) {
        if (quaseIguais(valor, Math.rint(valor))) {
            return String.format(Locale.US, "%.0f", valor);
        }
        return String.format(Locale.US, "%.2f", valor);
    }

    public static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = ENTRADA.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(texto);
            } catch (NumberFormatException erro) {
                System.out.println("Valor invalido. Digite um numero, por exemplo 3 ou 2.5.");
            }
        }
    }

    public static int lerInteiroPositivo(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = ENTRADA.nextLine().trim();
            try {
                int valor = Integer.parseInt(texto);
                if (valor >= 1) {
                    return valor;
                }
                System.out.println("Digite um inteiro maior ou igual a 1.");
            } catch (NumberFormatException erro) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
            }
        }
    }

    public static int lerOpcao() {
        while (true) {
            System.out.println("Escolha o tipo de progressao:");
            System.out.println("1 - Progressao Aritmetica (PA)");
            System.out.println("2 - Progressao Geometrica (PG)");
            System.out.print("> ");
            String texto = ENTRADA.nextLine().trim();
            try {
                int opcao = Integer.parseInt(texto);
                if (opcao == 1 || opcao == 2) {
                    return opcao;
                }
                System.out.println("Escolha somente 1 ou 2.\n");
            } catch (NumberFormatException erro) {
                System.out.println("Opcao invalida. Digite 1 ou 2.\n");
            }
        }
    }

    public static boolean desejaContinuar() {
        while (true) {
            System.out.print("Deseja calcular outra progressao? (s/n): ");
            String resposta = ENTRADA.nextLine().trim();
            if (resposta.equalsIgnoreCase("s")) {
                return true;
            }
            if (resposta.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Responda com s ou n.");
        }
    }

    public static void exibirTermos(List<Double> termos) {
        System.out.println("\n--- Termos gerados ---");
        for (int i = 0; i < termos.size(); i++) {
            System.out.printf("a%d = %s%n", i + 1,
                    formatarNumero(termos.get(i)));
        }
    }

    public static void exibirResultados(
            List<Double> termos, double ultimoTermo, double somaFormula) {
        double somaLaco = somaPorLaco(termos);
        exibirTermos(termos);
        System.out.println("\nUltimo termo: " + formatarNumero(ultimoTermo));
        System.out.println("Soma por laco: " + formatarNumero(somaLaco));
        System.out.println("Soma por formula: " + formatarNumero(somaFormula));
        System.out.println("Resultados conferem? "
                + (quaseIguais(somaLaco, somaFormula) ? "sim" : "nao"));
    }

    public static void processarPA() {
        System.out.println("\n--- Dados da Progressao Aritmetica ---");
        double a1 = lerDouble("Primeiro termo (a1): ");
        double r = lerDouble("Razao (r): ");
        int n = lerInteiroPositivo("Numero de termos (n): ");

        List<Double> termos = gerarTermosPA(a1, r, n);
        double ultimoTermo = termoGeralPA(a1, r, n);
        double somaFormula = somaPA(a1, r, n);
        exibirResultados(termos, ultimoTermo, somaFormula);
    }

    public static void processarPG() {
        System.out.println("\n--- Dados da Progressao Geometrica ---");
        double a1 = lerDouble("Primeiro termo (a1): ");
        double q = lerDouble("Razao (q): ");
        int n = lerInteiroPositivo("Numero de termos (n): ");

        List<Double> termos = gerarTermosPG(a1, q, n);
        double ultimoTermo = termoGeralPG(a1, q, n);
        double somaFormula = somaPG(a1, q, n);
        exibirResultados(termos, ultimoTermo, somaFormula);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        boolean continuar;

        do {
            int opcao = lerOpcao();
            if (opcao == 1) {
                processarPA();
            } else {
                processarPG();
            }
            continuar = desejaContinuar();
            System.out.println();
        } while (continuar);

        ENTRADA.close();
        System.out.println("Programa encerrado.");
    }
}
