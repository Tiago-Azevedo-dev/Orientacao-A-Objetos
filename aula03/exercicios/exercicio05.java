package aula02.exercicios;
import java.util.Scanner;
public class exercicios05 {
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
            float area = calcularAreaTrapezio(baseMaior, baseMenor, altura);
            float perimetro = calcularPerimetroTrapezio(baseMaior, baseMenor, altura);    
            System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);
            }
            case 5: {
            System.out.println("Qual o valor dos lados?");
            float L1 = entrada.nextFloat();
            float L2 = entrada.nextFloat();
            float L3 = entrada.nextFloat();
            boolean formaTriangulo = checarTriangulo(L1, L2, L3);
            if (formaTriangulo == true)
            {boolean TrianguloRetangulo = ChecarTrianguloRetangulo(L1, L2, L3);
                if (TrianguloRetangulo == true) {
                    float area = AreaTrianguloRetangulo(L1, L2, L3);
                    float perimetro = PerimetroTriangulo(L1, L2, L3);
                    System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);               
                }
                else {
                    float area = AreaTriangulo(L1, L2, L3);
                    float perimetro = PerimetroTriangulo(L1, L2, L3);
                    System.out.println("area = " + area + "\n" 
                + "perimetro = " + perimetro);                
                }
            }    
            else {
                System.out.println("Esses lados nao formam um triangulo");                
            }    
        }
            }    

        }
    entrada.close();    
    }    
}