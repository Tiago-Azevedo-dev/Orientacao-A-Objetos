package aula02.exercicios;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int a = entrada.nextInt();
        System.out.println("Digite o outro valor:");
        int b = entrada.nextInt();
        entrada.close();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a ^ b = " + Math.pow(a, b));
    }
}