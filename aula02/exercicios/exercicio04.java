package aula02.exercicios;
import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args)   {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Valor de a:");
      float a = entrada.nextFloat();
      System.out.println("Valor de b:");
      float b = entrada.nextFloat();
      System.out.println("Valor de c:");
      float c = entrada.nextFloat();
      entrada.close();
      boolean x = a * a == (b * b + c * c);
      System.out.println(x);

    }
}