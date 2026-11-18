package aula02.exercicios;
import javax.swing.JOptionPane;
public class exercicio02 {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog("Digite o seu nome:");
         JOptionPane.showMessageDialog(null, "Ola, " + nome);

    }
}