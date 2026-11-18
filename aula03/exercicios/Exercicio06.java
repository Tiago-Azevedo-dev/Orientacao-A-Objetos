package aula03.exercicios;
import java.util.Scanner;
public class Exercicio06{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        int[] numeros;
        int qtdValores, qtdPositivos, qtdNegativos, qtdNulos, qtdPares, qtdImpares;
        float media;
        qtdValores = lerInteiro("Digite a quantidade de valores: ");
        numeros = preencherVetor(qtdValores);
        media = calcularMedia(numeros);
        qtdPositivos = contarPositivos(numeros);
        qtdNegativos = contarNegativos(numeros);
        qtdNulos = contarNulos(numeros);
        qtdPares = contarPares(numeros);
        qtdImpares = contarImpares(numeros);
        System.out.println("A media dos valores = " + media + "\n"
            + "A quantidade de numeros positivos = " + qtdPositivos + "\n"
            + "A quantidade de numeros negativos = " + qtdNegativos + "\n" 
            + "A quantidade de numeros pares = " + qtdPares + "\n" 
            + "A quantidade de numeros impares = " + qtdImpares + "\n" 
            + "A quantidade de numeros nulos = " + qtdNulos + "\n");
    }
    public static int lerInteiro(String mensagem) {
        int valor;
        System.out.println(mensagem);
        valor = entrada.nextInt();
        return valor;
    }
    public static int[] preencherVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        System.out.println("Digite os valores:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }
    public static float calcularMedia(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return (float) soma / numeros.length;
    }
    public static int contarPositivos(int[] numeros) {
        int nPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] > 0) {
                nPositivos++;
             }
    }
    return nPositivos;
}
    public static int contarNegativos(int[] numeros) {
        int nNegativos = 0;
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                nNegativos++;
            }
        }
        return nNegativos;
    }
    public static int contarNulos(int[] numeros) {
        int nNulos = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 0) {
                nNulos++;
            }
        }
        return nNulos;
    }
    public static int contarPares(int[] numeros) {
        int nPares = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                nPares++;
            }
        }
        return nPares;
    }
    public static int contarImpares(int[] numeros) {
        int nImpares = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 != 0) {
                nImpares++;
            }
        }
        return nImpares;
    }
}