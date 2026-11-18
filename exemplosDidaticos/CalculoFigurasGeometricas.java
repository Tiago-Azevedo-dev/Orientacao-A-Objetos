package exemplosDidaticos;
import java.util.Scanner;
public class CalculoFigurasGeometricas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o solido geometrico:\n"
            + "1 - Esfera\n"
            + "2 - Cilindro\n"
            + "3 - Cone\n"
            + "4 - Prisma triangular\n"
            + "5 - Prisma quadrangular\n"
            + "6 - Prisma hexagonal");
        int escolha = entrada.nextInt();
        switch(escolha) {
            case 1: {
               System.out.println("Qual o valor do raio do semicirculo?"); 
               float raio = entrada.nextFloat();
               float perimetro = calcularPerimetroSemiCirculo(raio);          
               float area = calcularAreaSemiCirculo(raio);               \\Area da esfera eh igual a 8 vezes a area do semicirculo\\
               float areaTotal = calcularAreaTotalEsfera(area);
               float volume = calcularVolumeEsfera(raio);
               imprimirRespostas(perimetro, area, areaTotal, volume);
            }
            case 2: {
               System.out.println("Qual o valor da base?");
               float base = entrada.nextFloat();
               System.out.println("Qual o valor da altura?");
               float altura = entrada.nextFloat();
               float perimetro = calcularPerimetroRetangulo(base, altura);
               float area = calcularAreaRetangulo(base, altura);
               float areaTotal = calcularAreaTotalCilindro();
               float volume = calcularVolumeCilindro(area); 
               imprimirRespostas(perimetro, area, areaTotal, volume);
               
            }
            case 3: {
                System.out.println("Qual o valor da base do triangulo retangulo?");
                float base = entrada.nextFloat();
                System.out.println("Qual o valor da altura do triangulo retangulo?");
                float altura = entrada.nextFloat();
                float perimetro = calcularPeimetroTrianguloRetangulo(base, altura);
                float area = calcularAreaTrianguloRetangulo(base, altura);
                float areaTotal = calcularAreaTotalCone(base, altura);
                flaot volume = calcularVolumeCone(base, altura);
                imprimirRespostas(perimetro, area, areaTotal, volume);
            }
            case 4: {
                System.out.println("Qual o valor do lado do triangulo equilatero?");
                float lado = entrada.nextFloat();
                float perimetro = calcularPeimetroTrianguloEquilatero(lado);
                float area = calcularAreaTrianguloEquilatero(lado);
                float areaTotal = calcularAreaTotalPrismaTrianguloEquilatero(area. lado);
                flaot volume = calcularVolumePTrianguloEquilatero();
                imprimirRespostas(perimetro, area, areaTotal, volume);
            }
            case 5: {

            }
            case 6: {

            }
        }    
    }
}