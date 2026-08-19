package aula03.exercicios;
import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a figura geometrica desejada\n"
         + "1 - Circulo\n"
         + "2 - Quadrado\n"
         + "3 - Retangulo\n" 
         + "4 - Trapezio\n"
         + "5 - Triangulo");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1: {
            System.out.println("Qual o valor do Raio?");
            float Raio = entrada.nextFloat();
            float area = calcularAreaCirculo(Raio);
            float perimetro = calcularPerimetroCirculo(Raio);
            System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);
                break;
            }
            case 2: {
            System.out.println("Qual o valor do lado?");
            float lado = entrada.nextFloat();
            float area, perimetro;
            area = calcularAreaQuadrado(lado);
            perimetro = calcularPerimetroQuadrado(lado);
            System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);
                break;
            }
            case 3: {
            System.out.println("Qual o valor da base?");
            float base = entrada.nextFloat();
            System.out.println("Qual o valor da altura?");
            float altura = entrada.nextFloat();
            float area, perimetro;
            area = calcularAreaRetangulo(base, altura);
            perimetro = calcularPerimetroRetangulo(base, altura);
            System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);
                break;
            }
            case 4: {
            System.out.println("Qual o valor da base maior?");
            float baseMaior = entrada.nextFloat();
            System.out.println("Qual o valor da base menor?");
            float baseMenor = entrada.nextFloat();
            System.out.println("Qual o valor da altura?");
            float altura = entrada.nextFloat();
            System.out.println("Quais os valores dos lados?");
            float lado1 = entrada.nextFloat();
            float lado2 = entrada.nextFloat();
            float area = calcularAreaTrapezio(baseMaior, baseMenor, altura);
            float perimetro = calcularPerimetroTrapezio(baseMaior, baseMenor, lado1, lado2);    
            System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);
                break;
            }
            case 5: {
            System.out.println("Qual o valor dos lados?");
            float l1 = entrada.nextFloat();
            float l2 = entrada.nextFloat();
            float l3 = entrada.nextFloat();
            boolean formaTriangulo = checarTriangulo(l1, l2, l3);
            if (formaTriangulo == true)
            {boolean trianguloRetangulo = checarTrianguloRetangulo(l1, l2, l3);
                if (trianguloRetangulo == true) {
                    float area = calcularAreaTrianguloRetangulo(l1, l2, l3);
                    float perimetro = calcularPerimetroTriangulo(l1, l2, l3);
                    System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);               
                }
                else {
                    float area = calcularAreaTriangulo(l1, l2, l3);
                    float perimetro = calcularPerimetroTriangulo(l1, l2, l3);
                    System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);                
                }
            }    
            else {
                System.out.println("Esses lados nao formam um triangulo");                
            }    
        }
            }    
        entrada.close();
        }
    static float calcularAreaCirculo(float raio) {
        return (float) (Math.PI * Math.pow(raio, 2));
    }    
    static float calcularPerimetroCirculo(float raio) {
        return (float) (2 * Math.PI * raio);
    }
    static float calcularAreaQuadrado(float lado) {
        return (float) (Math.pow(lado, 2));
    }
    static float calcularPerimetroQuadrado(float lado) {
        return (float) (4 * lado);
    }
    static float calcularAreaRetangulo(float base, float altura) {
        return (float) (base * altura);
    }
    static float calcularPerimetroRetangulo(float base, float altura) {
        return (float) (2 * base + 2 * altura);
    }
    static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
        return (float) ((baseMaior + baseMenor) * altura / 2);
    }
    static float calcularPerimetroTrapezio(float baseMaior, float baseMenor, float lado1, float lado2) {
        return (float) (baseMaior + baseMenor + lado1 + lado2);
    }
    static boolean checarTriangulo(float l1, float l2, float l3) {
        return l1 > 0 && l2 > 0 && l3 > 0
        && l1 + l2 > l3
        && l1 + l3 > l2
        && l2 + l3 > l1;
    }
    static float calcularAreaTriangulo(float l1, float l2, float l3) {
        float s = (l1 + l2 + l3) / 2;
        return (float) (Math.sqrt(s*(s-l1)*(s-l2)*(s-l3)));
    }
    static float calcularPerimetroTriangulo(float l1, float l2, float l3) {
        return (float) (l1 + l2 + l3);
    }
    static float calcularAreaTrianguloRetangulo(float l1, float l2, float l3) {
        float cateto1;
        float cateto2;
        if (l1 > l2 && l1 > l3) {
            cateto1 = l2;
            cateto2 = l3;
        }
        else if (l2 > l1 && l2 > l3) {
            cateto1 = l1;
            cateto2 = l3;
        }
        else {
            cateto1 = l1;
            cateto2 = l2;
        }
        return (cateto1 * cateto2) / 2;

    }
    static boolean checarTrianguloRetangulo(float l1, float l2, float l3) {
        float maior = Math.max(l1, Math.max(l2, l3));
        float somaQuadrados = l1 * l1 + l2 * l2 + l3 * l3 - maior * maior;
        return maior * maior == somaQuadrados;
    }
    }    
