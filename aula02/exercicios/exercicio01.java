package aula02.exercicios;
import java.util.Scanner;
public class exercicio01
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Oi, " + nome + "!");
        entrada.close();

    }
}