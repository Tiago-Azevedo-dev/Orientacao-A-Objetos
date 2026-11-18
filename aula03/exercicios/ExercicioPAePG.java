package aula03.exercicios;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class ExercicioPAePG {
    public static void main(String[] args) {
     String[] opcoes = {
        "Progressao Aritmetica",
        "Progressao Geometrica"
     };
     int escolha = JOptionPane.showOptionDialog(
        null,
        "Qual progressao voce deseja?",
        "Escolha uma opcao",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
    );
    switch(escolha) {
        case 0: {
            float a1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o primeiro termo?"));
            float r = Float.parseFloat(JOptionPane.showInputDialog("Qual a razao da progressao?"));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos devo gerar?"));
            float[] valores = gerarTermosPA(a1, r, n);
            float an = termoGeralPA(a1, r, n);
            float somaPALoop = somaPALoop(a1, r, n);
            float somaPAFormula = somaPAFormula(a1, an, n);
            JOptionPane.showMessageDialog(null, Arrays.toString(valores) + "Termo geral da PA: " + an + "Soma geral por loop: " + somaPALoop + "Soma geral pela formula: " + somaPAFormula);
        }
        case 1: {
            float a1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o primeiro termo?"));
            float q = Float.parseFloat(JOptionPane.showInputDialog("Qual a razao da progressao?"));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos devo gerar?"));
            double[] valores = gerarTermosPG(a1, q, n);
            double an = termoGeralPG(a1, q, n);
            float somaPGLoop = somaPGLoop(a1, q, n);
            double somaPGFormula = somaPGFormula(a1, q, n);
            JOptionPane.showMessageDialog(null, Arrays.toString(valores) + "Termo geral da PG: " + an + "Soma geral por loop: " + somaPGLoop + "Soma geral pela formula: " + somaPGFormula);
        }
    }
    }
    public static float[] gerarTermosPA(float a1, float r, int n) {
        float[] valoresPA = new float[n];
        valoresPA[0] = a1;
        for(int i = 1; i < valoresPA.length; i++) {
          valoresPA[i] = valoresPA[i-1] + r;
        }
        return valoresPA;
    }
    public static float termoGeralPA(float a1,float r,int n) {
        float an = a1 + (n - 1) * r;
        return an;
    }
    public static float somaPALoop(float a1, float r, int n) {
        float soma = a1;
        for(int i = 2; i <= n; i++) {
            soma += a1 + (i - 1) * r;
        }
        return soma;
    }
    public static float somaPAFormula(float a1, float an, int n) {
        float somaPAFormula = n * (a1 + an) / 2;
        return somaPAFormula;
    }
    public static double[] gerarTermosPG(float a1, float q, int n) {
        double[] valoresPG = new double[n];
        valoresPG[0] = a1;
        for(int i = 1; i < valoresPG.length; i++) {
            valoresPG[i] = a1 * Math.pow(q, i);
        }
        return valoresPG;        
    }
    public static double termoGeralPG(float a1, float q, int n) {
        double an = a1 * Math.pow(q, (n-1));
        return an;
    }
    public static float somaPGLoop(float a1, float q, int n) {
        float soma = a1;
        for(int i = 2; i <= n; i++) {
           soma += a1 * Math.pow(q, i);
        }
        return soma;
    }
    public static double somaPGFormula(double a1, double q, int n) {
        double somaPGFormula;
        if(q == 1) {
            somaPGFormula = n * a1;
        }
        else {
            somaPGFormula = a1 * ((Math.pow(q, n)) - 1) / (q - 1);
        } 
        return somaPGFormula;  
        
    }
    
}





//tentar somaPALoop ou somaPGLoop pelo vetor//